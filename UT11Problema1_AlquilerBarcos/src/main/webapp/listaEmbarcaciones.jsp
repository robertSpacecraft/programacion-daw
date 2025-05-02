<%-- 
    Document   : listaEmbarcaciones
    Created on : 27 abr 2025, 7:05:43
    Author     : Robert
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="com.mycompany.ut11problema1_alquilerbarcos.Embarcacion"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset=UTF-8">
        <link rel="stylesheet" href="css/listaEmbarcaciones.css">
        <title>Lista de Embarcaciones</title>
    </head>
    <body>
        <h1>Lista de Embarcaciones Disponibles:</h1>

        <!-- Muestro el mensaje que viene del servlet -->
        <%
            String mensaje = (String) request.getAttribute("mensaje");
            if (mensaje != null) {
        %>

        <!-- Para que el mensaje se vea en negrita y color azul -->
        <p style="color: blue;"><b><%= mensaje%></b></p>

        <%
            }
        %>

        <!-- Me traigo del servlet la lista de embarcaciones -->
        <%
            ArrayList<Embarcacion> listaBarcos = (ArrayList<Embarcacion>) session.getAttribute("listaEmbarcaciones");
        %>

        <!-- Muestro el contenido en formato tabla -->
        <% if (listaBarcos != null && !listaBarcos.isEmpty()) {

        %>

        <table border="1" cellpadding="10">
            <thead>
                <tr>
                    <th>Matrícula</th>
                    <th>Eslora</th>
                    <th>Año de Fabricación</th>
                    <th>Tipo de Embarcación</th>
                    <th>Acción</th>
                </tr>
            </thead>
            <tbody>
                <% for (Embarcacion e : listaBarcos) {%>
                <tr>
                    <td><%= e.getMatricula()%></td>
                    <td><%= e.getMetrosEslora()%></td>
                    <td><%= e.getFabricacionYear()%></td>
                    <td><%= e.getClass().getSimpleName()%></td>
                    <td><a href="simulador.jsp?matricula=<%= e.getMatricula()%>">Simular Alquiler</a></td>
                </tr>
                <% } %>
            </tbody>
        </table>
        <%
        } else {
        %>
        <p>No hay embarcaciones registradas.</p>
        <%
            }
        %>

        <form action="index.html" method="get">
            <button type="submit">Agregar una nueva embarcación</button>
        </form>

    </body>
</html>
