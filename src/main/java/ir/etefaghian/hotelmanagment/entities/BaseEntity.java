package ir.etefaghian.hotelmanagment.entities;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
@SequenceGenerator(initialValue = 1000,sequenceName = "sq1",allocationSize = 1,name = "sq1")
@Data
public class BaseEntity {
    @Id
    @GeneratedValue(generator = "sq1")
    private Long id;

    //avoid concurrency in update
    @Version
    @Column(nullable = false,columnDefinition = "integer default 0")
    private Integer version;

    @CreatedDate
    private LocalDate createdDate;

    @LastModifiedDate
    private LocalDate lastModifiedDate;




}
