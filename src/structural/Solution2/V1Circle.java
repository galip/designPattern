package structural.Solution2;

/**
 * Nov 25, 2016
 * @author galip
 *
 */
public class V1Circle extends V1Shape {

	public void draw() {
		drawCircle();
	}

	@Override
	public void drawCircle() {
		DP1.drawCircle();
//		System.out.println("V1Circle drawCircle()");
	}
	
	@Override
	public void drawLine() {
	}
}