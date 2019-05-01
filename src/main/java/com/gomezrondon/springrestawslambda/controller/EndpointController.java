package com.gomezrondon.springrestawslambda.controller;

import com.gomezrondon.springrestawslambda.entitie.Employee;
import com.gomezrondon.springrestawslambda.service.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EndpointController {

    private final EmployeeService service;

    public EndpointController(EmployeeService service) {
        this.service = service;
    }


    @GetMapping("/employee/{name}")
    public List<Employee> findByLastName(@PathVariable String name){
        List<Employee> list = service.findByLasName(name);
          return list;
    }

}
