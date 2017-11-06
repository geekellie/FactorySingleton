package main;

import modele.contrats.IShapes2d;
import modele.factory.ShapesFactory;

public final class Main {

    public static void main(String[]args) {
        IShapes2d rec1 = ShapesFactory.INSTANCE.createRectangle(3.5d, 2.3d);
        System.out.println(rec1);
    }


}
