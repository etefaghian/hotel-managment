package ir.etefaghian.hotelmanagment.repositories;

import ir.etefaghian.hotelmanagment.entities.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface HotelRepository extends JpaRepository<Hotel,Long> {
}
