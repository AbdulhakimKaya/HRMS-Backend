package kodlamaio.hrms.entities.concretes;

import com.fasterxml.jackson.annotation.JsonIgnore;
import kodlamaio.hrms.entities.abstracts.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "employers")

public class Employer extends User {

    @Column(name = "company_name")
    private String companyName;

    @Column(name = "web_address")
    private String webAddress;

    @Column(name = "phone_numbers")
    private String phoneNumber;

    @JsonIgnore
    @OneToMany(mappedBy = "employer")
    private List<JobAdvertisement> jobAdvertisements;

}