package behavioural.strategyPattern;

/**
 * This programmes simply shows how Strategy pattern works.
 * 
 * 07 Jan 2015
 * 
 * @author gpala
 */

/** Description of StrategyDemo class */
public class StrategyDemo {

	/**
	 * this method displays different class callings at runtime.
	 * Each class does their own businees logic here.
	 * prints out dummy message, just for an example.
	 * 
	 */
	public static void main(String args[]) {
		
		Strategy strategy = new Strategy(new TaskA());
		strategy.callStrategy();
		
		strategy = new Strategy(new TaskB());
		strategy.callStrategy();
		
		strategy = new Strategy(new TaskC());
		strategy.callStrategy();
		
	}
}
