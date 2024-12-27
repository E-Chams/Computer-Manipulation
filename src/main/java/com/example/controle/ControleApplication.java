package com.example.controle;


import com.example.controle.dao.entities.Computer;
import com.example.controle.dao.repositories.ComputerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class ControleApplication {

    public static void main(String[] args) {
        SpringApplication.run(ControleApplication.class, args);
    }
    @Bean

    CommandLineRunner start(ComputerRepository computerRepository){
        return args -> {
            computerRepository.saveAll(
                    List.of(

                            Computer.builder().proce("Processor1").price(25600).build(),
                            Computer.builder().proce("Processor2").price(25600).build(),
                            Computer.builder().proce("Processor3").price(25600).build(),
                            Computer.builder().proce("Processor4").price(25600).build()



                            )
            );
        };
    }

}
