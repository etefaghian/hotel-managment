package ir.etefaghian.hotelmanagment.controllers;
import ir.etefaghian.hotelmanagment.services.ImageStorageService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@Slf4j
@RequestMapping("/upload-file")
public class ImageUploadController
{
    private final ImageStorageService imageStorageService;

    public ImageUploadController(ImageStorageService imageStorageService) {
        this.imageStorageService = imageStorageService;
    }


    @PostMapping
    public ResponseEntity<String> uploadFile(@RequestParam("image") MultipartFile file)
    {
        String name = imageStorageService.storeFile(file);

        return ResponseEntity.ok().body(name);
    }

}
