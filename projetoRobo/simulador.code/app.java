import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        Robo robo = new Robo();
        string tecla = "";
        
        Scanner scan = new Scanner(System.in);
        bollean ok = false;
        do{
            try{
                tecla = scan.next();
                robo.setOrientacao(tecla.charAt(0));
                robo.printPos();
            }catch (IllegalArgumentException ex){
                if (tecla.chartAt(0) == '0'){
                    ok = true;
                }else{
                    System.out.println("Opção inválida");
                    scan.nextLine();
                    ok = false;
                }
            }
        }while(!ok);
        robo.printPos();
    }
}
