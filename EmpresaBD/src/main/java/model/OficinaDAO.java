package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class OficinaDAO {

    public static ArrayList<Oficina> getOficina() {

        ArrayList<Oficina> listaOficinas = new ArrayList<>();
        Connexio conectarBD = Connexio.getConnexio();

        String sentenciaSql = "SELECT * FROM oficines";

        try (Connection conn = conectarBD.getDatasource().getConnection(); PreparedStatement ps = conn.prepareStatement(sentenciaSql); ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                int oficina = rs.getInt("oficina");
                String nombreCiudad = rs.getString("ciutat");
                int superficie = rs.getInt("superficie");
                double ventas = rs.getDouble("vendes");

                listaOficinas.add(new Oficina(oficina, nombreCiudad, superficie, ventas));
            }

        } catch (SQLException e) {
            System.out.println("No se han podido obtener las oficinas: " + e.getMessage());
        }

        return listaOficinas;

    }
    
    public static ArrayList<Oficina> getAll(){
        ArrayList<Oficina> allOficinas = getOficina();
        return allOficinas;
    }

    public ArrayList<Oficina> getByCiutat(String ciudad) {
            
        ArrayList<Oficina> listaOficinasPorCiudad = getOficina().stream()
                .filter(oficina -> oficina.getCiutat().equalsIgnoreCase(ciudad))
                .collect(Collectors.toCollection(ArrayList::new));
        return listaOficinasPorCiudad;
        
        /*
            Connexio conexion = Connexio.getConnexio();
            String consultaPorCiudad = "SELECT * FROM oficines WHERE ciutat = ?";

            try (Connection conn = conexion.getDatasource().getConnection();
                    PreparedStatement ps = conn.prepareStatement(consultaPorCiudad)) {
                {

                    ps.setString(1, ciudad);
                }
                try (ResultSet rs = ps.executeQuery()) {
                    while (rs.next()) {
                        int codOficina = rs.getInt("oficina");
                        int superficie = rs.getInt("superficie");
                        double ventas = rs.getDouble("vendes");
                        listaOficinasPorCiudad.add(new Oficina(codOficina, superficie, ventas));
                    }
                }
            } catch (SQLException e) {
                System.out.println("No se han podido obtener los datos de la consulta" + e.getMessage());
            }
             return listaOficinasPorCiudad
            }
        */
    }
    
}
