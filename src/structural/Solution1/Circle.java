package structural.Solution1;

/**
 * Nov 24, 2016
 * @author galip
 *
 */
public abstract class Circle extends Shape {

	@Override
	public void draw() {
		drawCircle();
	}
	
	 abstract protected void drawCircle();
}