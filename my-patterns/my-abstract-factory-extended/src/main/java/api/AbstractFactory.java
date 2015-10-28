package api;

import api.ColorFactory.COLOR;
import api.ShapeFactory.SHAPE;

public abstract class AbstractFactory {
    public abstract Color getColor(COLOR color);

    public abstract Shape getShape(SHAPE shape);
}
