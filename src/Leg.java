
public class Leg {

	private int xPos, yPos;
	private Ellipse leg;

	public Leg(int x, int y) {
		this.xPos = x;
		this.yPos = y;
		this.leg = new Ellipse(20, 80, xPos, yPos, Colour.BLACK);
	}

	public void draw() {
		this.leg.draw();
	}

}
