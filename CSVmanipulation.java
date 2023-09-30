import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class CSVmanipulation {
    public final String SEPARATOR_PONTO_VIRGULA = ";";
    public final String SEPARATOR_VIRGULA = ",";
    public static void main(String[] args) {
        CSVmanipulation csv = new CSVmanipulation();
        List<List<String>> registroDados = csv.leitura();
        csv.imprimeDados(registroDados);
    }
    public List<List<String>> leitura() {
        List<List<String>> registroDados = new ArrayList<>();
        File arquivo = new File("Leads_04-09-2023_1547.csv");
        try {
            try (Scanner sc = new Scanner(arquivo)) {
                while (sc.hasNextLine()){
                    String linha = sc.nextLine();
                    registroDados.add(GetRegistroDaLinha(linha));
                }
            }
        }
        catch (FileNotFoundException ex) {
            System.out.printf("Erro abertura do arquivo: %s.%n", ex.getMessage());
            System.exit(0);
        }
        return registroDados;
    }
    private List<String> GetRegistroDaLinha(String linha) {
        List<String> listaValores = new ArrayList<String>();
        try (Scanner linhaScanner = new Scanner(linha)) {
            linhaScanner.useDelimiter(SEPARATOR_VIRGULA);
            while (linhaScanner.hasNext()){
                    listaValores.add(linhaScanner.next());
            }
        }
        return listaValores;
    }
    private void imprimeDados(List<List<String>> registroDados) {
        for (List<String> lista : registroDados) {
            for (String elemento : lista) {
                System.out.printf("|%15s", elemento);
            }
            System.out.println("|");
        }
    }
    
}
