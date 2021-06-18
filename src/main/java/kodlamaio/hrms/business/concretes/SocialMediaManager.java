package kodlamaio.hrms.business.concretes;

import kodlamaio.hrms.business.abstracts.SocialMediaService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.entities.concretes.SocialMedia;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SocialMediaManager implements SocialMediaService {
    @Override
    public DataResult<List<SocialMedia>> getByCandidateId(int candidateId) {
        return null;
    }
}
