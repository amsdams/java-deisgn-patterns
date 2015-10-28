package api;

import api.ShapeFactory.SHAPE;

public class ColorFactory extends AbstractFactory {

    public static enum COLOR {
	BLUE, RED, GREEN
    }

    @Override
    public Color getColor(COLOR color) {
	switch (color) {
	case BLUE:
	    return new Blue();

	case RED:
	    return new Red();

	case GREEN:
	    return new Green();

	default:
	    return null;
	}

    }

    @Override
    public Shape getShape(SHAPE shape) {
	return null;
    }

}
