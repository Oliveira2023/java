package comparavel;

public class Main {
    
    public static void main(String[] args) {
        ComparaLivros c1 = new ComparaLivros("O Senhor dos Aneis", 35);
        ComparaLivros c2 = new ComparaLivros("Alice no pais", 23);
        ComparaLivros c3 = new ComparaLivros("Matrix", 28);
        ComparaLivros c4 = new ComparaLivros("Rei dos Monstros", 41);

        int comparaC1_C2 = c1.compareTo(c2);
        int comparaC1_C3 = c1.compareTo(c3);
        int comparaC1_C4 = c1.compareTo(c4);

        if (comparaC1_C2 > 0) {
            System.out.println("O licro" + "(" + c1 + ") é mais caro que ("+ c2 + ")");
        } else if (comparaC1_C2 < 0) {
            System.out.println("O livro " + "(" + c1 + ") é mais barato que ("+ c2 + ")");
        }else{
            System.out.println("O livro " + "(" + c1 + ") é igual a ("+ c2 + ")");
        }
        if (comparaC1_C3 > 0) {
            System.out.println("O livro " + "(" + c1 + ") é mais caro que ("+ c3 + ")");
        } else if (comparaC1_C3 < 0) {
            System.out.println("O livro " + "(" + c1 + ") é mais barato que ("+ c3 + ")");
        }else{
            System.out.println("O livro " + "(" + c1 + ") é igual a ("+ c3 +")");
        }
        if (comparaC1_C4 > 0) {
            System.out.println("O livro " + "(" + c1 + ") é mais caro que ("+ c4 + ")");
        }else if (comparaC1_C4 < 0) {
            System.out.println("O livro " + "(" + c1 + ") é mais barato que ("+ c4 + ")");
        }else{
            System.out.println("O livro " + "(" + c1 + ") é igual a ("+ c4 + ")");
        }
    }

}
