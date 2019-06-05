package ir.etefaghian.hotelmanagment.repositories;


import ir.etefaghian.hotelmanagment.entities.SectionOfEmployee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface SectionOfEmployeeRepository extends JpaRepository<SectionOfEmployee,Long> {
}
