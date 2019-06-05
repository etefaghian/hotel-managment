package ir.etefaghian.hotelmanagment.services;

import ir.etefaghian.hotelmanagment.configurations.FileStorageProperties;
import org.springframework.core.io.FileUrlResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.core.io.UrlResource;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.net.MalformedURLException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

@Service
public class ImageStorageService {

    private final Path dirPath;

    public ImageStorageService(FileStorageProperties properties)
    {
        dirPath = Paths.get(properties.getUploadDir())
                .toAbsolutePath()
                .normalize();

        try {
            Files.createDirectories(dirPath);
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }

    public String storeFile(MultipartFile file)
    {
        String fileName;
        fileName = StringUtils.cleanPath(file.getOriginalFilename());
        try
        {
            if (fileName.contains("..")) throw new FileStorageException("file name is invalid");
            Path targetPath =  this.dirPath.resolve(fileName);
            Files.copy(file.getInputStream(),targetPath, StandardCopyOption.REPLACE_EXISTING);
            return fileName;
        }
        catch (Exception e)
        {

        }
            return null;
    }


    public Resource loadFileAsResource(String name)
    {

        Path requestedPath = dirPath.resolve(name);
        try {
            Resource  resource = new UrlResource(requestedPath.normalize().toUri());
            if(resource.exists()) return  resource;
            else throw new FileNotFoundException("file not found: " +name);


        } catch (MalformedURLException e) {
            e.printStackTrace();
        }


        return null;
    }



}
