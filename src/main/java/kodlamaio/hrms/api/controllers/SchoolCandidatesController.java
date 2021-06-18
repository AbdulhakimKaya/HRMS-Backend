package kodlamaio.hrms.api.controllers;

import kodlamaio.hrms.business.abstracts.SchoolCandidateService;
import kodlamaio.hrms.entities.concretes.SchoolCandidate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/schoolCandidates")
public class SchoolCandidatesController {

    private SchoolCandidateService schoolCandidateService;

    @Autowired
    public SchoolCandidatesController(SchoolCandidateService schoolCandidateService) {
        this.schoolCandidateService = schoolCandidateService;
    }

    @GetMapping("/getall")
    public ResponseEntity<?> getAll() {
        return ResponseEntity.ok(this.schoolCandidateService.getAll());
    }

    @PostMapping("/add")
    public ResponseEntity<?> add(@Valid @RequestBody SchoolCandidate schoolCandidate) {
        return ResponseEntity.ok(this.schoolCandidateService.add(schoolCandidate));
    }

    @GetMapping("/getByCandidateId")
    public ResponseEntity<?> getByCandidateId(@RequestBody int candidateId) {
        return ResponseEntity.ok(this.schoolCandidateService.getByCandidateId(candidateId));
    }

    @GetMapping("/getByCandidate_IdOrderByFinishDateDesc")
    public ResponseEntity<?> getByCandidate_IdOrderByFinishDateDesc(@RequestBody int candidateId) {
        return ResponseEntity.ok(this.schoolCandidateService.getByCandidate_IdOrderByFinishDateDesc(candidateId));
    }
}
