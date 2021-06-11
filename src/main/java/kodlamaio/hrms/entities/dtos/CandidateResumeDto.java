package kodlamaio.hrms.entities.dtos;

import com.fasterxml.jackson.annotation.JsonIgnore;
import kodlamaio.hrms.entities.abstracts.Dto;
import kodlamaio.hrms.entities.concretes.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CandidateResumeDto implements Dto {

    @JsonIgnore
    private Candidate candidate;
    private List<SchoolCandidate> schoolCandidates;
    private List<LanguageCandidate> languageCandidates;
    private List<WorkplaceCandidate> workplaceCandidates;
    private List<SocialMedia> socialMedia;
    private List<AbilityCandidate> abilityCandidates;
    private CandidateResumeDetail candidateResumeDetail;
}
