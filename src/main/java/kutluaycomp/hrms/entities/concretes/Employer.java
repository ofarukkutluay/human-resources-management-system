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
@PrimaryKeyJoinColumn(name="user_id",referencedColumnName = "id")
@Table(name = "employers")
@EqualsAndHashCode(callSuper = true)
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler", "employer" })
public class Employer extends User {

	@NotEmpty
	@Column(name = "company_name")
	private String companyName;

	@NotEmpty
	@Column(name = "company_website")
	private String companyWebsite;

	@NotEmpty
	@Column(name = "phone_number")
	private String phoneNumber;

	@NotNull
	@Column(name = "activated")
	private boolean activated;

	@ManyToOne()
	@JoinColumn(name = "activation_system_personnel_id", referencedColumnName = "user_id")
	private SystemPersonnel systemPersonnel;

	@Column(name = "activation_date")
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
	private LocalDate activationDate;

	@JsonIgnore
	@OneToMany(mappedBy = "employer")
	private List<JobAdvertisement> jobAdvertisements;


}
