package kodlamaio.hrms.business.concretes;

import kodlamaio.hrms.business.abstracts.LanguageCandidateService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.entities.concretes.LanguageCandidate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LanguageCandidateManager implements LanguageCandidateService {
    @Override
    public DataResult<List<LanguageCandidate>> getByCandidateId(int candidateId) {
        return null;
    }
}
