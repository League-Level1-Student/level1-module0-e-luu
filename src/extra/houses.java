package extra;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class houses {
	static Robot r;

	public static void main(String[] args) {
		r = new Robot();
		r.moveTo(100, 500);
		r.penDown();
		r.setSpeed(20);
		r.setPenColor(Color.GREEN);
		r.turn(90);
		r.move(50);
		house("small", Color.BLUE);
		house("medium", Color.PINK);
		house("large", Color.GRAY);
		house("medium", Color.MAGENTA);
		house("small", Color.ORANGE);
		house("medium", Color.YELLOW);
		house("large", Color.CYAN);
		house("small", Color.BLACK);
		house("large", Color.RED);

	}

	public static void house(String height, Color color) {
		int tall = 0;
		boolean ispointy = false;
		if (height.equals("small")) {
			tall = 60;
			ispointy = false;
		}
		if (height.equals("medium")) {
			tall = 120;
			ispointy = false;
		}
		if (height.equals("large")) {
			tall = 250;
			ispointy = true;
		}

		r.setPenColor(color);
		r.turn(270);
		r.move(tall);
		if (ispointy == true) {
			drawflatroof();
		} else {
			drawpointyroof();
		}
		r.move(tall);
		r.setPenColor(Color.GREEN);
		r.turn(270);
		r.move(50);
	}

	public static void drawpointyroof() {
		r.turn(45);
		r.move(50);
		r.turn(90);
		r.move(50);
		r.turn(45);
	}

	public static void drawflatroof() {
		r.turn(90);
		r.move(50);
		r.turn(90);
	}
}
