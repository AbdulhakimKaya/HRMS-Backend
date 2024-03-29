package kodlamaio.hrms.business.concretes;

import kodlamaio.hrms.business.abstracts.JobAdvertisementService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.JobAdvertisementDao;
import kodlamaio.hrms.entities.concretes.JobAdvertisement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class JobAdvertisementManager implements JobAdvertisementService {

    private JobAdvertisementDao jobAdvertisementDao;

    @Autowired
    public JobAdvertisementManager(JobAdvertisementDao jobAdvertisementDao) {
        this.jobAdvertisementDao = jobAdvertisementDao;
    }

    @Override
    public DataResult<List<JobAdvertisement>> getAll() {
        return new SuccessDataResult<>(this.jobAdvertisementDao.findAll(),"İş ilanları başarılı bir şekilde listelendi.");
    }

    @Override
    public Result add(JobAdvertisement jobAdvertisement) {
        this.jobAdvertisementDao.save(jobAdvertisement);
        return new SuccessResult("İş ilanı başarılı bir şekilde eklenmiştir.");
    }
    @Override
    public Result update(JobAdvertisement jobAdvertisement) {
        this.jobAdvertisementDao.save(jobAdvertisement);
        return new SuccessResult("İş ilanı başarılı bir şekilde güncellenmiştir.");
    }

    @Override
    public DataResult<List<JobAdvertisement>> getByEnableTrue() {
        return new SuccessDataResult<List<JobAdvertisement>>(this.jobAdvertisementDao.getByEnableTrue()
        ,"Tüm aktif iş ilanları başarılı bir şekilde listelendi.");
    }

    @Override
    public DataResult<List<JobAdvertisement>> getByEnableFalse() {
        return new SuccessDataResult<List<JobAdvertisement>>(this.jobAdvertisementDao.getByEnableFalse()
                ,"Tüm aktif olmayan iş ilanları başarılı bir şekilde listelendi");
    }

    @Override
    public DataResult<List<JobAdvertisement>> getByEmployerId(int employerId) {
        return new SuccessDataResult<List<JobAdvertisement>>(this.jobAdvertisementDao.getByEmployerId(employerId));
    }

    @Override
    public DataResult<List<JobAdvertisement>> getByEnableTrueAndEmployer_Id(int id) {
        return new SuccessDataResult<List<JobAdvertisement>>(this.jobAdvertisementDao.getByEnableTrueAndEmployer_Id(id));
    }
}
