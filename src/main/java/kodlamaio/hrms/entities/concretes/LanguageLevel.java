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
@Table(name = "language_levels")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","languageCandiates"})

public class LanguageLevel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id")
    private int id;

    @Column(name = "level_name")
    private int levelName;

    @JsonIgnore
    @OneToMany(mappedBy = "languageLevel")
    private List<LanguageCandidate> languageCandidates;
}
