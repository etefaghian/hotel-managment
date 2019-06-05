package ir.etefaghian.hotelmanagment.entities;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@AllArgsConstructor
@Builder
public class Employee extends  Person {

    private String typeOfContract;

    private LocalDate beginContractDate;

    private LocalDate endContractDate;

    @ManyToOne
    private SectionOfEmployee section;


}
