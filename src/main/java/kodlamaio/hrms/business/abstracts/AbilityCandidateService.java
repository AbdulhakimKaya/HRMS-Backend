package kodlamaio.hrms.business.abstracts;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.AbilityCandidate;

import java.util.List;

public interface AbilityCandidateService {
    DataResult<List<AbilityCandidate>> getAll();
    DataResult<List<AbilityCandidate>> getByCandidateId(int candidateId);
    Result add(AbilityCandidate abilityCandidate);
}
