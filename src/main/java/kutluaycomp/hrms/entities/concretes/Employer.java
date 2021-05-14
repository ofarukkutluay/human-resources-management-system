package kutluaycomp.hrms.entities.concretes;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;


@Data
@Entity
@Table(name="employers")
public class Employer {
	@Id
	@Column(name="user_id")
	private int userId;
	
	@Column(name="company_name")
	private String companyName;
	
	@Column(name="company_website")
	private String companyWebsite;
	
	@Column(name="phone_number")
	private String phoneNumber;
	
	@Column(name="activated")
	private boolean activated;
	
	@Column(name="activation_system_personnel_id")
	private int activationSystemPersonnelId;
	
	@Column(name="activation_date")
	private Date activationDate;


}
