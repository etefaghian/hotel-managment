package ir.etefaghian.hotelmanagment.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@AllArgsConstructor
@Entity
@Data
@Builder
public class Transaction extends  BaseEntity {

    @ManyToOne
    private  Customer customer;

    private Long amount;



}
