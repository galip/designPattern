package structural.adapter;

/**
 * Nov 23, 2016
 * @author galip
 *
 */
public class IphoneChargeAdapter implements IphoneCharger {
	
	AdvancedIphoneCharger advancedIphoneCharger;
	
	public IphoneChargeAdapter(String iphoneType) {
		if(iphoneType.equals("iphone6")) {
			advancedIphoneCharger = new Iphone6Charger();
		} else if(iphoneType.equals("iphone5")) {
			advancedIphoneCharger = new Iphone5Charger();
		}
	}

	@Override
	public void makeCharge(String iphoneType) {
		
		if(iphoneType.equals("iphone5")) {
			advancedIphoneCharger.makeChargeToIphone5();
		} else if(iphoneType.equals("iphone6")) {
			advancedIphoneCharger.makeChargeToIphone6();
		}
	}
}