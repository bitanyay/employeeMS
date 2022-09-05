package com.bitanya.employeems.repository;

import com.bitanya.employeems.entity.employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface employeeRepo  extends JpaRepository <employee, Integer>{
}
