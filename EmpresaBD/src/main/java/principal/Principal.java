package principal;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Consumer;
import model.Connexio;
import model.Empleat;
import model.EmpleatDAO;
import static model.EmpleatDAO.comprobarEmpleado;
import model.Oficina;
import model.OficinaDAO;
import static model.OficinaDAO.comprobarOficina;
import oracle.jdbc.driver.utils.ThrowingConsumer;

public class Principal {

    public static void main(String[] args) {
        try {
            Scanner teclat = new Scanner(System.in);
            Connexio connexio = Connexio.getConnexio();

            // 1 - RESOLT
            String sql = "SELECT * FROM Empleats";
            PreparedStatement prepared = connexio.getPrepared(sql);
            ResultSet rs = prepared.executeQuery();
            while (rs.next()) {
                int numeroEmpleat = rs.getInt("numemp");
                String nom = rs.getString("nom");
                int edat = rs.getInt("edat");
                int oficina = rs.getInt("oficina");
                String ocupacio = rs.getString("ocupacio");
                LocalDate contracte = rs.getDate("contracte").toLocalDate();
                    if (rs.wasNull()){
                        //No incluyo numeroEmpleat porque asumo que sería Primary key
                        nom = "SIN NOMBRE";
                        ocupacio = "Sin OCUPACIO";
                    }
                System.out.println(numeroEmpleat + " - " + nom + " - " + edat + " - " + oficina + " - " + ocupacio + " - " + contracte);

            }

            //2 - Implementa classes i mètodes que calguen.
            
            OficinaDAO oficinaDAO = new OficinaDAO();
            for (Oficina oficina : OficinaDAO.getAll()){
            System.out.println(oficina);
            }

            //3 - Implementa classes i mètodes que calguen.
            System.out.println(oficinaDAO.getByCiutat("alacant"));

            //4            
            System.out.print("Introdueix edat mínima: ");
            int minima = teclat.nextInt();
            teclat.nextLine();
            System.out.print("Introdueix edat màxima: ");
            int maxima = teclat.nextInt();
            teclat.nextLine();
            
            ArrayList<Empleat> empleadosEdades = new ArrayList<>();
            
            Connexio conexion4 = Connexio.getConnexio();

            String sql4 = "SELECT * FROM empleats WHERE edat BETWEEN ? AND ?";

            try (Connection conn = conexion4.getDatasource().getConnection(); PreparedStatement ps = conn.prepareStatement(sql4)) {
                ps.setInt(1, minima);
                ps.setInt(2, maxima);

                try (ResultSet rs4 = ps.executeQuery()) {
                    System.out.println("Los empleados con edades comprendidas entre " +
                            minima + " y " + maxima + " son: ");
                    while (rs4.next()) {
                        String nombre = rs4.getString("nom");
                        int edad = rs4.getInt("edat");
                        
                        empleadosEdades.add(new Empleat(nombre, edad));                      
                    }
                    if (!empleadosEdades.isEmpty()){
                    empleadosEdades.forEach(empleado -> System.out.println("Nombre: " + empleado.getNombre() +
                            "\nEdad: " + empleado.getEdad()));
                    } else {
                        System.out.println("Ningún empleado entre esas edades");
                    }
                }
            } catch(SQLException e){
                System.out.println("No se han podido obtener los datos: " + e.getMessage());
            }

            //5
            System.out.print("Introdueix codi empleat: ");
            int numeroEmpleat = teclat.nextInt();
            teclat.nextLine();
            //Compruebo si el empleado ya existe en la BD
             if (comprobarEmpleado(numeroEmpleat)){
            System.out.println("El empleado ya está en la BD");
            return;
            }
            System.out.print("Introdueix nom: ");
            String nom = teclat.nextLine();
            System.out.print("Introdueix edat: ");
            int edat = teclat.nextInt();
            teclat.nextLine();
            System.out.print("Introdueix codi oficina: ");
            int oficina = teclat.nextInt();
            teclat.nextLine();
            System.out.print("Introdueix ocupació: ");
            String ocupacio = teclat.nextLine();
            // Este código se pasa a EmpleatDAO.
            
            Date contractacio = new Date(System.currentTimeMillis());
            //6-7-8 Implementa classes i mètodes que calguen.
            Empleat empleatAInserir = new Empleat(numeroEmpleat, nom, edat, oficina, ocupacio, contractacio);
            new EmpleatDAO().afegir(empleatAInserir);

            // 9 Implementa classes i mètodes que calguen.
            //NOTA: esto moverá a Joan Molla de la 2 -> 3
            new EmpleatDAO().moure(2, 3);
            
            //10 Implementa classes i mètodes que calguen.
            new EmpleatDAO().eliminar(104);
            
            //11 
            OficinaDAO oficinaDAO11 = new OficinaDAO();
            for (Oficina oficina11 : OficinaDAO.getAll()){
                System.out.println(oficina11);
            }
            
            //12
            System.out.print("Introdueix una superficie mínima: ");
            int superficie = teclat.nextInt();
            teclat.nextLine();
            ArrayList<Oficina> oficinasBD = OficinaDAO.oficinasMayoresA(superficie);

            if (oficinasBD != null && !oficinasBD.isEmpty()) {
                System.out.println("Oficinas con una superficie supererior a " + superficie + ":");
                oficinasBD.forEach(System.out::println);
            } else {
                System.out.println("No se han encontrados oficinas superiores a: " + superficie);
            }
            // Implementa ací el codi que falta.
            
            //13
            oficinaDAO.actualitzarCiutat(9, "Sax");
            
            //14
            oficinaDAO.incrementarVendes(9, 100.5);

            connexio.getDatasource().close();

        } catch (SQLException ex) {
            System.out.println("Error SQL: " + ex);
        }

    }
    
}
