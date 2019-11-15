
public class Head {
	
	int xPos, yPos;
	private Ellipse face;
	private Nostril leftNostril, rightNostril;
	private Eye rightEye, leftEye;
	private Ear leftEar, rightEar;
	private Colour colour;
	
	Head(int x, int y, Colour initialColour){
		this.xPos = x;
		this.yPos = y;
		this.colour = initialColour;
		
		this.face = new Ellipse(80, 120, xPos, yPos, this.colour);
		this.leftNostril = new Nostril(xPos+20, yPos+84);
		this.rightNostril = new Nostril(xPos+50, yPos+84);
		this.rightEye = new Eye(x+10, y+31, this.colour);
		this.leftEye = new Eye(x+50, y+31, this.colour);
		this.leftEar = new Ear(x-35, y+10, this.colour);
		this.rightEar = new Ear(xPos+66, yPos+10, this.colour);
	}
	
	void draw() {
		this.face.draw();
		this.leftNostril.draw();
		this.rightNostril.draw();
		this.rightEye.draw();
		this.leftEye.draw();
		this.leftEar.draw();
		this.rightEar.draw();
		
	}

	public void sniff() {
		this.rightNostril.sniff();
		this.leftNostril.sniff();
		HelperClass.wait(1000);
		this.rightNostril.unsniff();
		this.leftNostril.unsniff();
	}

	public void wagEear() {
		this.rightEar.wagEar();
	}

	public void bringHeadDown() {
		this.move(0, +90);
		draw();
	}

	private void move(int xDelta, int yDelta) {
		this.face.move(xDelta, yDelta);
		this.leftNostril.move(xDelta, yDelta);
		this.rightNostril.move(xDelta, yDelta);
		this.leftEar.move(xDelta, yDelta);
		this.rightEar.move(xDelta, yDelta);
		this.leftEye.move(xDelta, yDelta);
		this.rightEye.move(xDelta, yDelta);
		this.draw();
	}

	public void setColour(Colour initialColour) {
		this.colour = initialColour;
		this.face.setColour(initialColour);
		this.leftEar.setColour(initialColour);
		this.rightEar.setColour(initialColour);
		this.leftEye.setColour(initialColour);
		this.rightEye.setColour(initialColour);
		this.draw();		
	}

	public void bringHeadUp() {
		this.move(0, -90);
		this.draw();
	}

	public void erase() {
		this.face.erase();
		this.leftNostril.erase();
		this.rightNostril.erase();
		this.rightEar.erase();
		this.leftEar.erase();
		this.leftEye.erase();
		this.rightEye.erase();
	}

	public void sleep() {
		this.leftEye.closeEyeLid();
		this.rightEye.closeEyeLid();		
	}

	public void wakeUp() {
		leftEye.openEyeLid();
		rightEye.openEyeLid();		
	}

	public void wink() {
		this.leftEye.closeEyeLid();
		HelperClass.wait(1000);
		this.leftEye.openEyeLid();		
	}
}
