package kodlamaio.hrms.MernisService;

import kodlamaio.hrms.entities.concretes.Candidate;

public interface UserValidationService {
    public boolean validate(Candidate candidate);
}
