package com.kbcss.departmentservice.controller;

import com.kbcss.departmentservice.entity.Department;
import com.kbcss.departmentservice.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/department")
@Slf4j
public class DepartmentController {

    private final DepartmentService departmentService;

    public DepartmentController(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    @PostMapping("/")
    public Department saveDepartment(@RequestBody Department department) {
        log.info("DepartmentService      : saveDepartment(-)  ");
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/{id}")
    public Department getZDepartmentById(@PathVariable("id") Long departmentId) {
        log.info(" inside DepartmentController : getZDepartmentById ");
        return departmentService.getDepartmentById(departmentId);
    }
}
