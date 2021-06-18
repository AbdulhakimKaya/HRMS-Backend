package kodlamaio.hrms.business.abstracts;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.Candidate;
import kodlamaio.hrms.entities.dtos.CandidateResumeDto;


import java.util.List;
public interface CandidateService {

    DataResult<List<Candidate>> getAll();

    Result register(Candidate candidate);

    DataResult<CandidateResumeDto> getCandidateCandidateResumeByCandidateId(int candidateId);
}
