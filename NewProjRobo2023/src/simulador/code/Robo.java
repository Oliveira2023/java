package simulador.code;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lucia
 */
public class Robo {
    private float posicaoX;
    private float posicaoY;
    private int orientacao;
    private final String nome;
    private final float peso;
    private final float velocidadeMax = 5;
    private final float pesoCargaMax = 20;
    private final String tipoTracao = "esteira";
    public static final int FRENTE = 0;
    public static final int ATRAS = 1;
    public static final int ESQUERDA = 2;
    public static final int DIREITA = 3;
    
    public Robo(String nome, float peso){
        this.nome = nome;
        this.peso = peso;
    }
    
    public float getPosicaoX() {
        return posicaoX;
    }
    public float getPosicaoY() {
        return posicaoY;
    }
    public int getOrientacao() {
        return orientacao;
    }
    @Override
    public String toString() {
        return "Robo{" + "posicaoX = " + posicaoX + ", posicaoY = " +
                posicaoY + ", orientacao = " + orientacao + "}";
    }
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Robo) {
            Robo robo = (Robo)obj;
            return this.nome.equals(robo.nome);
        }else {
            return false;
        }
    }
}
