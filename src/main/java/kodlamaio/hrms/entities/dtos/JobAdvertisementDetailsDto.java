package kodlamaio.hrms.entities.dtos;

import kodlamaio.hrms.entities.abstracts.Dto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class JobAdvertisementDetailsDto implements Dto {

    private String companyName;
    private String jobTitle;
    private int openPosition;
    private String city;
    private LocalDate finishDate;

}
