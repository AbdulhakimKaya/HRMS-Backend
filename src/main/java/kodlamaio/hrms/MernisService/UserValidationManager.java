package kodlamaio.hrms.MernisService;

import kodlamaio.hrms.entities.concretes.Candidate;
import org.springframework.stereotype.Service;

@Service
public class UserValidationManager implements UserValidationService{

    @Override
    public boolean validate(Candidate candidate) {
        return true;
    }
}
