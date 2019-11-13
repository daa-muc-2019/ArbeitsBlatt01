
public class Head {
	
	int xPos, yPos;
	private Ellipse face;
	private Nostril leftnostril, rightNostril;
	private Eye rightEye, leftEye;
	private Ear leftEar, rightEar;
	
	Head(int x, int y, Colour initialColour){
		this.xPos = x;
		this.yPos = y;
		
		this.face = new Ellipse(80, 120, xPos, yPos, initialColour);
		this.leftnostril = new Nostril(xPos+20, yPos+84);
		this.rightNostril = new Nostril(xPos+50, yPos+84);
		this.rightEye = new Eye(x+10, y+31, initialColour);
		this.leftEye = new Eye(x+50, y+31, initialColour);
		this.leftEar = new Ear(x-35, y+10, initialColour);
		this.rightEar = new Ear(xPos+66, yPos+10, initialColour);
	}
	
	void draw() {
		this.face.draw();
		this.leftnostril.draw();
		this.rightNostril.draw();
		this.rightEye.draw();
		this.leftEye.draw();
		this.leftEar.draw();
		this.rightEar.draw();
		
	}

	public void sniff() {


		this.rightNostril.sniff();
		this.leftnostril.sniff();
		HelperClass.wait(1000);
		rightNostril.unsniff();
		leftnostril.unsniff();
		
		
	}

}
