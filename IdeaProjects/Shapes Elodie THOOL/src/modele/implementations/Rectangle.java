package modele.implementations;

import modele.contrats.IShapes;

public class Rectangle extends Shapes2D implements IShapes {

    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length=length;
        this.width=width;
    }

    @Override
    public double perimeter(){

        return 2*(this.length + this.width);
    }

    @Override
    public double surface() {

        return this.length * this.width;
    }

    @Override
    public String toString(){
        StringBuilder sb= new StringBuilder();
        sb.append("Shape type : " + this.getClass().getName()).append(NL)
                .append(TAB).append("Length : " + this.length).append(NL)
                .append(TAB).append("Width : " + this.width).append(NL)
                .append(TAB).append("Perimetre : " + this.perimeter()).append(NL)
                .append(TAB).append("Surface : " + this.surface());

        return sb.toString();
    }

}
