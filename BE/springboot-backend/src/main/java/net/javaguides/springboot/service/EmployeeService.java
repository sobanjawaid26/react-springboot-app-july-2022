package net.javaguides.springboot.service;

import net.javaguides.springboot.model.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> findAll();
    Employee findById(long id);
    Employee save(Employee employee);
    void delete(Employee employee);
}
