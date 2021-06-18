package kodlamaio.hrms.business.abstracts;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.entities.concretes.WorkplaceCandidate;

import java.util.List;

public interface WorkplaceCandidateService {
    DataResult<List<WorkplaceCandidate>> getByCandidateId(int candidateId);
}
