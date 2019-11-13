
public class Sheep {

	private int xPos, yPos;
	private Colour colour;
	private Ellipse body, tail;
	private Head head;
	private Leg rightLegBack, rightLegFront, leftLegBack, lefttLegFront;
	
	public Sheep(int x, int y, Colour initialColour) {

		this.xPos = x;
		this.yPos = y;
		this.colour = initialColour;
		this.head = new Head(xPos-60, yPos-40, initialColour);
		this.body = new Ellipse(180, 120, xPos, yPos, initialColour);
		this.tail = new Ellipse(20, 50, xPos+174, yPos+60, initialColour);
		this.rightLegFront = new Leg(xPos+5, yPos+80);
		this.rightLegBack = new Leg(xPos+125, yPos+80);
		this.lefttLegFront = new Leg(xPos+30, yPos+90);
		this.leftLegBack = new Leg(xPos+150, yPos+90);
	
	}
	
	void draw() {
		this.head.draw();
		this.rightLegBack.draw();
		this.rightLegFront.draw();
		this.body.draw();
		this.tail.draw();
		this.lefttLegFront.draw();
		this.leftLegBack.draw();
	}

	public void sniff() {

		HelperClass.wait(1000);
		head.sniff();
		
		
		
	}
}
