package kutluaycomp.hrms.core.adapters.personCheck;

import java.rmi.RemoteException;

import kutluaycomp.hrms.entities.concretes.JobSeeker;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisCheckManager implements PersonCheckService{

	@Override
	public boolean checkIfRealPerson(JobSeeker jobSeeker) {
		KPSPublicSoap tc = new KPSPublicSoapProxy();
		boolean dogruMu = false;
		try {
			dogruMu = tc.TCKimlikNoDogrula(Long.parseLong(jobSeeker.getNationalityId()), jobSeeker.getFirstName().toUpperCase(),
					jobSeeker.getLastName().toUpperCase(), jobSeeker.getDateOfBirth().getYear());
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (RemoteException e) {

			e.printStackTrace();
		}
		return dogruMu;
	}

}
