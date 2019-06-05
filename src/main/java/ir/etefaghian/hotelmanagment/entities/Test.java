package ir.etefaghian.hotelmanagment.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.ColumnDefault;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Test {
    @Id
    @GeneratedValue
    private Long id;

    @Column(length = 100)
    private String fName;

    @Column(length = 100)
    private String lName;

    //@Column(columnDefinition = "tinyint DEFAULT 18")
    private int age=18;


}
