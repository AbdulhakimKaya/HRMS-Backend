package kodlamaio.hrms.business.concretes;

import kodlamaio.hrms.business.abstracts.WorkplaceCandidateService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.entities.concretes.WorkplaceCandidate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorkplaceCandidateManager implements WorkplaceCandidateService {
    @Override
    public DataResult<List<WorkplaceCandidate>> getByCandidateId(int candidateId) {
        return null;
    }
}
