package importacao;

import static java.lang.System.out;

import java.util.Random;

import static java.lang.Math.*;
class TesteImportacao {
    public static void main(String[] args) {
        // System.out.println("Hello World!");
        out.println("Hello World!");
        out.println(Math.PI);
        out.println(Math.E);//utilização de forma direta
        out.println(sqrt(25));//pode ser utilizado assim, com importação
        out.println(pow(2, 3));
        out.println(log10(100));

        Random rnd = new Random();
        out.println(rnd.nextDouble());
    }
}