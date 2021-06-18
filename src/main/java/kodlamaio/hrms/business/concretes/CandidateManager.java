package kodlamaio.hrms.business.concretes;

import kodlamaio.hrms.business.abstracts.*;

import kodlamaio.hrms.core.utilities.results.*;
import kodlamaio.hrms.dataAccess.abstracts.CandidateDao;
import kodlamaio.hrms.entities.concretes.Candidate;
import kodlamaio.hrms.entities.dtos.CandidateResumeDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CandidateManager implements CandidateService {

    private CandidateDao candidateDao;
    private CandidateResumeDetailService candidateResumeDetailService;
    private AbilityCandidateService abilityCandidateService;
    private SchoolCandidateService schoolCandidateService;
    private LanguageCandidateService languageCandidateService;
    private WorkplaceCandidateService workplaceCandidateService;
    private SocialMediaService socialMediaService;



    @Autowired
    public CandidateManager(CandidateDao candidateDao, CandidateResumeDetailService candidateResumeDetailService, AbilityCandidateService abilityCandidateService, SchoolCandidateService schoolCandidateService, LanguageCandidateService languageCandidateService, WorkplaceCandidateService workplaceCandidateService, SocialMediaService socialMediaService) {
        this.candidateDao = candidateDao;
        this.candidateResumeDetailService = candidateResumeDetailService;
        this.abilityCandidateService = abilityCandidateService;
        this.schoolCandidateService = schoolCandidateService;
        this.languageCandidateService = languageCandidateService;
        this.workplaceCandidateService = workplaceCandidateService;
        this.socialMediaService = socialMediaService;
    }

    @Override
    public DataResult<List<Candidate>> getAll() {
        return new SuccessDataResult<List<Candidate>> (this.candidateDao.findAll(), "İş adayları listelendi.");
    }

    @Override
    public Result register(Candidate candidate) {
        this.candidateDao.save(candidate);
        return new SuccessResult("Kaydınız başarıyla tamamlandı.");
    }

    @Override
    public DataResult<CandidateResumeDto> getCandidateCandidateResumeByCandidateId(int candidateId) {
        CandidateResumeDto candidateResumeDto = new CandidateResumeDto();
        candidateResumeDto.setCandidate(this.candidateDao.findById(candidateId).get());
        candidateResumeDto.setAbilityCandidates(this.abilityCandidateService.getByCandidateId(candidateId).getData());
        candidateResumeDto.setSchoolCandidates(this.schoolCandidateService.getByCandidateId(candidateId).getData());
        candidateResumeDto.setLanguageCandidates(this.languageCandidateService.getByCandidateId(candidateId).getData());
        candidateResumeDto.setWorkplaceCandidates(this.workplaceCandidateService.getByCandidateId(candidateId).getData());
        candidateResumeDto.setSocialMedia(this.socialMediaService.getByCandidateId(candidateId).getData());

        return new SuccessDataResult<CandidateResumeDto>(candidateResumeDto,"CV getirildi.");
    }
}
