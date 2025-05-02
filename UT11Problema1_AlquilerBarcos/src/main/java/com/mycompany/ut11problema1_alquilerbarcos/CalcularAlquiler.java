/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.mycompany.ut11problema1_alquilerbarcos;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Robert
 */
@WebServlet("/calcularAlquiler")
public class CalcularAlquiler extends HttpServlet {

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

        //Recupero la sesión y la lista de embarcaciones
        HttpSession sesion = request.getSession();
        ArrayList<Embarcacion> listaEmbarcaciones = (ArrayList<Embarcacion>) sesion.getAttribute("listaEmbarcaciones");

        String matricula = request.getParameter("matricula");
        String nombre = request.getParameter("nombre");
        String dni = request.getParameter("dni");
        String diasAlquiladoStr = request.getParameter("diasAlquilado");
        String ubicacionAmarre = request.getParameter("ubicacionAmarre");

        Alquiler alquilerAmarre = null;

        String mensaje = null;

        //Validaciones
        if (matricula == null) {
            mensaje = "Error: Matrícula no valida";

        } else if (listaEmbarcaciones == null) {
            mensaje = "Error: listado de embarcaciones no encontrado";

        } else {
            //Buscamos la embarcación usando el método de la clase
            Embarcacion embarcacion = Embarcacion.buscar(listaEmbarcaciones, matricula);
            if (embarcacion == null) {
                mensaje = "Error: No se ha encontrado ninguna embarcación con la matricula: "
                        + matricula;
            } else {
                if (dni == null || dni.length() != 9) {
                    mensaje = "El DNI debe contener 9 caracteres";
                }
                if (mensaje == null) {
                    try {
                        //Convertimos las variables que lo requieran a String
                        int diasAlquilado = Integer.parseInt(diasAlquiladoStr);

                        if (diasAlquilado <= 0) {
                            mensaje = "El número de días debe ser mayor a 0";

                        } else {
                            alquilerAmarre = new Alquiler(nombre, dni, diasAlquilado, ubicacionAmarre, embarcacion);
                            mensaje = "Simulación Completada";
                        }

                    } catch (NumberFormatException e) {
                        mensaje = "Error: Formato de los días inválido";
                    }
                }
            }
        }
        //Añado al request el mensaje y el objeto alquiler, accederé a esto desde el jsp
        request.setAttribute("mensaje", mensaje);
        request.setAttribute("alquilerAmarre", alquilerAmarre);

        //Envío la petición con todos los datos a mostrarAlquiler.jsp para que los muestre
        request.getRequestDispatcher("mostrarAlquiler.jsp").forward(request, response);

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
