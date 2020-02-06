package com.demo.controller

import com.demo.entity.EmployeeEntity
import com.demo.service.EmployeeService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/employee")
class EmployeeController (private val employeeService: EmployeeService) {

    @GetMapping
    fun getAll() = employeeService.getAll()

    @GetMapping("/{empId}")
    fun getByEmpId(@PathVariable empId: Long) = employeeService.getByEmpId(empId)

    @PostMapping
    fun create(@RequestBody employee: EmployeeEntity) = employeeService.create(employee)

    @PutMapping("/{empId}")
    fun update(@PathVariable empId: Long, @RequestBody employee: EmployeeEntity) = employeeService.update(empId, employee)

    @DeleteMapping("/{empId}")
    fun delete(@PathVariable empId: Long) = employeeService.deleteByEmpId(empId)

}