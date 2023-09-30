package simulador.code;

public class Robo extends RoboIdeia{

    private float posicaoX;
    private float posicaoY;
    private String orientacao;//0 = frente, 1 = atras, 2 = esquerda, 3 = direita
    private final String  nome = "R-ATM";
    private final float peso = 10;
    private final float velociadeMax = 5;
    private final float pesoCargaMax = 20;
    private final String tipoTracao = "esteira";
    
    

    public float getPosicaoX(){
        return posicaoX;
    }
    public float getPosicaoY(){
        return posicaoY;
    }
    public String getOrientacao(){
        return orientacao;
    }
    public void setPosicaoX(float x){
        posicaoX = x;
    }
    public void setPosicaoY(float y){
        posicaoY = y;
    }
    @Override
    public void moveX(float posX, float posY){
        if (Float.isNaN(posX || Float.isNaN(posY) || Float.isInfinite(posX) || Float.isInfinite(posY))){
            thown new IllegalArgumentException("Ars não válidos");
        }
        super.posicaoX = posX;
        super.posicaoY = posY;
    }

    @Override
    public void moveY(float dist){
        if (Float.isNaN(dist || Float.isInfinite(dist))){
            thown new IllegalArgumentException("Ars não válidos");
        }
        
        super.posicaoY += dist;
    }

    public void setOrientacao(char tecla){
        if (tecla == 'w'){
            super.orientacao = Orientacao.FRENTE;
            moveY(5);
        }else if (tecla == 's'){
            super.orientacao = Orientacao.ATRAS;
            moveY(-5);
        }else if (tecla == 'a'){
            super.orientacao = Orienteacao.ESQUERDA;
            moveX(-5);
        }else if (tecla == 'd'){
            super.orientacao = Orientacao.DIREITA;
            moveX(5);
        }else{
            throw new IllegalArgumentException("Arg inválido");
        }
    }
    public void movimentosAgendados (String... moves){
        for (String tecla: moves){
            if (!tecla.equals("--move")){
                setOrientacao(tecla.charAt(0));
            }
        }
    }
    public void move(float posX, float posY){
        setPosicaoX(posX);
        setPosicaoY(posY);
    }

    public void printStatus(){
        System.out.println("--------info R=ATM----------");
        System.out.println("Nome: " + nome);
        System.out.println("Peso: " + peso);
        System.out.println("Velocidade máxima: " + velociadeMax);
        System.out.println("Peso máximo: " + pesoCargaMax);
        System.out.println("Tipo de tração: " + tipoTracao);
        System.out.println("Posição X: " + posicaoX);
        System.out.println("Posição Y: " + posicaoY);
    }
    public boolean avaliaPos(int posX, int posY){
        posX = posX + largura/2;
        posY = posY + altura/2;
        if (posX <40 || posX > 560 || posY <30 || posY > 360){
            return false;//delimitação da fronteira da sala
        }
        if ((posX > 170 && posX < 430) && (posY > 240 && posY < 400)){
            return false;//delimitação região operação máquinas
        }
        if ((posX >= 0 && posX <= 100) && (posY >= 0 && posY <= 200)){
            return false; // delimitação região caixas livros
        }
        if ((posX >= 500 && posX <= 600) && (posY >= 0 && posY <= 200)){
            return false; // delimitação região caixas impressoras
        }
        if ((posX >= 170 && posX <= 430) && (posY >= 0 && posY <= 90)){
            return false; // delimitação região caixas hds
        }
        if (((posX >= 170 && posX <= 430) && (posY >= 120 && posY <= 200))){
            return false; // delimitação região caixas com hds?? tem 2 mesmo?
        }
        return true;

    }
    @Override
    public String toString(){
        return "Robo{" + "posiçãoX=" + posicaoX + ", posiçãoY=" + posicaoY + ", orientacao=" + orientacao + '}';
    }

    @Override
    public boolean equals(Object obj){
        if (obj instanceof Robo){
            Robo robo = (Robo) obj;
            return this.nome.equals(robo.nome);
        }else{
            return false;
        }
    }
}
