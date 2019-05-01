package com.gomezrondon.springrestawslambda.controller;

import com.gomezrondon.springrestawslambda.entitie.Employee;
import com.gomezrondon.springrestawslambda.service.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
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

    @PutMapping("/employee")
    public Employee saveEmployee(@RequestBody Employee employee){
        Employee emp = employee;
        System.out.println("employee :"+emp.toString()+" Was created");
        return emp;
    }

    @PutMapping("/v2/employee")
    public Employee saveEmployeeV2(@RequestBody Employee employee){
        String time = LocalDateTime.now().toString();
        employee.setLocation(time);
        Employee emp = employee;
        System.out.println("employee :"+emp.toString()+" Was created At:"+time);
        return emp;
    }


}
