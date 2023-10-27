package projetoRobo.simulador.main;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Consultas {
    
    public void inserirPos (Connection conn, float x, float y){
        try {
            Statement st = conn.createStatement();
            String sql = "INSERT INTO `rota` (posx, posy) VALUES ('" + posx + "', '" + posy + "')";
            st.executeUpdate(sql);
            st.close();
        }catch(SQLException ex){
            System.out.println(ex);
        }
    }
}
