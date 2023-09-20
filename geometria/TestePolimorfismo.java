package geometria;

public class TestePolimorfismo {
    
    public static void main(String[] args) {
        Geom2D objCirculo = new Circulo(2.9);
        objCirculo.calcPerimetro();
        Geom2D objTriangulo = new Triangulo(6);
        objTriangulo.calcPerimetro();
        Geom2D maxPeri = maxPerimetro(objCirculo, objTriangulo);
        System.out.println("Maior Perimetro: "+ maxPeri);

        if (maxPeri instanceof Circulo){
            Circulo max = (Circulo) maxPeri;
            System.out.println("Max Circulo: "+ max);

        }else{
            Triangulo max = (Triangulo) maxPeri;
            System.out.println("Max Triangulo: "+ max);
        }
        public static Geom2D maxPerimetro(Geom2D geom1, Geom2D geom2){
            if (geom1.calcPerimetro() > geom2.calcPerimetro()){
                return geom1;
            }else{
                return geom2;
            }
        }
    }
}
