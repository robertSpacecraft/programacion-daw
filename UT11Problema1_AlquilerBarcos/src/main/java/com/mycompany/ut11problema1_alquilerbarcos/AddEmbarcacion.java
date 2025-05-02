/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.mycompany.ut11problema1_alquilerbarcos;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.annotation.WebServlet;

/**
 *
 * @author Robert
 */
@WebServlet("/addEmbarcacion")

public class AddEmbarcacion extends HttpServlet {

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

        //Recupero la lista de embarcaciones
        HttpSession session = request.getSession(); //Para obtener la sesion del usuario
        ArrayList<Embarcacion> listaEmbarcaciones = (ArrayList<Embarcacion>) session.getAttribute("listaEmbarcaciones");

        //Sí listaEmbarcaciones no existe creará una nueva lista
        if (listaEmbarcaciones == null) {
            listaEmbarcaciones = new ArrayList<>();
            session.setAttribute("listaEmbarcaciones", listaEmbarcaciones);
        }

        String matricula = request.getParameter("matricula");
        String metrosEsloraStr = request.getParameter("metrosEslora");
        String fabricacionYearStr = request.getParameter("fabricacionYear");

        String numeroMastilesStr = request.getParameter("numeroMastiles");
        String potenciaStr = request.getParameter("potencia");
        String numCamarotesStr = request.getParameter("numeroCamarotes");

        String tipoEmbarcacion = request.getParameter("tipo");

        String mensaje = null;
        Embarcacion nuevaEmbarcacion = null;

        //Valido que los campos no sean null
        if (matricula == null || metrosEsloraStr == null || fabricacionYearStr == null) {
            mensaje = "Faltan campos obligatorios: Matricula, Metros de eslora o Año de fabricación";
            request.setAttribute("mensaje", mensaje);
            request.getRequestDispatcher("listaEmbarcaciones.jsp").forward(request, response);
            return;
        } else {
            try {
                //Hago el casting de tipos de las variables no String
                double metrosEslora = Double.parseDouble(metrosEsloraStr);
                int fabricacionYear = Integer.parseInt(fabricacionYearStr);

                //La matrícula debe tener 4 caracteres, La eslora no puede ser negativa yEl año de fabricación no puede ser mayor al año actual
                if (matricula.length() != 4) {
                    mensaje = "La matrícula debe ser de 4 caracteres";
                } else if (metrosEslora < 0) {
                    mensaje = "La eslora tiene que ser un valor positivo";
                } else if (fabricacionYear > LocalDate.now().getYear() || fabricacionYear < 1700) {
                    mensaje = "Un barco normal no puede viajar al futuro";
                } else {
                    switch (tipoEmbarcacion) {
                        case "velero":
                            int numeroMastiles = Integer.parseInt(numeroMastilesStr);
                            if (numeroMastiles <= 0) {
                                mensaje = "El valero debe tener al menos un mastil";
                            } else {
                                nuevaEmbarcacion = new Velero(numeroMastiles, matricula, metrosEslora, fabricacionYear);
                            }
                            break;
                        case "deportiva":
                            double potencia = Double.parseDouble(potenciaStr);
                            if (potencia <= 0) {
                                mensaje = "La potencia debe ser mayor qeu 0";
                            } else {
                                nuevaEmbarcacion = new Deportiva(potencia, matricula, metrosEslora, fabricacionYear);
                            }
                            break;
                        case "yate":
                            potencia = Double.parseDouble(potenciaStr);
                            int numCamarotes = Integer.parseInt(numCamarotesStr);
                            if (potencia <= 0) {
                                mensaje = "La potencia y el número de camarotes debe ser mayor que 0";
                            } else {
                                nuevaEmbarcacion = new Yate(potencia, numCamarotes, matricula, metrosEslora, fabricacionYear);
                            }
                            break;

                    }
                }

            } catch (NumberFormatException e) {
                System.out.println("Error: Formato numérico incorrecto" + e.getMessage());
            }

            if (mensaje != null) {
                request.setAttribute("mensaje", mensaje);
                request.getRequestDispatcher("listaEmbarcaciones.jsp").forward(request, response);
            } else {
                if (Embarcacion.buscar(listaEmbarcaciones, matricula) != null) {
                    mensaje = "Ya existe una embarcación con esa matrícula";
                } else {
                    listaEmbarcaciones.add(nuevaEmbarcacion);
                    mensaje = "La embarcación con matricula " + matricula
                            + " se ha añadido correctamente";
                }
                request.setAttribute("mensaje", mensaje);
                request.getRequestDispatcher("listaEmbarcaciones.jsp").forward(request, response);
            }
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Gestión de los datos obtenidos en el formulario";
    }// </editor-fold>

}
