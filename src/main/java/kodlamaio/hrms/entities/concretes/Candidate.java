package kodlamaio.hrms.entities.concretes;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import kodlamaio.hrms.entities.abstracts.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "candidates")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler",
        "schoolCandidates","abilityCandidates",
        "languageCandidates","workplaceCandidates",
        "socialMedias","candidateResume"})
public class Candidate extends User {


    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "identification_number")
    private String identificationNumber;



    @Column(name = "birth_date")
    private String birthDate;

    @JsonIgnore
    @OneToMany(mappedBy = "candidate")
    private List<SchoolCandidate> schoolCandidates;

    @JsonIgnore
    @OneToMany(mappedBy = "candidate")
    private List<AbilityCandidate> abilityCandidates;

    @JsonIgnore
    @OneToMany(mappedBy = "candidate")
    private List<LanguageCandidate> languageCandidates;

    @JsonIgnore
    @OneToMany(mappedBy = "candidate")
    private List<WorkplaceCandidate> workplaceCandidates;

    @JsonIgnore
    @OneToMany(mappedBy = "candidate")
    private List<SocialMedia> socialMedias;

    @JsonIgnore
    @OneToOne(mappedBy = "candidate")
    private CandidateResume candidateResume;

}
