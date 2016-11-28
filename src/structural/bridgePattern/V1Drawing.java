package structural.bridgePattern;

/**
 * Nov 26, 2016
 * @author galip
 *
 */
public class V1Drawing implements Drawing {
	
//	public void draw() {
//		drawLine();
//		drawCircle();
//	}
	
	@Override
	public void drawLine() {
		DP1.drawAline();
	}

	@Override
	public void drawCircle() {
		DP1.drawACircle();
	}
}