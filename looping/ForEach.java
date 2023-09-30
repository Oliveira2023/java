package looping;

public class ForEach {

    static String livro = "Linguagem Orientada a Objetos";
    public static void forEachChar() {
        for (char letra : livro.toCharArray()) {
        System.out.println("caracter: " + letra);
        }
    }
    public static void forEachString() {
        String livro[] = {"Linguagem", "Orientada", "a", "Objetos"};
        for (String palavra : livro) {
        System.out.println("palavra: " + palavra);
        }
    }
    public static void main(String[] args) {
    forEachString();
    }
}
