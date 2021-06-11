package kodlamaio.hrms.api.controllers;

import kodlamaio.hrms.business.abstracts.SchoolService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.entities.concretes.School;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/schools")
public class SchoolsController {
    private SchoolService schoolService;

    @Autowired
    public SchoolsController(SchoolService schoolService) {
        this.schoolService = schoolService;
    }

    @GetMapping(value = "/getall")
    public ResponseEntity<?> getAll() {
        return ResponseEntity.ok(this.schoolService.getAll());
    }

    @PostMapping(value = "/add")
    public ResponseEntity<?> add(@Valid @RequestBody School school) {
        return ResponseEntity.ok(this.schoolService.add(school));
    }
}
