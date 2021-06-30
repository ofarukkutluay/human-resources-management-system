package kutluaycomp.hrms.entities.concretes;

import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "curriculum_vitaes")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class CurriculumVitae {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@ManyToOne
	@JoinColumn(name="job_seeker_id", referencedColumnName = "user_id")
	private JobSeeker jobSeeker;

	
	@OneToMany(mappedBy = "curriculumVitae")
	private List<JobSeekerSchool> jobSeekerSchools;

	
	@OneToMany(mappedBy = "curriculumVitae")
	private List<JobSeekerExperience> jobSeekerExperiences;
	
	
	@OneToMany(mappedBy = "curriculumVitae")
	private List<JobSeekerForegionLanguage> jobSeekerForeignLanguages;
	
	@Column(name="image_url")
	private String imageUrl;
	
	@Column(name="github_url")
	private String githubUrl;
	
	@Column(name="linkedin_url")
	private String linkedinUrl;
	
	
	@OneToMany(mappedBy = "curriculumVitae")
	private List<JobSeekerProgrammingLanguage> jobSeekerProgrammingLanguages;
	
	@Column(name="foreword")
	private String foreword;

}
