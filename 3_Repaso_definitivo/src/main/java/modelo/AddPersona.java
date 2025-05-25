/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package modelo;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Robert
 */
public class AddPersona extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        PersonaDAO personaDao = (PersonaDAO) getServletContext().getAttribute("personaDao");

        List<Persona> listaPersonas = personaDao.getAll();

        String mensajeError = null;

        Persona persona = null;
        String idStr = request.getParameter("id");
        String nombre = request.getParameter("nombre");
        String apellido = request.getParameter("apellido");
        String edadStr = request.getParameter("edad");
        String notas = request.getParameter("notas");

        try {
            int id = Integer.parseInt(idStr);
            int edad = Integer.parseInt(edadStr);
            
            String[] notasRecogidas = notas.split(",");
            List<Double> listaNotas = new ArrayList<>();
            for (String n : notasRecogidas) {
                listaNotas.add(Double.parseDouble(n.trim()));
            }

            persona = new Persona(id, nombre, apellido, edad, listaNotas);

            personaDao.addPersona(persona);

        } catch (IllegalArgumentException e) {
            mensajeError = "No ha sido posible añadir la persona";
        }
        if (mensajeError != null) {
            request.setAttribute("mensajeError", mensajeError);
            request.getRequestDispatcher("error.jsp").forward(request, response);
            return;
        } else {

            request.setAttribute("listaPersonas", personaDao.getAll());
            request.setAttribute("personaAdd", persona);
            request.getRequestDispatcher("vistaAddPersona.jsp").forward(request, response);
        }

    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
