package behavioural.strategyPattern;

/**
 * 07 Jan 2015
 * 
 * @author gpala
 */

/** Description of TaskB class */
public class TaskB implements TaskOperations{

	/**
	 * this method is overridden
	 * represents businees logic of TaskB
	 * prints out "TaskB business logic is here"
	 * @return no return value
	 */
	@Override
	public void doYourJobHere() {
		System.out.println("TaskB business logic must be implemented here.");
	}
}
