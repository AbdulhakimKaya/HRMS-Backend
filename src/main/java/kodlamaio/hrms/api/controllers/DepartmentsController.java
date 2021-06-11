package kodlamaio.hrms.api.controllers;

import kodlamaio.hrms.business.abstracts.DepartmentService;
import kodlamaio.hrms.entities.concretes.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/departments")
public class DepartmentsController {
    private DepartmentService departmentService;

    @Autowired
    public DepartmentsController(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    @GetMapping(value = "/getall")
    public ResponseEntity<?> getAll() {
        return ResponseEntity.ok(this.departmentService.getAll());
    }

    @PostMapping(value = "/add")
    public ResponseEntity<?> add(@Valid @RequestBody Department department) {
        return ResponseEntity.ok(this.departmentService.add(department));
    }
}
