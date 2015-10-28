package api;

public class FactoryProducer {
    public static final String SHAPE = "SHAPE";
    public static final String COLOR = "COLOR";

    public static enum CHOICE {
	SHAPE, COLOR
    }

    public static AbstractFactory getFactory(CHOICE choice) {
	switch (choice) {
	case SHAPE:

	    return new ShapeFactory();
	case COLOR:

	    return new ColorFactory();
	default:
	    return null;
	}

	
    }
}
