package AppCmdMath;

public class Somas {
    public static void main(String[] args) {
        System.out.println(soma(1, 2));
        System.out.println(soma(1, 2, 3));
        System.out.println(soma(1, 2, 3, 4));
        System.out.println(soma(1, 2, 3, 4, 5));
        System.out.println(soma(1, 2, 3, 4, 5, 6));
    }
    public static int soma(int... args){
        int soma = 0;
        for (int valor: args){
            soma += valor;
        }
        return soma;
    }
    
}
