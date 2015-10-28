package api;

import api.ColorFactory.COLOR;

public class ShapeFactory extends AbstractFactory {

    public static enum SHAPE {
	CIRCLE, RECTANGLE, SQUARE
    }

    @Override
    public Color getColor(COLOR color) {
	return null;
    }

    @Override
    public Shape getShape(SHAPE shape) {
	switch (shape) {
	case CIRCLE:

	    return new Circle();
	case RECTANGLE:

	    return new Rectangle();
	case SQUARE:

	    return new Square();
	default:
	    return null;
	}

    }

}
