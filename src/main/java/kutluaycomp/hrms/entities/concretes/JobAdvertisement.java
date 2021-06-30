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
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "job_advertisements")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler", "jobAdvertisement" })
public class JobAdvertisement {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
//	@Column(name="employer_id")
//	private int employerId;

//	@NotNull
//	@Column(name="job_position_id")
//	private int jobPositionId;

	@NotEmpty
	@Column(name = "job_description")
	private String jobDescription;

//	@NotNull
//	@Column(name = "cities_id")
//	private int citiesId;

	@Column(name = "salary_min")
	private double salaryMin;

	@Column(name = "salary_max")
	private double salaryMax;

	@NotNull
	@Column(name = "open_position_total")
	private int openPositionTotal;

	@NotNull
	@Column(name = "creation_date")
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
	private LocalDate creationDate;

	@NotNull
	@Column(name = "deadline")
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
	private LocalDate deadline;

	@NotNull
	@Column(name = "activated")
	private boolean activated;
	
	@ManyToOne()
	@JoinColumn(name = "activation_system_personnel_id", referencedColumnName = "user_id")
	private SystemPersonnel systemPersonnel;

	@Column(name = "activation_date")
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
	private LocalDate activationDate;
	
	@ManyToOne()
	@JoinColumn(name="employer_id", referencedColumnName = "user_id")
	private Employer employer;

	@ManyToOne()
	@JoinColumn(name = "job_position_id", referencedColumnName = "id")
	private JobPosition jobPosition;

	@ManyToOne()
	@JoinColumn(name = "cities_id", referencedColumnName = "id")
	private City city;
	
	@ManyToOne()
	@JoinColumn(name = "way_of_working_id", referencedColumnName = "id")
	private WayOfWorking wayOfWorking;
	
	@ManyToOne()
	@JoinColumn(name = "working_time_id", referencedColumnName = "id")
	private WorkingTime workingTime;

}
