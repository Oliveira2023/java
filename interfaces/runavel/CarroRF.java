package runavel;

import java.util.Arrays;

public class CarroRF implements Runnable {
    private int nivelBateria;
    private int numMovimentos;

    public CarroRF() {
        this.nivelBateria = 100;
        this.numMovimentos = 0;
    }

    public void agendarMovimentos (Direcao... direcoes) {
        String msg = String.format("Lista de lmovimentos agendados: %s", Arrays.toString(direcoes));
        System.out.println(msg);
        numMovimentos += direcoes.length;
    }
    @Override
    public void run() {
        System.out.println("Executando movimentos ...");
        //execução da movimentação do carro (abstrair a logica)
        nivelBateria -= numMovimentos;
        numMovimentos = 0;
    }
    @Override
    public String toString() {
        return String.format("Nivel da bateria: %d%n" + "Movimentos a executar: %d", nivelBateria, numMovimentos);
    }

}
