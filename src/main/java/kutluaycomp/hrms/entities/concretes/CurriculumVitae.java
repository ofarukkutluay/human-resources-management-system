package kutluaycomp.hrms.entities.concretes;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "curriculum_vitaes")
public class CurriculumVitae {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="job_seeker_id")
	private int jobSeekerId;

	@OneToMany
	@JoinColumn(name="job_seeker_school_id",referencedColumnName = "job_seeker_id")
	private List<JobSeekerSchool> jobSeekerSchools;

	private int[] jobSeekerExperienceIds;
	private int[] foreignLanguageIds;
	private String imageUrl;
	private String githubUrl;
	private String linkedinUrl;
	private int[] programmingLanguageIds;
	private String foreword;

}
