package behavioural.strategyPattern;

/**
 * 07 Jan 2015
 * 
 * @author gpala
 */

/** Description of TaskC class */
public class TaskC implements TaskOperations {

	/**
	 * this method is overridden
	 * represents businees logic of TaskC
	 * prints out "TaskC business logic is here"
	 * @return no return value
	 */
	@Override
	public void doYourJobHere() {
		System.out.println("TaskB business logic must be implemented here.");
	}
}
