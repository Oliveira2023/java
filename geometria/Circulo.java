package geometria;

public class Circulo extends Geom2D {

    private final float pi;
    private final float raio;

    public Circulo(float raio){
            this.raio = raio;
            pi = 3.14f;
        }
    @Override
        public double calcPerimetro(){
            super.perimetro = 2 * this.raio * this.pi;
            return super.perimetro;
        }
    @Override
        public double calcArea(){
            super.area = this.pi * Math.pow(this.raio, 2);
            return super.area;
        }
    @Override
        public String toString(){
            return String.format("Circulo:{\n peri: %.2f\n area: %.2f\n}", this.calcPerimetro(), this.calcArea());
        }
    @Override
        public boolean equals(Object obj){
            if(obj instanceof Circulo){
                Circulo circulo = (Circulo) obj;
                return this.raio == circulo.raio;
            }
            return false;
        }
    
    public static void main(String[] args) {
        Circulo circulo = new Circulo(2.9f);
        System.out.println(circulo);
        Circulo circulo2 = new Circulo(3.2f);
        System.out.println(circulo2);

        if(circulo.equals(circulo2)){
            System.out.println("Figuras Geométricas iguais");
        }else{
            System.out.println("Figuras Geométricas diferentes");
        };

        
        
    }
}
