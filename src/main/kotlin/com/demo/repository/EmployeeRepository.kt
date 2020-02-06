package com.demo.repository

import com.demo.entity.EmployeeEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface EmployeeRepository : JpaRepository<EmployeeEntity, Long>