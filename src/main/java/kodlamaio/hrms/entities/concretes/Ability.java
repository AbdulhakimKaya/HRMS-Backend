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
@Table(name = "abilities")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","abilityCandidate"})

public class Ability {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id")
    private int id;

    @Column(name = "ability_name")
    private String abilitiyName;

    @JsonIgnore
    @OneToMany(mappedBy = "ability")
    private List<AbilityCandidate> abilityCandidates;

}
