package ir.etefaghian.hotelmanagment.repositories;

import ir.etefaghian.hotelmanagment.entities.MyEntity;
import org.springframework.data.jpa.repository.JpaRepository;


public interface MyEntityRepository extends JpaRepository<MyEntity,Long> {
}
