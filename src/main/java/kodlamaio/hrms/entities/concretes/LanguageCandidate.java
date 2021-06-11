package kodlamaio.hrms.entities.concretes;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "language_candidates")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
public class LanguageCandidate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id")
    private int id;

    @ManyToOne()
    @JoinColumn(name = "language_id")
    private Language language;

    @ManyToOne()
    @JoinColumn(name = "level_id")
    private LanguageLevel languageLevel;

    @ManyToOne()
    @JoinColumn(name = "candidate_id")
    private Candidate candidate;
}
