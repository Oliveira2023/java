/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geometria2;

/**
 *
 * @author lucia
 */
public class Cubo extends Geom3D {
    private final double lado;
    
    public Cubo(double lado) {
        this.lado = lado;
    }
    @Override
    public double calcArea() {
        super.area = 6 * this.lado * this.lado;
        return super.area;
    }
    @Override
    public double calcVolume() {
        super.volume = this.lado * this.lado *this.lado;
        return super.volume;
    }
    @Override
    public String toString() {
        return String.format("Cubo:{\n Area: %.2f\n Vol: %.2f\n}",
                this.calcArea(), this.calcVolume());
    }
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Cubo){
            Cubo cubo = (Cubo)obj;
            return this.lado == cubo.lado;
        }else{
            return false;
        }
    }
}
