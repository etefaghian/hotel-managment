package ir.etefaghian.hotelmanagment.repositories;

import ir.etefaghian.hotelmanagment.entities.Test;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;

@RepositoryRestResource

public interface TestRepository extends JpaRepository<Test,Long> {


    @RestResource(path = "age",rel = "age")
    public List<Test> findByAge(int age);
}
