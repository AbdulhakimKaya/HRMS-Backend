package kodlamaio.hrms.business.abstracts;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.entities.concretes.LanguageCandidate;

import java.util.List;

public interface LanguageCandidateService {
    DataResult<List<LanguageCandidate>> getByCandidateId(int candidateId);
}
