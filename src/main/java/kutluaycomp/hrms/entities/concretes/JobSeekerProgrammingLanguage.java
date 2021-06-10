package kutluaycomp.hrms.entities.concretes;

import javax.persistence.*;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="job_seeker_programming_languages")
public class JobSeekerProgrammingLanguage {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@ManyToOne()
	@JoinColumn(name = "curriculum_vitae_id", referencedColumnName = "id")
	private CurriculumVitae curriculumVitae;
	
	@ManyToOne()
	@JoinColumn(name = "programming_language_id", referencedColumnName = "id")
	private ProgrammingLanguage programmingLanguage;

}
