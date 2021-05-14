package kutluaycomp.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="system_personnels")
public class SystemPersonnel {
	@Id
	@Column(name="user_id")
	private int userId;
	@Column(name="operation_claim_id")
	private int operationClaimId;
	

}
