package polsql.controller;

import io.micrometer.common.lang.NonNull;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.core.io.Resource;
import org.springframework.http.ContentDisposition;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import polsql.service.FileUploadService;

@Controller
@RequestMapping(FileUploadController.UPLOAD_URL)
public class FileUploadController {
    public static final String UPLOAD_URL = "/upload";
    private final FileUploadService fileUploadService;
    public FileUploadController(final FileUploadService fileUploadService) {
        this.fileUploadService = fileUploadService;
    }

    @PostMapping
    @Validated
    public ResponseEntity<Resource> handleFileUpload(
            @RequestParam("file") @NonNull MultipartFile file,
            @RequestParam("template") @NonNull String template
    ) {
        byte[] data = fileUploadService.processFile(file, template);
        ByteArrayResource resource = new ByteArrayResource(data);

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
        headers.setContentDisposition(
                ContentDisposition.attachment().filename("converted.sql").build()
        );

        return ResponseEntity.ok()
                .headers(headers)
                .body(resource);
    }

    @PostMapping("/convert")
    @ResponseBody
    public ResponseEntity<Resource> convertCode(
            @RequestParam("code") @NonNull String code,
            @RequestParam("template") @NonNull String template
    ) {
        byte[] data = fileUploadService.convertCode(code, template);
        ByteArrayResource resource = new ByteArrayResource(data);

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.TEXT_PLAIN);
        headers.setContentDisposition(
                ContentDisposition.attachment().filename("converted.sql").build()
        );

        return ResponseEntity.ok()
                .headers(headers)
                .body(resource);
    }
}
