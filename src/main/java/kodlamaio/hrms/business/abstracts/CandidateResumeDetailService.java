package kodlamaio.hrms.business.abstracts;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.CandidateResumeDetail;

import java.util.List;

public interface CandidateResumeDetailService {
    DataResult<List<CandidateResumeDetail>> getAll();
    Result add(CandidateResumeDetail candidateResumeDetail);
}
