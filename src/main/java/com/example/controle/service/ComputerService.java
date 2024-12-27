package com.example.controle.service;
import com.example.controle.dto.ComputerDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ComputerService {
    public List<ComputerDto> getComputerByProce(String proce);
    public ComputerDto saveComputer(ComputerDto computerDto);

    }
