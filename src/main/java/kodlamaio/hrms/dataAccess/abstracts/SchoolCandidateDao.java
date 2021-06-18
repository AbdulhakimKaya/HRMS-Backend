package kodlamaio.hrms.dataAccess.abstracts;

import kodlamaio.hrms.entities.concretes.SchoolCandidate;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SchoolCandidateDao extends JpaRepository<SchoolCandidate,Integer> {

    List<SchoolCandidate> getByCandidate_Id(int candidateId);

    List<SchoolCandidate> getByCandidate_IdOrderByFinishDateDesc(int candidateId);
}

