package demo;

import api.Circle;
import api.GreenCircle;
import api.RedCircle;
import api.Shape;

public class BridgeDemo {
    public static void main(String[] args) {
	Shape redCircle = new Circle(100, 100, 10, new RedCircle());
	Shape greenCircle = new Circle(100, 100, 10, new GreenCircle());

	redCircle.draw();
	greenCircle.draw();
    }
}
