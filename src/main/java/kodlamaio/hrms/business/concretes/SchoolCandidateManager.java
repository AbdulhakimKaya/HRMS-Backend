package kodlamaio.hrms.business.concretes;

import kodlamaio.hrms.business.abstracts.SchoolCandidateService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.SchoolCandidateDao;
import kodlamaio.hrms.entities.concretes.SchoolCandidate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SchoolCandidateManager implements SchoolCandidateService {

    private SchoolCandidateDao schoolCandidateDao;

    @Autowired
    public SchoolCandidateManager(SchoolCandidateDao schoolCandidateDao) {
        this.schoolCandidateDao = schoolCandidateDao;
    }

    @Override
    public DataResult<List<SchoolCandidate>> getAll() {
        return new SuccessDataResult<List<SchoolCandidate>>(this.schoolCandidateDao.findAll());
    }

    @Override
    public DataResult<List<SchoolCandidate>> getByCandidateId(int candidateId) {
        return new SuccessDataResult<List<SchoolCandidate>>(schoolCandidateDao.getByCandidate_Id(candidateId));
    }

    @Override
    public DataResult<List<SchoolCandidate>> getByCandidate_IdOrderByFinishDateDesc(int candidateId) {
        return new SuccessDataResult<List<SchoolCandidate>>(this.schoolCandidateDao.getByCandidate_IdOrderByFinishDateDesc(candidateId));
    }


    @Override
    public Result add(SchoolCandidate schoolCandidate) {
        this.schoolCandidateDao.save(schoolCandidate);
        return new SuccessResult("Başarıyla eklendi.");
    }
}
