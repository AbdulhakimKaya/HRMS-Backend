package kodlamaio.hrms.api.controllers;

import kodlamaio.hrms.business.abstracts.CandidateResumeDetailService;
import kodlamaio.hrms.entities.concretes.CandidateResumeDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/candidateresumes")
public class CandidateResumeDetailsController {
    private CandidateResumeDetailService candidateResumeDetailService;

    @Autowired
    public CandidateResumeDetailsController(CandidateResumeDetailService candidateResumeDetailService) {
        this.candidateResumeDetailService = candidateResumeDetailService;
    }

    @GetMapping("/getall")
    public ResponseEntity<?> getAll(){
        return ResponseEntity.ok(this.candidateResumeDetailService.getAll());
    }

    @PostMapping("/add")
    public ResponseEntity<?> add(@Valid @RequestBody CandidateResumeDetail candidateResumeDetail) {
        return ResponseEntity.ok(this.candidateResumeDetailService.add(candidateResumeDetail));
    }
}
