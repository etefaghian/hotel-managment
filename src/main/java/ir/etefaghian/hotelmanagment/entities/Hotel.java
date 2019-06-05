package ir.etefaghian.hotelmanagment.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@AllArgsConstructor
@Builder
public class Hotel extends  BaseEntity {

    private String name;
    private String address;
    private Long telephone;


}
