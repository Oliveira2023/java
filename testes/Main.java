import java.util.Scanner;

public class Main{

    int numero1;
    int numero2;

    public Main(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }
    public static void main(String[] args) {
        System.out.println("Hello World!");
        // Scanner scanner = new Scanner(System.in);
        // System.out.println("Digite o primeiro número");
        // int primeiro = scanner.nextInt();
        // System.out.println("Digite o segundo número");
        // int segundo = scanner.nextInt();

        // Main meuCalc = new Main(primeiro, segundo);

        // meuCalc.div(primeiro, segundo);

        System.out.println(fatorial(-5));

    }

    public int div(int x, int y) {
        int resultado = 0;
        try {
            resultado = x / y;
        } catch (Exception e) {
            System.out.println("A divisão por zero não é permitida");
        }
        System.out.println("O resultado é: " + resultado);
        return resultado;
    }
    public static long fatorial(int n){
        if (n == 0){
            return 1;
        }
        if (n < 0){
            throw new IllegalArgumentException("n não pode ser negativo");
        }
        long resultado = 1;
        for (int i = 1; i <= n; i++){
            resultado *= i;
        }
        return resultado;
    }
}