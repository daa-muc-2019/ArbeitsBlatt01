
public class Nostril {

	private Ellipse nostril;

	private int xPos, yPos;

	public Nostril(int x, int y) {

		this.xPos = x;
		this.yPos = y;
		this.nostril = new Ellipse(10, 10, xPos, yPos, Colour.BLACK);

	}

	public void draw() {
		this.nostril.draw();
	}
	
}
