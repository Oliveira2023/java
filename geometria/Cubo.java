package geometria;
// import java.util.*;

public class Cubo extends Geom3D{
    private final double lado;
    public Cubo(double lado){
        this.lado = lado;
    }
    @Override
    public double calcArea(){
        super.area = 6 * this.lado * this.lado;
        return super.area;
    }
    @Override
    public double calcVolume(){
        super.volume = this.lado * this.lado * this.lado;
        return super.volume;
    }
    @Override
    public String toString(){
        return String.format("Cubo:{\n area: %.2f\n volume: %.2f\n}", this.calcArea(), this.calcVolume());
    }
    @Override
    public boolean equals(Object obj){
        if(obj instanceof Cubo){
            Cubo cubo = (Cubo) obj;
            return this.lado == cubo.lado;
        }
        return false;
    }
    public static void main(String[] args){
        Cubo cubo1 = new Cubo(1);
        Cubo cubo2 = new Cubo(1);
        System.out.println(cubo1);//aqui invoca o método toString e detro do método chama outros metodos
        
        System.out.println(cubo2);
        if(cubo1.equals(cubo2)){// invoke equals
            System.out.println("Figuras Geométricas iguais");
        }else{
            System.out.println("Figuras Geométricas diferentes");
        }
    }
}
