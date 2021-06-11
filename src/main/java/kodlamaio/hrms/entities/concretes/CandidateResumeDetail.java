package kodlamaio.hrms.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "candidate_resume")
public class CandidateResumeDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id")
    private int id;

    @OneToOne()
    @JoinColumn(name = "candidate_id")
    private Candidate candidate;

    @Column(name = "description")
    private String description;
}
