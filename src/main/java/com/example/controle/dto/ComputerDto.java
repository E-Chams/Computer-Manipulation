package com.example.controle.dto;

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
