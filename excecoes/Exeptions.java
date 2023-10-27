package excecoes;

public class Exeptions {
    
    public static long fatorial(int n){
        if(n < 0){
            throw new ValorNegativoException("O número deve ser positivo");
        }
        if(n == 0 || n == 1){
            return 1;
        }
        return n * fatorial(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(fatorial(-5));
    }

}
