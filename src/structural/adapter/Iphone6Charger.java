package structural.adapter;

/**
 * Nov 23, 2016
 * @author galip
 *
 */
public class Iphone6Charger implements AdvancedIphoneCharger {

	@Override
	public void makeChargeToIphone6() {
		System.out.println("Iphone6 is charging.");
		
	}
	
	@Override
	public void makeChargeToIphone5() {
		//do nothing
	}
}