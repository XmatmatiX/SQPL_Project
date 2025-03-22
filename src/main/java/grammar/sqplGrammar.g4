grammar sqplGrammar;

// wykonuje dowolną ilość polskich komend
prog: (command SEMI)* EOF;

command
    : select
    | update_item
    | insert
    | delete_item
    | create_table
    | describe_table
    | update_table
    | delete_table
    | create_db
    | drop_db
    ;

//możliwości komendy select
//1)  pokaż     wszystkie dane    z tabeli    towar
//1) SELECT           *             FROM      towar
//2)  pokaż    ID, Nazwa     z tabeli    towar   gdzie    ilość >= 5
//2) SELECT    ID, Nazwa       FROM      towar   WHERE    ilość >= 5
//3)  pokaż    Nazwa     z tabeli    towar    sortuj po   ilość   malejąco
//3) SELECT    Nazwa        FROM     towar     ORDER BY   ilość     DESC
//4)  pokaż    Nazwa    z tabeli    towar    gdzie ilość > 5    sortuj po nazwa rosnąco
//4) SELECT    Nazwa       FROM     towar    WHERE ilość > 5    ORDER BY nazwa ASC
select
    : SELECT columns FROM ID  #select_items
    | SELECT columns FROM ID where #select_where_items
    | SELECT columns FROM ID order_by #select_order_items
    | SELECT columns FROM ID where order_by #select_where_order_items
    ;

//możliwości komendy update dla elementu tabeli
// aktualizuj   towar    ustaw    ilość = 5 i cena = 15.50    gdzie ID == 6
//   UPDATE     towar     SET     ilość = 5, cena = 15.50     WHERE ID = 6
update_item
    : UPDATE ID SET equation ('i'? equation)* where
    ;

//wstawianie nowego elementu do tablicy
// wstaw do tabeli    towar    obiekty   (id, nazwa, cena, ilość)    o wartościach     (1, "jajka", 0.50, 20), (...)
//   INSERT INTO      towar              (id, nazwa, cena, ilość)        VALUES        (1, "jajka", 0.50, 20), (...)
insert
    : INSERT_INTO ID ('obiekt'|'obiekty') object VALUES object (',' object)*
    ;

//usuwanie elementów z tablicy
// usuń obiekt z tabeli    towar     gdzie id == 5
//       DELETE            towar     WHERE id = 5
delete_item
    : DELETE ID (where)?
    ;

//tworzenie nowej tabeli
//stwórz tabelę   towar (ID jako liczba całkowita klucz główny,   nazwa jako tekst nie puste,          cena jako liczba zmiennoprzecinkowa(10,2))
//CREATE TABLE    towar (ID INT PRIMARY KEY,                      nazwa VARCHAR(255) NOT NULL,         cena DOUBLE(10,2))
create_table
    : CREATE_TABLE ID definition
    ;

//pokazywanie danych o tabeli
// opisz tabelę    towar
//   DESCRIBE      towar
describe_table
    : DESCRIBE ID
    ;

//aktualizowanie danych tabeli
//1) aktualizuj tabelę    towar    dodaj kolumnę    cena   liczba całkowita    nie puste
//1)    ALTER TABLE       towar         ADD         cena         INT            NOT NULL
//2) zmień tabelę   towar   modyfikuj kolumnę    cena    liczba zmiennoprzecinkowa(10,2)
//2)  ALTER TABLE   towar         MODIFY         cena              DOUBLE(10,2)
//3) modyfikuj tabelę     towar    usuń kolumnę     cena
//3)    ALTER TABLE       towar    DROP COLUMN      cena
update_table
    : ALTER_TABLE ID ADD ID data_type constraints #add_column
    | ALTER_TABLE ID MODIFY ID data_type #modify_column
    | ALTER_TABLE ID DROP_COLUMN ID #drop_column
    ;

//usuwanie tabeli
// usuń tabelę    towar
// DROP TABLE     towar
delete_table
    : DELETE_TABLE ID
    ;

//tworzenie bazy danych
// stwórz bazę danych    sklep
//   CREATE DATABASE     sklep
create_db
    :  CREATE_DB ID
    ;

//usuwanie bazy danych
// usuń bazę danych    sklep
//   DROP DATABASE     sklep
drop_db
    : DROP_DB ID
    ;

//obsługa where
// w której/gdzie ID > 5 i ID < 15 i imie = "Jacek" -> Where ID > 5, ID < 15, imie = "Jacek"
where
    : WHERE condition (condition)*
    ;

//Kolejność wyświetlania (po konkretnej kolumnie lub kolumnach)
//sortuj po ID rosnąco i imie malejąco -> order by ID ASC, imie DESC
order_by
    : ORDER_BY (ID order  'i')* (ID order)?
    ;

order : (ASC|DESC)? ;

//używany w insert, ma na celu wskazać kolumny lub ich wartości
//(ID, imię, nazwisko) lub (6, "Michał", "Kaluska")
object
    : '(' (ID_COMMA)* ID ')' #object_template
    | '(' (value ',')* value ')' #object_instance
    ;

//określa nazwy, typy i ograniczenia kolumn w tabeli
//(ID jako liczba całkowita klucz główny nie puste, ...) -> (ID INT PRIMARY KEY NOT NULL, ...)
definition
    : '(' (ID AS data_type constraints ',')* ID AS data_type constraints ')'
    ;

//Wybór kolumn do pokazania (jeden lub więcej)
columns
    : ID+ #columns_without_coma
    | ID_COMMA+ ID #columns_with_coma
    | STAR #columns_star
    ;

//przypisywanie wartości dla konkretnej kolumny
// nazwa = "projekt"
equation : ID '=' value;

//Warunek do zapytania SQL
//ilość == 25
condition : logic_sign column_name=ID SIGN value;

//ograniczenia dla kolumn w tabelach
constraints : (PRIMARY_KEY|foreign_key|UNIQUE|NOT_NULL|default)*;


//operator logiczny do sortowania
logic_sign : (AND|OR|NOT)?;

//typy danych dla kolumn
data_type
    : 'tekst'   #text
    | 'tekst(' INT ')' #text
    | 'liczba całkowita' #int
    | 'liczba całkowita(' INT ')' #int
    | 'liczba zmiennoprzecinkowa' #double
    | 'liczba zmiennoprzecinkowa(' INT ',' INT ')' #double
    | 'znak' #char
    | 'bit' #bit
    | 'data' #date
    ;

value : (INT|DOUBLE|ID|TEXT);
//ograniczenie kolumny - domyślny typ danych
default : 'domyślnie ' value;
//ograniczenie kolumny - klucz obcy
foreign_key : 'klucz obcy dla ' ID '(' ID ')';

//SŁOWA KLUCZOWE//

//Podstawowe polecenia CRUD

SELECT : 'wybierz' | 'znajdź' | 'pokaż' | 'wyświetl';
CREATE : 'stwórz' | 'utwórz';
INSERT_INTO : 'wstaw do tabeli' | 'dodaj do tabeli' | 'wpisz do tabeli';
UPDATE : 'zmień' | 'podmień' | 'zaktualizuj' | 'aktualizuj' | 'popraw';
DELETE : 'usuń obiekt z tabeli' | 'usuń element z tabeli' | 'usuń obiekty z tabeli' | 'usuń elementy z tabeli';

CREATE_TABLE : 'dodaj tabelę' | 'stwórz tabelę' | 'utwórz tabelę';
DELETE_TABLE : 'usuń tabelę' | 'usuń';
DESCRIBE : 'opisz tabelę' | 'przedstaw tabelę';
ALTER_TABLE : 'modyfikuj tabelę' | 'aktualizuj tabelę' | 'zmień tabelę';

CREATE_DB : 'stwórz bazę danych' | 'utwórz bazę danych' ;
DROP_DB : 'usuń bazę danych';

SET : 'ustaw' | 'wpisz';
FROM : 'z' | 'z tabeli';
WHERE : 'gdzie' | 'w której' ;
ORDER_BY : 'sortuj po' | 'sortuj według' | 'sortuj' ;
ASC : 'rosnąco' ;
DESC : 'malejąco' ;
VALUES : 'o wartościach' | 'o danych';
ADD : 'dodaj kolumnę' | 'wstaw kolumnę';
MODIFY : 'modyfikuj kolumnę' | 'zmień kolumnę';
DROP_COLUMN : 'usuń kolumnę';
AS : 'jako';
SIGN : '>' | '<' | '==' | '>=' | '<=';

STAR : 'wszystko' | 'wszystkie elementy' | 'wszystkie dane';

PRIMARY_KEY : 'klucz główny';
UNIQUE : 'unikalny';
NOT_NULL: 'nie puste';

AND : 'i';
OR : 'lub';
NOT : 'nie';
//SEKCJA DANYCH OGÓLNYCH//

//Identyfikator np nazwy tabeli lub kolumny
ID : [a-zA-ZżźćńółęąśŻŹĆĄŚĘŁÓŃ_] [a-zA-ZżźćńółęąśŻŹĆĄŚĘŁÓŃ0-9_]*;

ID_COMMA : [a-zA-ZżźćńółęąśŻŹĆĄŚĘŁÓŃ_] [a-zA-ZżźćńółęąśŻŹĆĄŚĘŁÓŃ0-9_]* ',';
SEMI : ';';
DOUBLE : [0-9]+ '.' [0-9]+ ;
INT : [0-9]+ ;
TEXT : '"' ( ~["] | '""' )* '"' ;

//Pominięcie białych znaków
WS : [ \t\r\n]+ -> skip ;

