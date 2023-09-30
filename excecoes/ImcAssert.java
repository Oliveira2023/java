package excecoes;

public class ImcAssert {
    public float calcularImc(float peso, float altura){
        assert peso > 0 && altura > 0 : "Peso e altura devem ser positivos";
        assert peso < 1000 : "Peso deve ser menor que 1000";
        assert peso != 0 : "Peso deve ser diferente de 0";
        float imcorp = peso / (altura * altura);
        return imcorp;
    }
    public static void main(String[] args){
        ImcAssert imc = new ImcAssert();
        float indice = imc.calcularImc(0, 1.80f);
        System.out.println(indice);
    }
}
