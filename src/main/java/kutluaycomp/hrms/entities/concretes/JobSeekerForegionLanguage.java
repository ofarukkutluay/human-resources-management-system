package kutluaycomp.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="job_seeker_foreign_languages")
public class JobSeekerForegionLanguage {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@JsonIgnore()
	@ManyToOne()
	@JoinColumn(name = "curriculum_vitae_id", referencedColumnName = "id")
	private CurriculumVitae curriculumVitae;
	
	@ManyToOne()
	@JoinColumn(name = "foreign_language_id", referencedColumnName = "id")
	private ForeignLanguage foreignLanguage;
	
	@Column(name="level")
	private int level;
}
