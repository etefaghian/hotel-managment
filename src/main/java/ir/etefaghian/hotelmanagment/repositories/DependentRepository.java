package ir.etefaghian.hotelmanagment.repositories;

import ir.etefaghian.hotelmanagment.entities.Dependent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface DependentRepository extends JpaRepository<Dependent,Long> {
}
