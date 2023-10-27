package excecoes;

public class ValorNegativoException extends RuntimeException{
    public ValorNegativoException(){
    }
    public ValorNegativoException(String msg){
        super(msg);
    }
    public ValorNegativoException(String msg, Throwable cause){
        super(msg, cause);
    }
    // public static long fatorial(int n){
    //     if(n<0){
    //         throw new ValorNegativoException();
    //     }
    //     long fat = 1;
    //     for(int i = 1; i <= n; i++){
    //         fat *= i;
    //     }
    //     return fat;
    // }
    // public static int div(int a, int b){
    //     try{
    //         return a/b;
    //     }catch(ArithmeticException ex){
    //         System.out.println("A divisão por zero é indefinida");
    //         return 0;
    //     }
    // }
    // public static void main(String[] args){
        
    //     div(5, 0);
    //     System.out.println(fatorial(-5));
        
    // }
        
    
    
}
