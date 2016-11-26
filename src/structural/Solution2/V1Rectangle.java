package structural.Solution2;

/**
 * Nov 25, 2016
 * @author galip
 *
 */
public class V1Rectangle extends V1Shape {
	
	public void draw() {
		drawLine();
	}
	
	@Override
	public void drawLine() {
		DP1.drawLine();
//		System.out.println("V1Rectangle drawLine()");
	}

	@Override
	public void drawCircle() {
	}
}