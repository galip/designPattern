package structural.Solution2;

/**
 * Nov 25, 2016
 * @author galip
 *
 */
public class V2Rectangle extends V2Shape {
	
	public void draw() {
		drawLine();
	}
	
	@Override
	public void drawLine() {
		DP2.drawLine();
//		System.out.println("V2Rectangle drawLine()");
	}

	@Override
	public void drawCircle() {
	}
}