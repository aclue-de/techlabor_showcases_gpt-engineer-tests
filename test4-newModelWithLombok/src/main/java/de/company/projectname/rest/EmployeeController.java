package de.company.projectname.rest;

import de.company.projectname.model.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class EmployeeController {

    @GetMapping("/employee/{uuid}")
    public Employee find(@PathVariable UUID uuid) {
        // Mocking an employee for demonstration purposes
        Employee employee = new Employee();
        employee.setUuid(uuid);
        employee.setFirstname("John");
        employee.setLastname("Doe");
        return employee;
    }
}