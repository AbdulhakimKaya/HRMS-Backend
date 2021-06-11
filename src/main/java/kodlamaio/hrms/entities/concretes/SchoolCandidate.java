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
@Table(name = "school_candidates")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})

public class SchoolCandidate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id")
    private int id;

    @ManyToOne()
    @JoinColumn(name = "school_departments_id")
    private SchoolDepartment schoolDepartment;

    @ManyToOne()
    @JoinColumn(name = "candidate_id")
    private Candidate candidate;

    @Column(name = "start_date")
    private LocalDate startDate;

    @Column(name = "finish_date")
    private LocalDate finish_date;
}
