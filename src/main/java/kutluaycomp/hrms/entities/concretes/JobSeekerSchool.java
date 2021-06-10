package kutluaycomp.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;
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
	
	@ManyToOne()
	@PrimaryKeyJoinColumn(name = "job_seeker_id", referencedColumnName = "user_id")
	private JobSeeker jobSeeker;
	
	@ManyToOne()
	@JoinColumn(name = "school_id", referencedColumnName = "id")
	private School school;
	
	@NotNull
	@Column(name="school_start_year")
	private int schoolStartYear;
	
	@Column(name="school_final_year")
	private int schoolFinalYear;

}
