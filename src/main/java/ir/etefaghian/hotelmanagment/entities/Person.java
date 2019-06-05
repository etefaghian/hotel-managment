package ir.etefaghian.hotelmanagment.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Inheritance(strategy =  InheritanceType.TABLE_PER_CLASS)
@AllArgsConstructor
@NoArgsConstructor
 class Person extends  BaseEntity {

    private String firstName;

    private String lastName;

    @Column(unique = true )
    private Long nationCode;

    private LocalDate birthDate;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    private String address;

    private Long telephone;

    private String country;






}
