package kodlamaio.hrms.entities.concretes;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "workplace_candidates")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})

public class WorkplaceCandidate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id")
    private int id;

    @ManyToOne()
    @JoinColumn(name = "workplace_id")
    private Workplace workplace;

    @ManyToOne()
    @JoinColumn(name = "candidate_id")
    private Candidate candidate;

    @ManyToOne()
    @JoinColumn(name = "job_title_id")
    private JobTitle jobTitle;

    @Column(name = "start_date")
    private LocalDate startDate;

    @Column(name = "finish_date")
    private LocalDate finishDate;
}
