package structural.bridgePattern;

/**
 * Nov 26, 2016
 * @author galip
 *
 */
public class Rectangle extends Shape {
	
	public Rectangle(Drawing drawing) {
		super(drawing);
	}
	
	public void draw() {
		drawing.drawLine();
	}
	
	@Override
	public void drawLine() {
//		drawing.drawLine();
		System.out.println("Rectangle drawLine()");	
	}

	@Override
	public void drawCircle() {
	}
}