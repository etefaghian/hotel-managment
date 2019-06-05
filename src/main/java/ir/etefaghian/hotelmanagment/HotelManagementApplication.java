package ir.etefaghian.hotelmanagment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.web.JsonPath;

@SpringBootApplication
@EnableJpaAuditing

@EntityScan(basePackages = {"ir.etefaghian.hotelmanagment.entities"})

public class HotelManagementApplication {

    public static void main(String[] args) {
        SpringApplication.run(HotelManagementApplication.class, args);

    }

}
