package structural.adapter;

/**
 * Nov 23, 2016
 * @author galip
 *
 */
public class Iphone3Charger implements IphoneCharger {
	
	//it provides to charge for ipphone5 and iphone6 via iPnone3Charger
	IphoneChargeAdapter iphoneChargeAdapter;
	
	@Override
	public void makeCharge(String iphoneType) {
		
		if(iphoneType.equals("iphone3")) {
			System.out.println("Iphone3 is charging.");
		} else if (iphoneType.equals("iphone5") || iphoneType.equals("iphone6")) {
			iphoneChargeAdapter = new IphoneChargeAdapter(iphoneType);
			iphoneChargeAdapter.makeCharge(iphoneType);
		} else {
			System.out.println("Not supported.");
		}
		
	}
}