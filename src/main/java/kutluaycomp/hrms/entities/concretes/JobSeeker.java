package kutluaycomp.hrms.entities.concretes;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "job_seekers")
@PrimaryKeyJoinColumn(name="user_id",referencedColumnName = "id")
@EqualsAndHashCode(callSuper = true)
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "jobSeeker"})
public class JobSeeker extends User {

	@NotEmpty
	@Column(name = "first_name")
	private String firstName;

	@NotEmpty
	@Column(name = "last_name")
	private String lastName;

	@NotEmpty
	@Column(name = "nationality_id")
	private String nationalityId;

	@NotEmpty
	@Column(name = "date_of_birth")
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
	private LocalDate dateOfBirth;

	@NotNull
	@Column(name = "activated")
	private boolean activated;

	@Column(name = "activation_date")
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
	private LocalDate activationDate;

	@JsonIgnore
	@OneToMany(mappedBy = "jobSeeker")
	private List<CurriculumVitae> curriculumVitaes;

}
