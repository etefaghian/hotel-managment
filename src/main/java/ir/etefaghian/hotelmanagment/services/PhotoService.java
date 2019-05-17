package ir.etefaghian.hotelmanagment.services;

import ir.etefaghian.hotelmanagment.entity.Photo;
import ir.etefaghian.hotelmanagment.repositories.PhotoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.web.multipart.MultipartFile;
import sun.tools.jar.CommandLine;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PhotoService {

    private final String BASE_PATH = "resources/static1/photos";

    private ResourceLoader resourceLoader;
    private  PhotoRepository   repository;

    public  PhotoService(ResourceLoader   resourceLoader, PhotoRepository repository)
    {
        this.repository =  repository;
        this.resourceLoader = resourceLoader;
    }

    public Resource getPhoto(String name)
    {

       return resourceLoader.getResource(BASE_PATH+"/"+name);

    }

    public void createPhoto(MultipartFile  file)
    {
        Photo photo = repository.save(Photo.builder().name(file.getOriginalFilename()).build());


        try {
            Files.copy(file.getInputStream(),Paths.get(BASE_PATH+"/"+photo.getId()+file.getOriginalFilename()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }





    @Bean
    CommandLineRunner setup()
    {
        return  args -> {
            Files.createDirectory(Paths.get(BASE_PATH));
        };
    }


}
