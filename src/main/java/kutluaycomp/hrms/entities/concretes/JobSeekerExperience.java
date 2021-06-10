package kutluaycomp.hrms.entities.concretes;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="job_seeker_experiences")
public class JobSeekerExperience {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@ManyToOne()
	@JoinColumn(name = "curriculum_vitae_id", referencedColumnName = "id")
	private CurriculumVitae curriculumVitae;
	
	@NotNull
	@Column(name="company_name")
	private String CompanyName;
	
	@ManyToOne()
	@JoinColumn(name = "job_position_id", referencedColumnName = "id")
	private JobPosition jobPosition;
	
	@NotNull
	@Column(name="start_date")
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
	private LocalDate startDate;
	
	@Column(name="final_date")
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
	private LocalDate finalDate;
	
	@Column(name="description")
	private String description;

}
