package kodlamaio.hrms.api.controllers;

import kodlamaio.hrms.business.abstracts.CandidateService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.dataAccess.abstracts.CandidateDao;
import kodlamaio.hrms.entities.concretes.Candidate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/candidates")
public class CandidatesController {

    private CandidateService candidateService;

    @Autowired
    public CandidatesController(CandidateService candidateService) {
        this.candidateService = candidateService;
    }

    @GetMapping("/getall")
    public DataResult<List<Candidate>> getAll() {
        return this.candidateService.getAll();
    }
    @PostMapping("/register")
    public Result register(@RequestBody Candidate candidate) {
        return this.candidateService.register(candidate);
    }

    @GetMapping("/getCandidateCvByCandidateId")
    public ResponseEntity<?> getCandidateCandidateResumeByCandidateId(int candidateId) {
        return ResponseEntity.ok(candidateService.getCandidateCandidateResumeByCandidateId(candidateId));
    }


}
