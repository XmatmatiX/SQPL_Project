package polsql.domain;

import org.apache.catalina.connector.Response;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;

public class FileUploadResponse extends ResponseEntity {
    public FileUploadResponse(HttpStatusCode status) {
        super(status);
    }

    public FileUploadResponse(Object body, HttpStatusCode status) {
        super(body, status);
    }

    public FileUploadResponse(MultiValueMap headers, HttpStatusCode status) {
        super(headers, status);
    }

    public FileUploadResponse(Object body, MultiValueMap headers, int rawStatus) {
        super(body, headers, rawStatus);
    }

    public FileUploadResponse(Object body, MultiValueMap headers, HttpStatusCode statusCode) {
        super(body, headers, statusCode);
    }
}
