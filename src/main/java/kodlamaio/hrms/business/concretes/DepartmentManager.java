package kodlamaio.hrms.business.concretes;

import kodlamaio.hrms.business.abstracts.DepartmentService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.DepartmentDao;
import kodlamaio.hrms.entities.concretes.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentManager implements DepartmentService {

    private DepartmentDao departmentDao;

    @Autowired
    public DepartmentManager(DepartmentDao departmentDao) {
        this.departmentDao = departmentDao;
    }

    @Override
    public DataResult<List<Department>> getAll() {
        return new SuccessDataResult<List<Department>>
                (this.departmentDao.findAll(),"Bölümler listelendi.");
    }

    @Override
    public Result add(Department department) {
        this.departmentDao.save(department);
        return new SuccessResult("Başarıyla eklendi.");
    }
}
