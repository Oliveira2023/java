public class AppMovRobo extends Application {

    private final int DIM_X = 300;
    private final int DIM_Y = 220;
    private final int altura = 60;
    private final int largura = 64;
    private int posX = DIM_X/2 - largura/2;
    private int posY = DIM_Y/2 - altura/2;
    private int velocidade = 1;

    private final Image imgRoboFrente = new Image(getClass().getResourceAsStream("recursos/roboFrente.png"));
    private final Image imgRoboTras = new Image(getClass().getResourceAsStream("recursos/roboTras.png"));
    private final Image imgRoboEsquerda = new Image(getClass().getResourceAsStream("recursos/roboEsquerda.png"));
    private final Image imgRoboDireita = new Image(getClass().getResourceAsStream("recursos/roboDireita.png"));

    private final ImageView imgRobo = new ImageView(imgRoboFrente);

    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage janela) {
        imgRobo.setTranslateX(posX);
        imgRobo.setTranslateY(posY);
        Group grupo = new Group();
        grupo.getChildren().addAll(imgRobo);
        Scene cena = new Scene(grupo, DIM_X, DIM_Y);
        janela.setTitle("Aplicação Movimentar Robô");
        janela.setScene(cena);
        janela.show();

        cena.setOnkeyPressed(e -> {
            if (e.getCode() == KeyCode.UP){
                imgRobo.setImage(imgRoboTras);
                posY = posY - velocidade;
                if(posY < 0){
                    posY = 0;
                }
                imgRobo.setTranslateX(posX);
                imgRobo.setTranslateY(posY);
            }
            if (e.getCode() == KeyCode.DOWN){
                imgRobo.setImage(imgRoboFrente);
                posY = posY + velocidade;
                if(posY + altura > DIM_Y){
                    posY = DIM_Y - altura;
                }
                imgRobo.setTranslateX(posX);
                imgRobo.setTranslateY(posY);
            }
            if (e.getCode() == KeyCode.LEFT){
                imgRobo.setImage(imgRoboEsquerda);
                posX = posX - velocidade;
                if(posX < 0){
                    posX = 0;
                }
                imgRobo.setTranslateX(posX);
                imgRobo.setTranslateY(posY);
            }
            if (e.getCode() == KeyCode.RIGHT){
                imgRobo.setImage(imgRoboDireita);
                posX = posX + velocidade;
                if(posX + largura > DIM_X){
                    posX = DIM_X - largura;
                }
                imgRobo.setTranslateX(posX);
                imgRobo.setTranslateY(posY);
            }
            if (e.getCode() == KeyCode.SPACE){
                if (velocidade == 1){
                    velocidade = 4;
                }else{
                    velocidade = 1;
                }
            }
        })
    }
}
