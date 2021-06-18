package kodlamaio.hrms.business.concretes;

import kodlamaio.hrms.business.abstracts.CandidateResumeDetailService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.CandidateResumeDetailDao;
import kodlamaio.hrms.entities.concretes.CandidateResumeDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CandidateResumeDetailManager implements CandidateResumeDetailService {

    private CandidateResumeDetailDao candidateResumeDetailDao;

    @Autowired
    public CandidateResumeDetailManager(CandidateResumeDetailDao candidateResumeDetailDao) {
        this.candidateResumeDetailDao = candidateResumeDetailDao;
    }

    @Override
    public DataResult<List<CandidateResumeDetail>> getAll() {
        return new SuccessDataResult<List<CandidateResumeDetail>>
                (this.candidateResumeDetailDao.findAll(),"Başarıyla listelendi.");
    }

    @Override
    public Result add(CandidateResumeDetail candidateResumeDetail) {
        this.candidateResumeDetailDao.save(candidateResumeDetail);
        return new SuccessResult("Başarıyla eklendi.");
    }
}
