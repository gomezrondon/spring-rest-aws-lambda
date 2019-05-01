package com.gomezrondon.springrestawslambda.service;


import com.gomezrondon.springrestawslambda.entitie.Employee;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;


@Service
public class EmployeeService {


    public void save(Employee employee){
      //  repository.save(employee);
        System.out.println(">>>> SAVED >>>>> "+employee.toString());
    }

    public List<Employee> findByLasName(String name) {
       // List<Employee> empl = repository.findByLastName(lastName);
        List<Employee> empl = new ArrayList<Employee>();
        empl.add(new Employee(name, "gomez"));
        System.out.println(">>>> Num. Found >>>>> "+empl.size());
        return empl;
    }

}
