package hu.eteo.ks.app.controller.config;

import hu.eteo.ks.service.StudentService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("test")
public class ConfigRun {

    @Bean
    @Primary
    public StudentService init(){
        return new ConfigImpl();
    }
}
