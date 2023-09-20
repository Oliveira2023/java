package geometria;
public class retangulo extends Geom2D{
    private final double base;
    private final double altura;
    public retangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }
    public retangulo(double base){
        this.base = base;
        this.altura = base;
    }
    @Override
    public double calcPerimetro(){
        super.perimetro = 2 * this.base + 2 * this.altura;
        return super.perimetro;
    }
    @Override
    public double calcArea(){
        super.area = this.base * this.altura;
        return super.area;
    }
    @Override
    public String toString(){
        return String.format("Rect:{\n peri: %.2f\n area: %.2f\n}", this.calcPerimetro(), this.calcArea());
    }
    @Override
    public boolean equals(Object obj){
        if(obj instanceof retangulo){
            retangulo r = (retangulo) obj;
            return this.base == r.base && this.altura == r.altura;
        }
        return false;
    }

    public static void main(String[] args){
        retangulo rect1 = new retangulo(4, 25);
        retangulo rect2 = new retangulo(4, 26);
        System.out.println(rect1);
        System.out.println(rect2);
        if(rect1.equals(rect2)){
            System.out.println("Figuras Geométricas iguais");
        }else{
            System.out.println("Figuras Geométricas diferentes");
        }
    }
}
