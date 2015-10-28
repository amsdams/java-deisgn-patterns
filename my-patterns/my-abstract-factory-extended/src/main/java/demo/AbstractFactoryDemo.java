package demo;

import api.AbstractFactory;
import api.Color;
import api.ColorFactory.COLOR;
import api.FactoryProducer.CHOICE;
import api.FactoryProducer;
import api.Shape;
import api.ShapeFactory.SHAPE;

public class AbstractFactoryDemo {

    public static void main(String[] args) {
	// get shape factory
	AbstractFactory shapeFactory = FactoryProducer.getFactory(CHOICE.SHAPE);

	// get an object of Shape Circle
	Shape shape1 = shapeFactory.getShape(SHAPE.CIRCLE);

	// call draw method of Shape Circle
	shape1.draw();

	// get an object of Shape Rectangle
	Shape shape2 = shapeFactory.getShape(SHAPE.RECTANGLE);

	// call draw method of Shape Rectangle
	shape2.draw();

	// get an object of Shape Square
	Shape shape3 = shapeFactory.getShape(SHAPE.SQUARE);

	// call draw method of Shape Square
	shape3.draw();

	// get color factory
	AbstractFactory colorFactory = FactoryProducer.getFactory(CHOICE.COLOR);

	// get an object of Color Red
	Color color1 = colorFactory.getColor(COLOR.RED);

	// call fill method of Red
	color1.fill();

	// get an object of Color Green
	Color color2 = colorFactory.getColor(COLOR.GREEN);

	// call fill method of Green
	color2.fill();

	// get an object of Color Blue
	Color color3 = colorFactory.getColor(COLOR.BLUE);

	// call fill method of Color Blue
	color3.fill();

    }

}
