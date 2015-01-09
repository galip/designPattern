package behavioural.strategyPattern;

/** 
 * 07 Jan 2015
 * 
 * @author gpala
 */

/** Description of Strategy class */
public class Strategy {

	private TaskOperations taskOperations;

	public Strategy(TaskOperations taskOperations) {
		this.taskOperations = taskOperations;
	}
	
	/**
	 * this method runs doYourJobHere method
	 * @return no return value
	 */
	public void callStrategy() {
		taskOperations.doYourJobHere();
	}
	
}
