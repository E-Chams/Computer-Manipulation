package com.example.controle.mapper;

import com.example.controle.dao.entities.Computer;
import com.example.controle.dto.ComputerDto;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class ComputerMapper {
    private final ModelMapper modelMapper = new ModelMapper();
    public ComputerDto fromComputerToComputerDto(Computer computer){return modelMapper.map(computer, ComputerDto.class);}
    public Computer fromComputerDtoToComputer(ComputerDto computerDto){return modelMapper.map(computerDto, Computer.class);}


}
