package com.example.controle.web;

import com.example.controle.dto.ComputerDto;
import com.example.controle.service.ComputerService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;
@AllArgsConstructor
@Controller
public class ComputerController {

    private ComputerService computerService;

    @MutationMapping
    public ComputerDto saveComputer(@Argument ComputerDto computerDto){return  computerService.saveComputer(computerDto);}


    @QueryMapping
    public List<ComputerDto> getComputerByProce(@Argument String proce){
        return computerService.getComputerByProce( proce);
    }
}
