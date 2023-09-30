package simulador.code;

public class CaixaAldeia {
    
    protected int posX;
    protected int posY;
    protected float peso;
    protected final float comprimento;
    protected final float largura;
    protected final float altura;

    public CaixaAldeia(int posX, int posY, float peso, float comprimento, float largura, float altura){
        this.posX = posX;
        this.posY = posY;
        this.peso = peso;
        this.comprimento = comprimento;
        this.largura = largura;
        this.altura = altura;
    }
    public float getPosicaoX(){
        return posX;
    }
    public float getPosicaoY(){
        return posY;
    }
    public float getPeso(){
        return peso;
    }
}
