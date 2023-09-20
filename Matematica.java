public class Matematica {
    static int mult(int a, int b){
        return a * b;
    }
    static double mult(double a, double b){
        return a * b;
    }
    static double mult(double a, double b, double c){
        return a * b * c;
    }
    public static void main(String[] args){
        System.out.println(mult(2, 3));
        System.out.println(mult(2.0, 3.0));
        System.out.println(mult(2.0, 3.0, 4.0));
    }
}
