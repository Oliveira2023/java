package interfaces;

public class Main {

    // public Main(String nome, double custo){
    //     super(nome, custo);
    // }

    public static void main(String[] args) {
        
        Livro l1 = new Livro("blice no País das Maravilhas", 38.0);
        Livro l2 = new Livro("a Senhor dos Anéis", 44.0);
        Livro l3 = new Livro("Harry Potter e a Pedra Filosofal", 38.0);

        int compL1L2 = l1.compareTo(l2);
        int compL1L3 = l1.compareTo(l3);
        int compL2L3 = l2.compareTo(l3);

        System.out.println(compL2L3);
        System.out.println(compL1L2);
        System.out.println(compL1L3);

        // System.out.println("Comparação L1 e L2: " + compL1L2);
        // System.out.println("Comparação L1 e L3: " + compL1L3);
        // System.out.println("Comparação L2 e L3: " + compL2L3);
    }
}