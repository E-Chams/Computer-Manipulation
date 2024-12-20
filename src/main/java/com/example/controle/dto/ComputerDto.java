package com.example.controle.dto;

import jakarta.persistence.Entity;
import lombok.*;


@AllArgsConstructor
@Data
@NoArgsConstructor
@Getter
@Setter
@Builder

public class ComputerDto {
    String proce;
    String ram;
    String hardDrive;
    double price;
    String macAddress;
}
