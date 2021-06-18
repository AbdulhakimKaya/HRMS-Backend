package kodlamaio.hrms.business.abstracts;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.SchoolCandidate;

import java.util.List;

public interface SchoolCandidateService {
    DataResult<List<SchoolCandidate>> getAll();

    DataResult<List<SchoolCandidate>> getByCandidateId(int candidateId);

    DataResult<List<SchoolCandidate>> getByCandidate_IdOrderByFinishDateDesc(int candidateId);

    Result add(SchoolCandidate schoolCandidate);
}
