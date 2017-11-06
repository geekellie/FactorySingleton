package modele.contrats;

public interface IPoint2D extends IPoint{

    void translate(double x, double y);
    void distance(IPoint2D other);


}
