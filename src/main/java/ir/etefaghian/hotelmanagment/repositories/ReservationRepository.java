package ir.etefaghian.hotelmanagment.repositories;

import ir.etefaghian.hotelmanagment.entities.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ReservationRepository extends JpaRepository<Reservation,Long> {
}
