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
@Table(name = "schools")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","schoolDepartments"})

public class School {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id")
    private int id;

    @Column(name = "school_name")
    private String schoolName;

    @JsonIgnore
    @OneToMany(mappedBy = "school")
    private List<SchoolDepartment> schoolDepartments;

}
