package ir.etefaghian.hotelmanagment.entities;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.time.LocalDate;


@AllArgsConstructor
@Entity
@Data
@Builder

public class Reservation extends BaseEntity {

    @ManyToOne
    private Customer customer;

    @ManyToOne
    private Room room;

    private LocalDate beginDate;
    private LocalDate endDate;





}
