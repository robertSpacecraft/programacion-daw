package principal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.Scanner;
import model.Connexio;

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
                System.out.println(numeroEmpleat + " - " + nom + " - " + edat + " - " + oficina + " - " + ocupacio + " - " + contracte);

            }

            //2 - Implementa classes i mètodes que calguen.
            
            //OficinaDAO oficinaDAO = new OficinaDAO();
            //System.out.println(oficinaDAO.getAll());

            //3 - Implementa classes i mètodes que calguen.
            //System.out.println(oficinaDAO.getByCiutat("Petrer"));

            //4
            System.out.print("Introdueix edat mínima: ");
            int minima = teclat.nextInt();
            teclat.nextLine();
            System.out.print("Introdueix edat màxima: ");
            int maxima = teclat.nextInt();
            teclat.nextLine();
            // Implementa ací el codi que falta, similar a l'exercici 1

            //5
            System.out.print("Introdueix codi empleat: ");
            int numeroEmpleat = teclat.nextInt();
            teclat.nextLine();
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
            // Implementa ací el codi que falta.

            //6-7-8 Implementa classes i mètodes que calguen.
            //Empleat empleatAInserir = new Empleat(numeroEmpleat, nom, edat, oficina, ocupacio, contractacio);
            //new EmpleatDAO().afegir(empleatAInserir);

            // 9 Implementa classes i mètodes que calguen.
            //new EmpleatDAO().moure(2, 3);
            
            //10 Implementa classes i mètodes que calguen.
            //new EmpleatDAO().eliminar(4);
            
            //11 
            
            //12
            System.out.print("Introdueix una superficie mínima: ");
            int superficie = teclat.nextInt();
            teclat.nextLine();
            // Implementa ací el codi que falta.
            
            //13
            //oficinaDAO.actualitzarCiutat(9, "Sax");
            
            //14
            //oficinaDAO.incrementarVendes(9, 100.5);

            connexio.getDatasource().close();

        } catch (SQLException ex) {
            System.out.println("Error SQL: " + ex);
        }

    }
}
