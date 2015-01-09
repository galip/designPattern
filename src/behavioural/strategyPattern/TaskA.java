package behavioural.strategyPattern;

/**
 * 07 Jan 2015
 * 
 * @author gpala
 */

/** Description of TaskA class */
public class TaskA implements TaskOperations {

	/**
	 * this method is overridden
	 * represents businees logic of TaskA
	 * prints out "TaskA business logic is here"
	 * @return no return value
	 */
	@Override
	public void doYourJobHere() {
		System.out.println("TaskA business logic must be implemented here.");
	}
}
