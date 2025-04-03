package model;


import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import static model.Mejoras.configure;

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
    
    public static void afegir(Empleat empleado) {
        
        Connexio connexio = Connexio.getConnexio();
        Date fechaHoy = new Date(System.currentTimeMillis());
        String sql5 = "INSERT INTO empleats (numemp, nom, edat, oficina, ocupacio, contracte) VALUES(?, ?, ?, ?, ?, ?)";
        
        try (Connection conn = connexio.getDatasource().getConnection(); PreparedStatement ps = configure(conn.prepareStatement(sql5),
                p -> {
                    p.setInt(1, empleado.getNumEmpleado());
                    p.setString(2, empleado.getNombre());
                    p.setInt(3, empleado.getEdad());
                    p.setInt(4, empleado.getOficina());
                    p.setString(5, empleado.getProfesion());
                    p.setDate(6, fechaHoy);

                })) {
            int insertado = ps.executeUpdate();
            if (insertado > 0) {
                System.out.println("Empleado insertado correctamente");
            }
        } catch (SQLException e) {
            System.out.println("Error al insertar el empleado: " + e.getMessage());
        }

    }
    
}
/*

*/