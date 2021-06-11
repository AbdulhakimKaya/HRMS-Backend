package kodlamaio.hrms.api.controllers;

import kodlamaio.hrms.business.abstracts.CandidateResumeService;
import kodlamaio.hrms.entities.concretes.CandidateResume;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/candidateresumes")
public class CandidateResumesController {
    private CandidateResumeService candidateResumeService;

    @Autowired
    public CandidateResumesController(CandidateResumeService candidateResumeService) {
        this.candidateResumeService = candidateResumeService;
    }

    @GetMapping("/getall")
    public ResponseEntity<?> getAll(){
        return ResponseEntity.ok(this.candidateResumeService.getAll());
    }

    @PostMapping("/add")
    public ResponseEntity<?> add(@Valid @RequestBody CandidateResume candidateResume) {
        return ResponseEntity.ok(this.candidateResumeService.add(candidateResume));
    }
}
