package kodlamaio.hrms.entities.concretes;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "job_titles")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","workplaceCandidates","jobAdvertisement"})

public class JobTitle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id")
    private int id;

    @Column(name = "title")
    private String title;

    @JsonIgnore
    @OneToMany(mappedBy = "jobTitle")
    private List<JobAdvertisement> jobAdvertisements;

    @JsonIgnore
    @OneToMany(mappedBy = "jobTitle")
    private List<WorkplaceCandidate> workplaceCandidates;

}
