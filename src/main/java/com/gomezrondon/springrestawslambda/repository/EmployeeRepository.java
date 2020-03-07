package com.gomezrondon.springrestawslambda.repository;

import com.gomezrondon.springrestawslambda.entitie.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    List<Employee> findAllByFirstName(String firstName);
    List<Employee> findAllByLastName(String lastName);
}
