package InsersaoBD;

import java.sql.Connection;

public class App {
    public static void main(String[] args) {
        ConexaoBD conBD = new ConexaoBD();
        Connection connection = conBD.getConexao();
        Consultas consultas = new Consultas();
        consultas.listarClientes(connection);
        conBD.fecharConexao();
    }
}
