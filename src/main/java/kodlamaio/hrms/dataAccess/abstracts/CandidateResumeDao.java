package kodlamaio.hrms.dataAccess.abstracts;

import kodlamaio.hrms.entities.concretes.CandidateResumeDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CandidateResumeDao extends JpaRepository<CandidateResumeDetail,Integer> {
}
