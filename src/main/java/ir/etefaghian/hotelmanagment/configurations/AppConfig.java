package ir.etefaghian.hotelmanagment.configurations;

import ir.etefaghian.hotelmanagment.entities.Employee;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.core.mapping.RepositoryDetectionStrategy;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.data.rest.*;

@Configuration
public class AppConfig
{



    @Bean
    @Profile("dev")
    public CommandLineRunner commandLineRunner()
    {
        return (args1 -> {



        });
    }

 /*   @Bean
    public RepositoryRestConfigurer repositoryRestConfigurer()
    {
        return new RepositoryRestConfigurer() {
            @Override
            public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
                config.setBasePath("/api")
                        .setReturnBodyOnCreate(true)
                        .setReturnBodyOnUpdate(true)
                        .setRepositoryDetectionStrategy(RepositoryDetectionStrategy.RepositoryDetectionStrategies.DEFAULT);
            }
        };
    }

*/

}
