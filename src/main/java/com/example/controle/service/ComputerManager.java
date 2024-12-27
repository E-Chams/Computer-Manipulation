package com.example.controle.service;

import com.example.controle.dao.entities.Computer;
import com.example.controle.dao.repositories.ComputerRepository;
import com.example.controle.dto.ComputerDto;
import com.example.controle.mapper.ComputerMapper;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class ComputerManager implements ComputerService{

    private ComputerRepository computerRepository;

    private ComputerMapper computerMapper;



    @Override
    public ComputerDto saveComputer(ComputerDto computerDto) {
        Computer computer = computerMapper.fromComputerDtoToComputer(computerDto);
        computer = computerRepository.save(computer);
        computerDto = computerMapper.fromComputerToComputerDto(computer);
        return  computerDto;
    }
    @Override
    public List<ComputerDto> getComputerByProce(String proce) {
        List<Computer> computers = computerRepository.findByProce(proce);
        List<ComputerDto> computerDtos = new ArrayList<>();
        for(Computer computer : computers){
            computerDtos.add(computerMapper.fromComputerToComputerDto(computer));
        }
        return computerDtos;
    }



}
