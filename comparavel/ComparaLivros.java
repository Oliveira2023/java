package comparavel;

public class ComparaLivros implements Comparable<ComparaLivros> {
    private String nome;
    private int valor;

    public ComparaLivros(String nome, int preco) {
        this.nome = nome;
        this.valor = preco;
    }
    public int getValor() {
        return valor;
    }
    public String getNome() {
        return nome;
    }

    @Override
    public int compareTo(ComparaLivros livro) {
        if (this.valor > livro.getValor()) {
            return 1;
        } else if (this.getValor() < livro.getValor()) {
            return -1;
        } else {
            return 0;
        }
    }
    public static void main(String[] args) {
        ComparaLivros c1 = new ComparaLivros("O Senhor dos Aneis", 35);
        ComparaLivros c2 = new ComparaLivros("Alice no pais", 23);
        ComparaLivros c3 = new ComparaLivros("Matrix", 28);
        ComparaLivros c4 = new ComparaLivros("Rei dos Monstros", 41);

        int comparaC1_C2 = c1.compareTo(c2);
        int comparaC1_C3 = c1.compareTo(c3);
        int comparaC1_C4 = c1.compareTo(c4);

        if (comparaC1_C2 > 0) {
            System.out.println("O licro" + "(" + c1.getNome() + ") é mais caro que ("+ c2.getNome() + ")");
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
