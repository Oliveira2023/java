/**
 * Função para exibir na linha de comando a quantidade de argumentos passados.
 * execução do programa: java ArgsLinhaDeComandoBasico arg1 arg2
 * Será exibido: quantidade de parametros passado e o valor de cada parametro
 }
 */
public class ArgsLinhaDeComandoBasico {
    public static void main(String[] args) {
        System.out.printf("qtd de argumentos = %d%n", args.length);
        for (int i = 0; i < args.length; i++) {
            System.out.printf("\targs[%d] = %s%n", i, args[i]);
        }
    }
}
