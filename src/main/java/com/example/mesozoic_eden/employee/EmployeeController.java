package com.example.mesozoic_eden.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@Controller
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping
    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }

    @GetMapping("/{emptype}")
    public String getEmpByDepart(@PathVariable String emptype, Model model) {
        List<Employee> employees = employeeService.getEmpByDepart(emptype);
        model.addAttribute("employees", employees);
        model.addAttribute("emptype", emptype);
        return "empProfile";
    }
}