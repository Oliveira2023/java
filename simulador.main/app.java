public class app {

    
    public static void main(String[] args) {
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
