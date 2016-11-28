package structural.bridgePattern;

/**
 * Nov 26, 2016
 * @author galip
 *
 */
public class Client {
	
	public static void main (String args[]) {
		
		System.out.println("---DP1---");
		Shape rectangle = new Rectangle(new V1Drawing());
		rectangle.draw();
		
		Shape circle = new Circle(new V1Drawing());
		circle.draw();
		
		System.out.println("---DP2---");
		Shape rectangle2 = new Rectangle(new V2Drawing());
		rectangle2.draw();
		
		Shape circle2 = new Circle(new V2Drawing());
		circle2.draw();
		
		
	}
}