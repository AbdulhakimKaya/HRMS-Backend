package kodlamaio.hrms.api.controllers;

import kodlamaio.hrms.business.abstracts.CandidateResumeService;
import kodlamaio.hrms.entities.concretes.CandidateResumeDetail;
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
    public ResponseEntity<?> add(@Valid @RequestBody CandidateResumeDetail candidateResumeDetail) {
        return ResponseEntity.ok(this.candidateResumeService.add(candidateResumeDetail));
    }
}
