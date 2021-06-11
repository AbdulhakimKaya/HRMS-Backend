package kodlamaio.hrms.dataAccess.abstracts;

import kodlamaio.hrms.entities.concretes.CandidateResume;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CandidateResumeDao extends JpaRepository<CandidateResume,Integer> {
}
