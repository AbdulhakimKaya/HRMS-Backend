package kodlamaio.hrms.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "job_advertisements")

public class JobAdvertisement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id")
    private int id;

    @ManyToOne()
    @JoinColumn(name = "employer_id")
    private Employer employer;

    @ManyToOne()
    @JoinColumn(name = "job_title_id")
    private JobTitle jobTitle;

    @ManyToOne()
    @JoinColumn(name = "city_id")
    private City city;

    @NotBlank
    @NotNull
    @Column(name = "description")
    private String jobDescription;

    @Column(name = "min_salary")
    private int minSalary;

    @Column(name = "max_salary")
    private int maxSalary;

    @NotBlank
    @NotNull
    @Column(name = "finish_date")
    private LocalDate finishDate;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "modified_at")
    private LocalDateTime modifiedAt;

    @Column(name = "enable")
    private boolean enable;

    @NotBlank
    @NotNull
    @Column(name = "open_positions")
    private String openPosition;
}
