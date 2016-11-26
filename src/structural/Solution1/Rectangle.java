package structural.Solution1;

/**
 * Nov 24, 2016
 * @author galip
 *
 */
public abstract class Rectangle extends Shape {

	@Override
	public void draw() {
		drawLine();
	}
	
	abstract protected void drawLine();
}