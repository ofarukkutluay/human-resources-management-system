package kutluaycomp.hrms.entities.concretes;

import java.util.List;

import javax.persistence.*;

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
@Table(name="system_personnels")
@PrimaryKeyJoinColumn(name="user_id",referencedColumnName = "id")
@EqualsAndHashCode(callSuper = true)
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "user"})
public class SystemPersonnel extends User{

	@ManyToOne()
    @JoinColumn(name = "operation_claim_id", referencedColumnName = "id")
    private OperationClaim operationClaim;
	
	@JsonIgnore
	@OneToMany(mappedBy = "systemPersonnel")
	private List<Employer> employers;
	
	@JsonIgnore
	@OneToMany(mappedBy = "systemPersonnel")
	private List<JobAdvertisement> jobAdvertisements;

}
