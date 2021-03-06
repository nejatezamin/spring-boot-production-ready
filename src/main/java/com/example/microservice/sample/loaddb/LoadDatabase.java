//package com.example.microservice.sample.loaddb;
//
//import com.example.microservice.sample.entity.EmployeeEntity;
//import com.example.microservice.sample.repository.EmployeeRepository;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//public class LoadDatabase {
//
//    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);
//
//    @Bean
//    CommandLineRunner initDatabase(EmployeeRepository repository) {
//
//        return args -> {
//            log.info("Preloading " + repository.save(new EmployeeEntity("Bilbo Baggins", "burglar")));
//            log.info("Preloading " + repository.save(new EmployeeEntity("Frodo Baggins", "thief")));
//        };
//    }
//}
