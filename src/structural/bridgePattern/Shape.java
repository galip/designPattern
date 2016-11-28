package structural.bridgePattern;

/**
 * Nov 26, 2016
 * @author galip
 *
 */
public abstract class Shape {
	
	protected Drawing drawing;
	
	public Shape(Drawing drawing) {
		this.drawing = drawing;
	}
	
	public abstract void draw();
	
	public abstract void drawLine();
	public abstract void drawCircle();
}