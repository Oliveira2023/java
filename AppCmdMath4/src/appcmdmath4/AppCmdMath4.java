package appcmdmath4;

/**
 *
 * @author Luciano
 */

public class AppCmdMath4 {
    
    /**
     * @param a
     * @param args the command line arguments
     * @return 
     */
    
    
    
    
        
    public static void main(String[] args) {
       //Factorial 
        /*Scanner sc = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int numero = sc.nextInt();
        try{
        long fat = Fatorial.fatorial(numero);
        System.out.printf("fatorial de %d = %d :", numero, fat);
        }catch (ValorNegativoException e) {
            System.out.println(e);
        }*/
        
        //Assercao
        int idade = -20;
        assert (idade >=0) : "Aviso: não existe idade menor que Zero";
        System.out.printf("Idade: %d%n", idade);
        
        
    }
    
}
