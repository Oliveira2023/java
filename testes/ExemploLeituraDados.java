package testes;

import java.util.Locale;
import java.util.Scanner;   

public class ExemploLeituraDados {
    public static void main(String[] args) {

        Locale.setDefault(new Locale.Builder().setLanguage("en").setRegion("US").build());

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um valor inteiro (int): ");
        int entradaInt = scanner.nextInt();

        System.out.print("Digite um valor real (double): ");
        double entradaDouble = scanner.nextDouble();

        System.out.print("Digite um valor lógico (boolean): ");
        boolean entradaBoolean = scanner.nextBoolean();

        System.out.print("Digite uma string (uma palavra): ");
        String entradaPalavra = scanner.next();
        scanner.nextLine();

        System.out.print("Digite uma string (varias palavras): ");
        String entradaString = scanner.nextLine();

        System.out.println("Saidas dos valores lidos: ");
        System.out.printf("\tO valor inteiro digitado foi: %d%n", entradaInt);
        System.out.printf("\tO valor real digitado foi: %.2f%n", entradaDouble);
        System.out.printf("\tO valor lógico digitado foi: %b%n", entradaBoolean);
        System.out.printf("\tA string digitada foi: %s%n", entradaPalavra);
        System.out.printf("\tA string digitada foi: %s%n", entradaString);

        scanner.close();

    }
}
