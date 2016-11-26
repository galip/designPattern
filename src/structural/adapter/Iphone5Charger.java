package structural.adapter;

/**
 * Nov 23, 2016
 * @author galip
 *
 */
public class Iphone5Charger implements AdvancedIphoneCharger {

	@Override
	public void makeChargeToIphone6() {
		//do nothing
	}

	@Override
	public void makeChargeToIphone5() {
	System.out.println("Iphone5 is charging.");
	}
}