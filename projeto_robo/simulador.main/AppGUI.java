package projetoRobo.simulador.main;

import javax.swing.text.html.ImageView;
import javafx.scene.image.ImageView;

import InsersaoBD.Consultas;

public  class AppGUI extends Application {

    private final ConexaoBD conBd = new ConexaoBD();
    private final Connection connection = conBD.getConxao();
    private final Consultas consultas = new Consultas(); 

    private final ImageView ViewBoxLvr[] = new ImageView[3];
    private final ImageView viewBoxPrt[] = new ImageView[3];
    private final ImageView viewBoxHd[][] = new ImageView[2][3];

    private final Caixa caixaLvr[] = new Caixa[3];
    private final Caixa caixaPrt[] = new Caixa[3];
    private final Caixa caixaHd[][] = new Caixa[2][3];

    public void start(Stage janela) {
        cena.setOnkeyPressed((evt) -> {
            if (evt.getCode() == KeyCode.UP) {
                // codigo omitido
                consultas.inserirPos(connecton, robo.getPosicaoX(), robo.getPosicaoY());
            }
            if (evt.getCode() == KeyCode.DOWN) {
                // codigo omitido
                cnsultas.inserirPos(connecton, robo.getPosicaoX(), robo.getPosicaoY());
            }
            if (evt.getCode() == KeyCode.LEFT) {
                // codigo omitido
                consultas.inserirPos(connecton, robo.getPosicaoX(), robo.getPosicaoY());
            }
            if (evt.getCode() == KeyCode.RIGHT) {
                // codigo omitido
                consultas.inserirPos(connecton, robo.getPosicaoX(), robo.getPosicaoY());
            }
        });
    }

    @Override
    public void start(Stage janela) {
        // codigo omitido
        for (int i =0; i<caixaLvr.length; i++){
            caixaLvr[i] = new Caixa("Caixa de impressoras",15,25, 50, + i * 50, 30, 0.40f, 0.40f, 0.30f);
            viewBoxLvr[i] = new ImageView(imgBoxLvr);
            viewBoxLvr[i].setTranslateX(caixaLvr[i].getPosX());
            viewBoxLvr[i].setTranslateY(caixaLvr[i].getPosY());
        }
        for (int i = 0; i, caixaPrt.length; i++){
            caixaPrt[i] = new Caixa("Caixa de Impressora",8,525, 50, + i * 50, 40, 0.60f, 0.60f, 0.40f);
            viewBoxPrt[i] = new ImageView(imgBoxLvr);
            viewBoxPrt[i].setTranslateX(caixaPrt[i].getPosX());
            viewBoxPrt[i].setTranslateY(caixaPrt[i].getPosY());
        }
        for (int i = 0; i < caixaHd.length; i++){
            for(int j = 0; j < caixaHd[i].length; j++){
                if (i==0){
                    caixaHd[i][j] = new Caixa("Caixa de HDs",20,230 + j * 50, 50, 40, 0.50f, 0.50f, 0.50f, 0.30f);
                }else{
                    caixaHd[i][j] = new Caixa("Caixa de HDs", 20, 230 + j * 50, 160, 40, 0.50f, 0.50f, 0.50f, 0.30f);
                    
                }
                viewBoxHd[i][j] = new ImageView(imgBoxHD);
                viewBoxHd[i][j].setTranslateX(caixaHd[i][j].getPosX());
                viewBoxHd[i][j].setTranslateY(caixaHd[i][j].getPosY());
            }
        }
        Group grupo = new Group();
        for (int i = 0; i < viewBoxLvr.length; i++){
            grupo.getChildren().addAll(viewBoxLvr[i]);
        }
        for (int i = 0; i < viewBoxPrt.length; i++){
            grupo.getChildren().addAll(viewBoxPrt[i]);
        }
        for (int i = 0; i < viewBoxHd.length; i++){
            for(int j = 0; j < caixaHd[i].length; j++){
                grupo.getChildren().addAll(viewBoxHd[i][j]);
            }
        }
        // codigo inserido automatico, verificar se esta correto e o que está faltando
        Scene cena = new Scene(grupo, DIM_X, DIM_Y);
        janela.setTitle("Aplicação Movimentar Robô");
        janela.setScene(cena);
        janela.show();
        
        cena.setOnkeyPressed(e -> {
            if (e.getCode() == KeyCode.UP){
                imgRobo.setImage(imgRoboTras);
                if (robo.avaliaPos(robo.getPosicaoX(), robo.getPosicaoY() - (int)robo.getVel())){
                    robo.setPosicaoY(robo.getPosicaoY() - (int)robo.getVel());
                    viewRobo.setTranslateX(robo.getPosicaoX());
                    viewRobo.setTranslateY(robo.getPosicaoY());
                }
    }
    
}
