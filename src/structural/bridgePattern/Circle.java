package structural.bridgePattern;

/**
 * Nov 26, 2016
 * @author galip
 *
 */
public class Circle extends Shape {

	public Circle(Drawing drawing) {
		super(drawing);
	}
	
	public void draw() {
		drawing.drawCircle();
	}
	
	public void drawCircle() {
		System.out.println("Circle drawCircle()");
	}

	@Override
	public void drawLine() {
	}
}