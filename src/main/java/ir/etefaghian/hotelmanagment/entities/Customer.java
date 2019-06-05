package ir.etefaghian.hotelmanagment.entities;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import java.util.Set;

@Entity
@AllArgsConstructor
@Builder
@Data
@NoArgsConstructor
public class Customer extends  Person {

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "customer")
    private Set<Dependent> dependents;




}
