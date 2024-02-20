/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simulador.code;

/**
 *
 * @author lucia
 */
public class Caixa extends CaixaIdeia {
    public String nomeItem;
    public int qtdItem;
    
    public Caixa(String nomeItem, int qtdItem, int posX,
            int posY, float peso, float comprimento,
            float largura, float altura) {
        super(posX, posY, peso, comprimento, largura, altura);
        this.nomeItem = nomeItem;
        this.qtdItem = qtdItem;
    }
    @Override
    public String toString() {
        return "Caixa{" + "nomeItem= " + nomeItem + ", qtdItem= " + qtdItem + "}";
    }
}