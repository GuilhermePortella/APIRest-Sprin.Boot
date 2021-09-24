package com.br.Payroll;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;

/**
 *
 * @author Guilherme
 */

@Configuration
class LoadDatabase {
    
    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);
    
    @Bean
    CommandLineRunner initDatabase(EmployeeRepository repository) {
        return args -> {
            log.info("Preloading " + repository.save(new Employee("Bildo Baggins", "burglar")));
            log.info("Preloading " + repository.save(new Employee("Frodo Baggins", "thief")));
        };
    }
    
}
