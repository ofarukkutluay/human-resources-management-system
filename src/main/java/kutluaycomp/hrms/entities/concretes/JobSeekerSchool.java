package kutluaycomp.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="job_seeker_schools")
public class JobSeekerSchool {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@ManyToOne()
	@JoinColumn(name = "curriculum_vitae_id", referencedColumnName = "id")
	private CurriculumVitae curriculumVitae;
	
	@ManyToOne()
	@JoinColumn(name = "school_id", referencedColumnName = "id")
	private School school;
	
	@NotNull
	@Column(name="school_start_year")
	private int schoolStartYear;
	
	@Column(name="school_final_year")
	private int schoolFinalYear;

}
