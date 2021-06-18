package kodlamaio.hrms.business.abstracts;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.entities.concretes.SocialMedia;

import java.util.List;

public interface SocialMediaService {
    DataResult<List<SocialMedia>> getByCandidateId(int candidateId);
}
