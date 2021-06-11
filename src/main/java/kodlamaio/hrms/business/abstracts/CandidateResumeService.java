package kodlamaio.hrms.business.abstracts;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.CandidateResume;

import java.util.List;

public interface CandidateResumeService {
    DataResult<List<CandidateResume>> getAll();
    Result add(CandidateResume candidateResume);
}
