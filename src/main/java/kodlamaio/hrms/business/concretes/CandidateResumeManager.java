package kodlamaio.hrms.business.concretes;

import kodlamaio.hrms.business.abstracts.CandidateResumeService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.CandidateResumeDao;
import kodlamaio.hrms.entities.concretes.CandidateResumeDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CandidateResumeManager implements CandidateResumeService {

    private CandidateResumeDao candidateResumeDao;

    @Autowired
    public CandidateResumeManager(CandidateResumeDao candidateResumeDao) {
        this.candidateResumeDao = candidateResumeDao;
    }

    @Override
    public DataResult<List<CandidateResumeDetail>> getAll() {
        return new SuccessDataResult<List<CandidateResumeDetail>>
                (this.candidateResumeDao.findAll(),"Başarıyla listelendi.");
    }

    @Override
    public Result add(CandidateResumeDetail candidateResumeDetail) {
        this.candidateResumeDao.save(candidateResumeDetail);
        return new SuccessResult("Başarıyla eklendi.");
    }
}
