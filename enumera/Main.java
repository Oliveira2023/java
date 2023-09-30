package enumera;

public class Main {

    public static void main(String[] args) {
        DiadaSemana dia = DiadaSemana.QUA;

        switch (dia){
            case DOM:
                System.out.println("Domingo");
                break;
            case SEG:
                System.out.println("Segunda");
                break;
            case TER:
                System.out.println("Terça");
                break;
            case QUA:
                System.out.println("Quarta");
                break;
            case QUI:
                System.out.println("Quinta");
                break;
            case SEX:
                System.out.println("Sexta");
                break;
            case SAB:
                System.out.println("Sabado");
                break;
        }
        
    }
}