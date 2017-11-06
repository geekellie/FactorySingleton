package modele.factory;


import modele.contrats.IShapes;
import modele.contrats.IShapes2d;
import modele.implementations.Rectangle;

public final class ShapesFactory {

    public static final ShapesFactory INSTANCE = new ShapesFactory();

    private ShapesFactory(){}

    public IShapes2d createRectangle(double length, double width){

        return new Rectangle(length, width);
    }

}
