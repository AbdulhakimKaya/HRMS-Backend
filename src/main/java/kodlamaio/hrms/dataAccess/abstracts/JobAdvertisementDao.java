package kodlamaio.hrms.dataAccess.abstracts;

import kodlamaio.hrms.entities.concretes.JobAdvertisement;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface JobAdvertisementDao extends JpaRepository<JobAdvertisement, Integer> {

    List<JobAdvertisement> getByEnableTrue();   // tüm aktif iş ilanlarını getir.
    List<JobAdvertisement> getByEnableFalse();  // tüm pasif iş ilanlarını getir
    List<JobAdvertisement>getByEmployerId(int employerId); // şu idli şirketin iş ilanlarını getir
    List<JobAdvertisement> getByEnableTrueAndEmployer_Id(int id); // Şu id'li şirketin aktif iş ilanlarını getir
}
