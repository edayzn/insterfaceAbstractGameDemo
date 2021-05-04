package Adapters;

import java.rmi.RemoteException;

import Entities.Gamer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;


public class MernisServiceAdapter  {

	public static boolean CheckIfRealPerson(Gamer gamer) {
		boolean control=false;
		KPSPublicSoap kpsPublicSoap= new KPSPublicSoapProxy();
			
		try {
			control=kpsPublicSoap.TCKimlikNoDogrula(Long.parseLong(gamer.getNationalityId()), gamer.getFirstName().toUpperCase(), gamer.getLastName().toUpperCase(), gamer.getYearOfBirth());
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		return control;
	
	}
	
	
}
