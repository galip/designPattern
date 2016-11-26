package structural.Solution2;

/**
 * Nov 25, 2016
 * @author galip
 *
 */
public class Client {
	
	public static void main (String args[]) {
		
		//DP1
		V1Rectangle v1Rectangle = new V1Rectangle();
		v1Rectangle.draw();
		
		V1Circle v1Circle = new V1Circle();
		v1Circle.draw();
		
		//DP2
		V2Rectangle v2Rectangle = new V2Rectangle();
		v2Rectangle.draw();
		
		V2Circle v2Circle = new V2Circle();
		v2Circle.draw();
	}
}