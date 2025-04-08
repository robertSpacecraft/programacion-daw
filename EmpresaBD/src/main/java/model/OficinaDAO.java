package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.stream.Collectors;
import static model.Mejoras.configure;

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

    public static ArrayList<Oficina> getAll() {
        ArrayList<Oficina> allOficinas = getOficina();
        return allOficinas;
    }

    public ArrayList<Oficina> getByCiutat(String ciudad) {

        ArrayList<Oficina> listaOficinasPorCiudad = getOficina().stream()
                .filter(oficina -> oficina.getCiutat().equalsIgnoreCase(ciudad))
                .collect(Collectors.toCollection(ArrayList::new));
        return listaOficinasPorCiudad;

    }

    //Comprueba si la oficina ya existe en la base de datos
    public static boolean comprobarOficina(int numOficina) {
        Connexio connecxio8 = Connexio.getConnexio();
        String sql8 = "SELECT * FROM oficines WHERE oficina = ?";

        try (Connection conn = connecxio8.getDatasource().getConnection(); PreparedStatement ps = configure(conn.prepareStatement(sql8),
                p -> p.setInt(1, numOficina)); ResultSet rs = ps.executeQuery()) {

            return rs.next();

        } catch (SQLException e) {
            System.out.println("No se ha podido consulta la oficina: " + e.getLocalizedMessage());
        }
        return false;
    }

    //Obtiene las oficinas mayores a una superficie mínima
    public static ArrayList<Oficina> oficinasMayoresA(int superficieMinim) {
        ArrayList<Oficina> oficinas12 = new ArrayList<>();
        Connexio connexio12 = Connexio.getConnexio();
        String sql12 = "SELECT * FROM oficines WHERE superficie > ?";

        try (Connection conn = connexio12.getDatasource().getConnection(); PreparedStatement ps = configure(conn.prepareStatement(sql12),
                p -> p.setInt(1, superficieMinim)); ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                int oficina = rs.getInt("oficina");
                String ciutat = rs.getString("ciutat");
                int superficie = rs.getInt("superficie");
                double vendes = rs.getDouble("vendes");

                oficinas12.add(new Oficina(oficina, ciutat, superficie, vendes));
            }
            return oficinas12;

        } catch (SQLException e) {
            System.out.println("No se ha podido acceder a los datos: " + e.getMessage());
            return null;
        }

    }

    //Actualiza la ciudad de una oficina
    public static void actualitzarCiutat(int oficina, String ciudad) {

        if (comprobarOficina(oficina)) {
            Connexio connexio13 = Connexio.getConnexio();
            String sql13 = "UPDATE oficines SET ciutat = ? WHERE oficina = ?";

            try (Connection conn = connexio13.getDatasource().getConnection(); PreparedStatement ps = configure(conn.prepareStatement(sql13),
                    p -> {
                        p.setString(1, ciudad);
                        p.setInt(2, oficina);
                    })) {
                int actualizado = ps.executeUpdate();

                if (actualizado > 0) {
                    System.out.println("La ciudad se ha actualizado correctamente");
                } else {
                    System.out.println("No ha sido posible actualizar la ciudad");
                }
            } catch (SQLException e) {
                System.out.println("No se ha podido ejecutar la petición: " + e.getMessage());
            }
        }
    }

    //Incrementa las ventas de una oficina una cantidad pasada pro parámetro
    public static void incrementarVendes(int oficina, double cantidad) {
        if (comprobarOficina(oficina)) {
            Connexio connexio14 = Connexio.getConnexio();
            String sql14 = "UPDATE oficines SET vendes = vendes + ? WHERE oficina = ?";

            try (Connection conn = connexio14.getDatasource().getConnection(); PreparedStatement ps = configure(conn.prepareStatement(sql14),
                    p -> {
                        p.setDouble(1, cantidad);
                        p.setInt(2, oficina);
                    })) {
                int agregado = ps.executeUpdate();
                if (agregado > 0) {
                    System.out.println("Cantidad añadida correctamente");
                } else {
                    System.out.println("No se ha añadido ninguna cantidad");
                }
            } catch (SQLException e) {
                System.out.println("Error, no se ha podido ejecutar la operación" + e.getMessage());
            }
        }
    }

}
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