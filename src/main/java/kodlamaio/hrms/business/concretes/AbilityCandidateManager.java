package kodlamaio.hrms.business.concretes;

import kodlamaio.hrms.business.abstracts.AbilityCandidateService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.AbilityCandidate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AbilityCandidateManager implements AbilityCandidateService {
    @Override
    public DataResult<List<AbilityCandidate>> getAll() {
        return null;
    }

    @Override
    public DataResult<List<AbilityCandidate>> getByCandidateId(int candidateId) {
        return null;
    }

    @Override
    public Result add(AbilityCandidate abilityCandidate) {
        return null;
    }
}
