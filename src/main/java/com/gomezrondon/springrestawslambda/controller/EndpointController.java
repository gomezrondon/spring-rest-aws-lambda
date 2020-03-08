package com.gomezrondon.springrestawslambda.controller;

import com.gomezrondon.springrestawslambda.entitie.Employee;
import com.gomezrondon.springrestawslambda.service.EmployeeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import java.time.LocalDateTime;
import java.util.List;

@RestController
@Slf4j
public class EndpointController {

    private final EmployeeService service;

    public EndpointController(EmployeeService service) {
        this.service = service;
    }

    @GetMapping("/time")
    public String forTesting() {
        String time = LocalDateTime.now().toString();
        log.info("Login time requested: "+time);
        return time;
    }

    @GetMapping("/employees")
    public List<Employee> getAllEmployees() {
        List<Employee> list = service.getAllEmployees();
        return list;
    }

    @GetMapping("/employees/lastname/{name}")
    public List<Employee> findByLastName(@PathVariable String name){
        List<Employee> list = service.findByLasName(name);
          return list;
    }

    @PutMapping("/employees")
    public Employee saveEmployee(@RequestBody Employee employee){

        Employee save = service.save(new Employee(employee.getFirstName(),employee.getLastName()));

        return save;
    }




}
