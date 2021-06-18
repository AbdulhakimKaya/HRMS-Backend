package kodlamaio.hrms.api.controllers;

import kodlamaio.hrms.business.abstracts.SchoolDepartmentService;
import kodlamaio.hrms.entities.concretes.SchoolDepartment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/schoolDepartments")
public class SchoolDepartmentsController {
    private SchoolDepartmentService schoolDepartmentService;

    @Autowired
    public SchoolDepartmentsController(SchoolDepartmentService schoolDepartmentService) {
        this.schoolDepartmentService = schoolDepartmentService;
    }

    @GetMapping("/getall")
    public ResponseEntity<?> getAll() {
        return ResponseEntity.ok(this.schoolDepartmentService.getAll());
    }

    @PostMapping("/add")
    public ResponseEntity<?> add(@RequestBody SchoolDepartment schoolDepartment) {
        return ResponseEntity.ok(this.schoolDepartmentService.add(schoolDepartment));
    }
}
