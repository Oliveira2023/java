package projetoRobo.simulador.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class ConexaoBD {
    private Connection con = null;
    private final String jdbcDriver = "com.mysql.jdbc.Driver";
    private final String prefixoBD = "jdbc:mysql://";
    private final String nomeHost = "127.0.0.1";
    private final String portaBD = "3306";
    private final String nomeBanco = "rota";
    private final String usuario = "root@localhost";
    private final String senha = "";
    private String url = null;

    public ConexaoBD() {
        url = prefixoBD + nomeHost  + ":" + portaBD + "/" + nomeBanco;
    }
    public Connection getConexao(){
        try{
            if (con == null){
                Class.forName(jdbcDriver);
                con = DriverManager.getConnection(url, usuario, senha);
            }else if (con.isClosed()){
                con = null;
                return getConexao();
            }
        } catch (ClassNotFoundException ex){
            System.out.println(ex);
        } catch (SQLException ex){
            System.out.println(ex);
        }
        return con;
    }
    public void fecharConexao(){
        if (con!=null){
            try {
                con.close();
            }catch (SQLException ex){
                System.out.println(ex);
            }
        }
    }
}
