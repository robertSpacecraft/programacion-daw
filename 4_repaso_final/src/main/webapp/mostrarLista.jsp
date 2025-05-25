<%-- 
    Document   : mostrarLista
    Created on : 25 may 2025, 16:28:07
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
        <h1>Lista de Personas</h1>
        <%
            List<Persona> listaPersonas = (List<Persona>) request.getAttribute("listaPersonas");
        %>

        <table>
            <tr>
                <th>Id</th>
                <th>Nombre</th>
                <th>Edad</th>
            </tr>
            <%
                if (listaPersonas != null && !listaPersonas.isEmpty()) {
                    for (Persona p : listaPersonas) {
            %>
            <tr>
                <td><%= p.getId()%></td>
                <td><%= p.getNombre()%></td>
                <td><%= p.getEdad()%></td>
            </tr>
            <%
                }
            } else {
            %>
            <tr>
                <td>No hay personas en la lista</td>
            </tr>
            <%
                }
            %>
        </table>
        <p><a href="index.html">Volver al inicio</a></p>
    </body>
</html>
