package kodlamaio.hrms.business.abstracts;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.JobAdvertisement;

import java.util.List;

public interface JobAdvertisementService {

    DataResult<List<JobAdvertisement>> getAll();
    Result add(JobAdvertisement jobAdvertisement);
    Result update(JobAdvertisement jobAdvertisement);

    DataResult<List<JobAdvertisement>>getByEnableTrue();
    DataResult<List<JobAdvertisement>> getByEnableFalse();
    DataResult<List<JobAdvertisement>>getByEmployerId(int employerId);
    DataResult<List<JobAdvertisement>> getByEnableTrueAndEmployer_Id(int id);
}
