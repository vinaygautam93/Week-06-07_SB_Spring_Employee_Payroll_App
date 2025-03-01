package com.example.employeepayroll.controller;
import org.springframework.validation.annotation.Validated;
import jakarta.validation.Valid;

@Validated
@RestController
public class EmployeeController {
    @PostMapping("/employees")
    public ResponseEntity<String> createEmployee(@Valid @RequestBody EmployeeDTO employee) {
        return ResponseEntity.ok("Employee Created");
    }
}
