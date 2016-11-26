package structural.adapter;

/**
 * Nov 23, 2016
 * @author galip
 *
 */
public class Demo {
	
	public static void main (String args[]) {
		
		Iphone3Charger iphone3Charger = new Iphone3Charger();
		
		iphone3Charger.makeCharge("iphone3");
		iphone3Charger.makeCharge("iphone5");
		iphone3Charger.makeCharge("iphone6");
		
		iphone3Charger.makeCharge("ipehe");
		
	}
}