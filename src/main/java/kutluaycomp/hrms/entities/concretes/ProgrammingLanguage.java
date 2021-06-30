package kutluaycomp.hrms.entities.concretes;

import java.util.List;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="programming_languages")
public class ProgrammingLanguage {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@NotNull
	@Column(name="name")
	private String name;
	
	@JsonIgnore
	@OneToMany(mappedBy = "programmingLanguage")
	private List<JobSeekerProgrammingLanguage> jobSeekerProgramminLanguages;
}
