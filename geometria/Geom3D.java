package geometria;
public abstract class Geom3D {
    protected double area;
    protected double volume;
    public abstract double calcArea();
    public abstract double calcVolume();
    public double getArea(){
        return area;
    }
    public double getVolume(){
        return volume;
    }
}
