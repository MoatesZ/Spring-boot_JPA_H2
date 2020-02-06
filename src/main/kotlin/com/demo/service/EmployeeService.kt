package com.demo.service

import com.demo.entity.EmployeeEntity
import com.demo.repository.EmployeeRepository
import org.springframework.stereotype.Service

@Service
class EmployeeService(private val employeeRepository: EmployeeRepository) {

    fun getAll() = employeeRepository.findAll()

    fun getByEmpId(empId: Long) = employeeRepository.findById(empId)

    fun create(employee: EmployeeEntity) = employeeRepository.save(employee)

    fun update(empId: Long, employee: EmployeeEntity): EmployeeEntity {
        employee.empId = empId
        return employeeRepository.save(employee)
    }

    fun deleteByEmpId(empId: Long) = employeeRepository.deleteById(empId)

}