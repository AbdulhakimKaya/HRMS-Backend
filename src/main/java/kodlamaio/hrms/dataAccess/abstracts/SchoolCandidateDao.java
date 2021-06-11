package kodlamaio.hrms.dataAccess.abstracts;

import kodlamaio.hrms.entities.concretes.SchoolCandidate;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SchoolCandidateDao extends JpaRepository<SchoolCandidate,Integer> {
}
