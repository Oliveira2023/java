package excecoes;

public class ExemploAssercao {
    public static void main(String[] args) {
        //faça testes com as idadees 20, 12, -1, 84, -20
        int idade = -1;
        assert idade >= 0 : "idade deve ser positiva";
        System.out.printf("Idade: %d%n",idade);
    }
}
