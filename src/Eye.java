
public class Eye {

	private int xPos, yPos;
	private Ellipse iris, pupil, eyeLid;
	private Colour colour;
	
	public Eye(int x, int y, Colour initialColour) {

		this.xPos = x;
		this.yPos = y;
		this.colour = initialColour;
		this.iris = new Ellipse(20, 20, xPos, yPos, Colour.BLACK);
		this.pupil = new Ellipse(8, 8, xPos+6, yPos+7, Colour.WHITE);
		this.eyeLid = new Ellipse(20, 20, xPos, yPos-3, initialColour);
	
	}
	
	void draw() {
		this.iris.draw();
		this.pupil.draw();
	}
	
}
