package de.company.projectname.rest;

import de.company.projectname.model.Employee;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

import java.util.HashMap;
import java.util.Map;

@RestController
public class EmployeeController {

    private Map<String, Employee> employeeDatabase = new HashMap<>();

    @PostMapping("/employee")
    public Employee create(@RequestBody Employee employee) {
        employee.setUuid(UUID.randomUUID());
        employeeDatabase.put(employee.getUuid().toString(), employee);
        return employee;
    }

    @GetMapping("/employee/{uuid}")
    public Employee find(@PathVariable String uuid) {
        return employeeDatabase.get(uuid);
    }

    @PutMapping("/employee/{uuid}")
    public Employee update(@PathVariable String uuid, @RequestBody Employee employee) {
        employee.setUuid(UUID.fromString(uuid));
        employeeDatabase.put(uuid, employee);
        return employee;
    }

    @DeleteMapping("/employee/{uuid}")
    public void delete(@PathVariable String uuid) {
        employeeDatabase.remove(uuid);
    }
}