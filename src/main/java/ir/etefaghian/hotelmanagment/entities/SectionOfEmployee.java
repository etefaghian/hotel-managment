package ir.etefaghian.hotelmanagment.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.util.Set;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class SectionOfEmployee extends  BaseEntity {

    private String name;

    @OneToOne
    private Employee boss;

    @OneToMany(mappedBy = "section")
    private Set<Employee> employees;

    private String description;

}
