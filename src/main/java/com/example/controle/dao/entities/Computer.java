package com.example.controle.dao.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@AllArgsConstructor
@Data
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Computer {
    @Id
    @GeneratedValue
    Long idPc;
    String proce;
    String ram;
    String hardDrive;
    double price;
    String macAddress;
}
