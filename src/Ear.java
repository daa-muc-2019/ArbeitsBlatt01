
public class Ear {

	private int xPos, yPos;
	private Ellipse ear;
	private Colour colour;

	public Ear(int x, int y, Colour initialColour) {
		this.xPos = x;
		this.yPos = y;
		this.colour = initialColour;

		this.ear = new Ellipse(50, 20, xPos, yPos, this.colour);
	}

	public void draw() {
		this.ear.draw();
	}

	public void wagEar() {
		this.ear.erase();
		this.ear.setHorizontalLength(20);
		this.ear.setVerticalLength(50);
		this.ear.move(-5, -40);
		this.ear.draw();
		HelperClass.wait(1000);
		this.ear.erase();
		this.ear.setHorizontalLength(50);
		this.ear.setVerticalLength(20);
		this.ear.move(5, 40);
		this.ear.draw();
	}

	public void move(int xDelta, int yDelta) {
		ear.move(xDelta, yDelta);
	}

	public void setColour(Colour initialColour) {
		this.colour = initialColour;
		
		ear.setColour(initialColour);
	}

	public void erase() {
		this.ear.erase();
	}
}
