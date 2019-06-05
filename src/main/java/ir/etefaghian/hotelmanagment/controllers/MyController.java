package ir.etefaghian.hotelmanagment.controllers;

import ir.etefaghian.hotelmanagment.entities.MyEntity;
import ir.etefaghian.hotelmanagment.repositories.MyEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.hateoas.Resource;
import org.springframework.hateoas.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@RepositoryRestController
public class MyController {
    @Autowired
    private MyEntityRepository repository;


    @GetMapping("/api/controller")
    public ResponseEntity<Resource> myController()
    {
       Iterable<MyEntity> entity = repository.findAll();
       Resource<Iterable<MyEntity>> resource = new Resource<>(entity);


        return  null;
    }





}
