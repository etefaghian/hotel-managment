package ir.etefaghian.hotelmanagment.controllers;

import ir.etefaghian.hotelmanagment.services.ImageStorageService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@RestController
@RequestMapping("download-file")
@Slf4j
public class ImageDownloadController {

    private final  ImageStorageService imageStorageService;

    public ImageDownloadController(ImageStorageService imageStorageService) {
        this.imageStorageService = imageStorageService;
    }


    @GetMapping("/{name:.+}")
    public ResponseEntity<Resource> downloadFile(@PathVariable("name") String name, HttpServletRequest request)
    {
        Resource resource = imageStorageService.loadFileAsResource(name);
        String contentType = null;
        try
        {
            contentType = request.getServletContext().getMimeType(resource.getFile().getAbsolutePath());
        }
        catch(IOException e)  { e.printStackTrace(); }

        if (contentType == null) contentType = "application/octet-stream";
        return ResponseEntity.ok().contentType(MediaType.parseMediaType(contentType))
                .header(HttpHeaders.CONTENT_DISPOSITION,"attachment; filename=\"" + resource.getFilename() + "\"")
                .body(resource);

    }

}
