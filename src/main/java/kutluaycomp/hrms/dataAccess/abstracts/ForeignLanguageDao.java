package kutluaycomp.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kutluaycomp.hrms.entities.concretes.ForeignLanguage;

public interface ForeignLanguageDao extends JpaRepository<ForeignLanguage, Integer> {

}
