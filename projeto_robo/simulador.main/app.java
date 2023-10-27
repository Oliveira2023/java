public class app {

    
    public static void main(String[] args) {
        if (args.length != 0){
            args[0] = args[0].toLowerCase();
            if (args[0].equals("--author")){
                System.out.println("Author: Jesimar s. Aranes");
            }else if(args[0].equals("--version")){
                System.out.println("Version: 1.0");
            }else if(args[0].equals("--help")){
                System.out.println("Exec. Movimentos Agendados: ");
                System.out.println("\t--move w/s/a/d");
            }else if(args[0].equals("commands")){
                System.out.println("Commandos Suportados: ");
                System.out.println("\tw: move para cima");
                System.out.println("\ta: move para esquerda");
                System.out.println("\ts: move para baixo");
                System.out.println("\td: move para direita");
                System.out.println("\t0: sair");
            }else if(args[0].equals("--move")){
                Robo robo = new Robo();
                System.out.println("Movimentos Agendados: ");
                robo.movimentosAgendados(args);
            }else{
                System.out.println("Comando inválido");
            };
            System.exit(0);
        }
        Robo objRobo = new Robo();
        objRobo.printStatus();
        objRobo.move(60, 50);
        objRobo.printStatus();
        objRobo.move(65, 55);
        objRobo.printStatus();

        for(int i = 0; i < 10; i++){
            System.out.println(i);
            for(int j = 0; j < 10; j++){
                System.out.println(j);
            }
        }

        // switch()
    }
}
