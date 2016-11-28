package structural.bridgePattern;

import java.awt.Shape;

/**
 * Nov 26, 2016
 * @author galip
 *
 */
public class V2Drawing implements Drawing {

	@Override
	public void drawLine() {
		DP2.drawLine();
	}

	@Override
	public void drawCircle() {
		DP2.drawCircle();
	}
}