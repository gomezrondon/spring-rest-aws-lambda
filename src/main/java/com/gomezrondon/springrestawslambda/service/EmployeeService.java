package com.gomezrondon.springrestawslambda.service;


import com.gomezrondon.springrestawslambda.entitie.Employee;
import com.gomezrondon.springrestawslambda.repository.EmployeeRepository;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;


@Service
public class EmployeeService {

    private final EmployeeRepository repository;

    public EmployeeService(EmployeeRepository repository) {
        this.repository = repository;
    }

    public List<Employee> getAllEmployees() {
        return repository.findAll();
    }

    public Employee save(Employee employee){
      //  repository.save(employee);
        Employee save = repository.save(employee);

        return save;
    }

    public List<Employee> findByLasName(String name) {
       List<Employee> empl = repository.findAllByLastName(name);

        return empl;
    }

}
