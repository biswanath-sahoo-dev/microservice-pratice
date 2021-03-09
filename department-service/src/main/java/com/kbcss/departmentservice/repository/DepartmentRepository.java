package com.kbcss.departmentservice.repository;

import com.kbcss.departmentservice.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {


    Department getDepartmentById(Long departmentId);
}
