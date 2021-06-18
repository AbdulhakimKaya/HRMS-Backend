package kodlamaio.hrms.dataAccess.abstracts;

import kodlamaio.hrms.entities.concretes.CandidateResumeDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CandidateResumeDetailDao extends JpaRepository<CandidateResumeDetail,Integer> {
    CandidateResumeDetail getByCandidate_Id(int candidateId);
}
