package model;


import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class EmpleatDAO {
    
    public static ArrayList<Empleat> getEmpleats(){
        ArrayList<Empleat> listaEmpleados = new ArrayList<>();
        
        Connexio conectarBD = Connexio.getConnexio();
        
        String sql = "SELECT * FROM empleats";
        
        try (Connection conn = conectarBD.getDatasource().getConnection();
                PreparedStatement ps = conn.prepareStatement(sql);
                ResultSet rs = ps.executeQuery()){
            
            while(rs.next()){
                int numEmpleado = rs.getInt("numemp");
                String nombre = rs.getString("nom");
                int edad = rs.getInt("edat");
                int oficina = rs.getInt("oficina");
                String profesion = rs.getString("ocupacio");
                Date fechaContrato = rs.getDate("contracte");
                
                listaEmpleados.add(new Empleat(numEmpleado, nombre, edad, oficina, profesion, fechaContrato));
            }
            
        } catch (SQLException e){
            System.out.println("No se han podido obtener los datos: " + e.getMessage());
            
        }
        
        return listaEmpleados;
    }
    
}
