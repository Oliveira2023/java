public class ComparaTo {
    public static void main(String[] args) {
        String nome = "Alice";
        String nome2 = "Orlando";

        int comp = nome.compareTo(nome2);
        if (comp < 0) {
            System.out.println(nome + "," + nome2);
        } else if (comp > 0) {
            System.out.println(nome2 + "," + nome);
        }else{
            System.out.println("Os nomes são iguais");
        }
        
    }
}
