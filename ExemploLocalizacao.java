import java.util.Locale;

public class ExemploLocalizacao {
    public static void main(String[] args) {
        // altere a execução com essas duas linhas
        // Locale.setDefault(new Locale.Builder().setLanguage("pt").setRegion("BR").build());
        Locale.setDefault(new Locale.Builder().setLanguage("en").setRegion("US").build());
        double pi = 3.14159;
        System.out.printf("Valor pi: %.2f%n", pi);
    }
}
