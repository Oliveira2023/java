public class Robo {
    
    private final String  nome = "R-ATM";
    private final float peso = 70;
    private final float velociadeMax = 5;
    private final float pesoCargaMax = 20;
    private final String tipoTracao = "esteira";
    private float posicaoX = 50;
    private float posicaoY = 50;
    private int orientacao;//0 = frente, 1 = atras, 2 = esquerda, 3 = direita

    public getPosicaoX(){
        return posicaoX;
    }
    public getPosicaoY(){
        return posicaoY;
    }
    public void setPosicaoX(float x){
        posicaoX = x;
    }
    public void setPosicaoY(float y){
        posicaoY = y;
    }
    public int getOrientacao(){
        return orientacao;
    }
    public void move(float x, float y){
        posicaoX = x;
        posicaoY = y;       
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
    @Override
    public String toString(){
        return "Robo{" + "posiçãoX=" + posicaoX + ", posiçãoY=" + posicaoY + ", orientacao=" + orientacao + '}';
    }

    @Override
    public boolean equals(Object obj){
        if (obj instanceof Robo){
            Robo robo = (Robo) obj;
            return this.nome.equals(Robo.nome);
        }else{
            return false;
        }
    }
}
