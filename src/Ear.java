
public class Ear {
	
	private int xPos, yPos;
	private Ellipse ear;
	private Colour colour;
	
	public Ear(int x, int y, Colour initialColour) {
		this.xPos = x;
		this.yPos = y;
		this.colour = initialColour;
		this.ear = new Ellipse(50, 20, xPos, yPos, initialColour);
	}
	
	public void draw() {
		this.ear.draw();
	}

}
