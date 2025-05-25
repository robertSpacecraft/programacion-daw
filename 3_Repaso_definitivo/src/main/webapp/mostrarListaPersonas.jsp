<%-- 
    Document   : mostrarListaPersonas
    Created on : 25 may 2025, 8:06:56
    Author     : Robert
--%>

<%@page import="java.util.List"%>
<%@page import="modelo.Persona"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
    <head>
        <meta charset="UTF-8">
        <title>Mostrar Lista Personas</title>
    </head>
    <body>
        <h1>Mostrar Lista Personas</h1>
        <%
            List<Persona> personas = (List<Persona>) request.getAttribute("listaPersonas");
        %>
        <table border="1">
            <tr>
                <th>Id</th>
                <th>Nombre</th>
                <th>Apellido</th>
                <th>Edad</th>
                <th>Notas</th>
            </tr>
            <%
                if (personas != null) {
                    for (Persona p : personas) {
            %>                  

            <tr>
                <td><%= p.getId()%></td>
                <td><%= p.getNombre()%></td>
                <td><%= p.getApellido()%></td>
                <td><%= p.getEdad()%></td>
                <td>
                    <%
                        List<Double> listaNotas = p.getNotas();
                        for (int i = 0; i < listaNotas.size(); i++) {
                            out.print(listaNotas.get(i));
                            if (i < listaNotas.size() - 1) {
                                out.print(" / ");
                            }
                        }
                    %>
                </td>
            </tr>
            <%
                }
            } else {

            %>
            <tr><td colspan="5">No hay personas disponibles</td></tr>
            <%                }
            %>
        </table>

        <p><a href="index.html">Volver al inicio</a></p>
    </body>
</html>
