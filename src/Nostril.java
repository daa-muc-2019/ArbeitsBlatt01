
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

	public void sniff() {
		this.nostril.setHorizontalLength(18);
		this.nostril.setVerticalLength(18);
		this.nostril.move(-4, -4);
		this.nostril.draw(); 
		
	}

	public void unsniff() {
		this.nostril.erase();
		this.nostril.setHorizontalLength(10);
		this.nostril.setVerticalLength(10);
		this.nostril.move(4, 4);
		this.nostril.draw();		
	}
	
}
