package com.demo.entity

import javax.persistence.*

@Entity
@Table(name = "employees")
data class EmployeeEntity(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        var empId: Long,
        @Column(name = "first_name")
        val firstName: String,
        @Column(name = "last_name")
        val lastName: String,
        @Column(name = "age")
        val age: Int,
        @Column(name = "deposit")
        val deposit: Double? = 0.00
)