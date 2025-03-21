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
select
    : SELECT (columns | STAR) FROM ID  #select_items
    | SELECT (columns | STAR) FROM ID where #select_where_items
    | SELECT (columns | STAR) FROM ID order_by #select_order_items
    | SELECT (columns | STAR) FROM ID where order_by #select_where_order_items
    ;

//możliwości komendy update dla elementu tabeli
update_item
    : UPDATE ID SET equation ('i'? equation)* where
    ;

//wstawianie nowego elementu do tablicy
insert
    : INSERT_INTO ID ('obiekt'|'obiekty') object VALUES object (',' object)*
    ;

//usuwanie elementów z tablicy
delete_item
    : DELETE ID (where)?
    ;

//tworzenie nowej tabeli
create_table
    : CREATE_TABLE ID definition
    ;

describe_table
    : DESCRIBE ID
    ;

update_table
    : ALTER_TABLE ID ADD ID DATA_TYPE constraints #add_column
    | ALTER_TABLE ID MODIFY ID DATA_TYPE #modify_column
    | ALTER_TABLE ID DROP_COLUMN ID #drop_column
    ;

delete_table
    : DELETE_TABLE ID
    ;

create_db
    :  CREATE_DB ID
    ;

drop_db
    : DROP_DB ID
    ;



//obsługa where
// w której/gdzie ID > 5 i ID < 15 i imie = "Jacek" -> Where ID > 5, ID < 15, imie = "Jacek"
where
    : WHERE condition ('i' condition)*
    ;

//Kolejność wyświetlania (po konkretnej kolumnie lub kolumnach)
//sortuj po ID rosnąco i imie malejąco -> order by ID ASC, imie DESC
order_by
    : ORDER_BY (ID (ASC|DESC)?)+
    ;

object
    : '(' (ID_COMMA)* ID ')'
    | '(' ((INT|DOUBLE|ID|TEXT) ',')* (INT|DOUBLE|ID|TEXT) ')'
    ;

definition
    : '(' (ID AS DATA_TYPE constraints ',')* ID AS DATA_TYPE constraints ')'
    ;

//Wybór kolumn do pokazania (jeden lub więcej)
columns
    : ID+
    | ID_COMMA+ ID
    | ID_COMMA+ ID (('i'|'oraz') ID)
    ;

equation : ID '=' (INT|DOUBLE|ID|TEXT);

//Warunek do zapytania SQL
condition : ID SIGN (INT|DOUBLE|ID|TEXT);

constraints : (PRIMARY_KEY|FOREIGN_KEY|UNIQUE|NOT_NULL|DEFAULT)*;

//SŁOWA KLUCZOWE//

//Podstawowe polecenia CRUD

SELECT : 'wybierz' | 'znajdź' | 'pokaż' | 'wyświetl';
CREATE : 'stwórz' | 'utwórz';
INSERT_INTO : 'dodaj do tabeli' | 'wpisz do tabeli';
UPDATE : 'zmień' | 'podmień' | 'zaktualizuj' | 'aktualizuj' | 'popraw';
DELETE : 'usuń obiekty z tabeli' | 'usuń elementy z tabeli';

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
ASC : 'rosnąco' | 'alfabetycznie' ;
DESC : 'malejąco' ;
VALUES : 'o wartościach' | 'o danych';
ADD : 'dodaj kolumnę' | 'wstaw kolumnę';
MODIFY : 'modyfikuj kolumnę' | 'zmień kolumnę';
DROP_COLUMN : 'usuń kolumnę';
AS : 'jako';

SIGN : '>' | '<' | '==' | '>=' | '<=';

//Znaki szczególne
STAR : 'wszystko' | 'wszystkie elementy' | 'wszystkie dane';

DATA_TYPE : 'tekst'
        | 'tekst(' INT ')'
        | 'liczba całkowita'
        | 'liczba całkowita(' INT ')'
        | 'liczba zmiennoprzecinkowa'
        | 'liczba zmiennoprzecinkowa(' INT ',' INT ')'
        | 'znak'
        | 'bit'
        | 'data'
        ;

PRIMARY_KEY : 'klucz główny';
UNIQUE : 'unikalny';
NOT_NULL: 'nie zero';
DEFAULT : 'domyślnie ' (INT|DOUBLE|ID|TEXT);
FOREIGN_KEY : 'klucz obcy dla ' ID '(' ID ')';
//SEKCJA DANYCH OGÓLNYCH//

//Identyfikator np nazwy tabeli lub kolumny
ID : [a-zA-ZżźćńółęąśŻŹĆĄŚĘŁÓŃ_] [a-zA-ZżźćńółęąśŻŹĆĄŚĘŁÓŃ0-9_]*;

ID_COMMA : [a-zA-ZżźćńółęąśŻŹĆĄŚĘŁÓŃ_] [a-zA-ZżźćńółęąśŻŹĆĄŚĘŁÓŃ0-9_]* ',';
SEMI : ';';
DOUBLE : [0-9]+ (','|'.') [0-9]+ ;
INT : [0-9]+ ;
TEXT : '"' ( ~["] | '""' )* '"' ;
//Dowolny ciąg znaków
//STRING : [a-zA-ZżźćńółęąśŻŹĆĄŚĘŁÓŃ][a-zA-ZżźćńółęąśŻŹĆĄŚĘŁÓŃ0-9_]*;

//Pominięcie białych znaków
WS : [ \t\r\n]+ -> skip ;

