package de.bundeswehr;

import de.bundeswehr.graphics.Colour;
import de.bundeswehr.sheep.Sheep;

public class Main {

	public static void main(String[] args) {

		
		Sheep dolly = new Sheep(170, 100, Colour.RED);
		dolly.draw();
		dolly.sniff();
		dolly.eat();
	}

}
