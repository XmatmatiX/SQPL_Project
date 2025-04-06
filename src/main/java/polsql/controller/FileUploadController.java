package polsql.controller;

import io.micrometer.common.lang.NonNull;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import polsql.domain.FileUploadResponse;
import polsql.service.FileUploadService;

import static polsql.controller.FileUploadController.UPLOAD_URL;

@Controller
@RequestMapping(UPLOAD_URL)
public class FileUploadController {
    public static final String UPLOAD_URL = "/upload";
    private final FileUploadService fileUploadService;

    public FileUploadController(final FileUploadService fileUploadService) {
        this.fileUploadService = fileUploadService;
    }

    @PostMapping
    @Validated
    public FileUploadResponse handleFileUpload(@RequestParam("file") @NonNull MultipartFile file) {
        return fileUploadService.processFile(file);
    }
}
