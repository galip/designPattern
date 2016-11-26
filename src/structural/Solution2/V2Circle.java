package structural.Solution2;

/**
 * Nov 25, 2016
 * @author galip
 *
 */
public class V2Circle extends V2Shape {
	
	public void draw() {
		drawCircle();
	}
	
	@Override
	public void drawLine() {
	}

	@Override
	public void drawCircle() {
		DP2.drawCircle();
//		System.out.println("V2Circle drawCircle()");
	}
}