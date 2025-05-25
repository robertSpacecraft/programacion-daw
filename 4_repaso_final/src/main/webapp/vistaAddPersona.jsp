<%-- 
    Document   : vistaAddPersona
    Created on : 25 may 2025, 17:57:34
    Author     : Robert
--%>

<%@page import="modelo.Persona"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head lang="es">
        <meta charset="UTF-8">
        <title>Vista Add Persona</title>
    </head>
    <body>
        <h1>Persona Añadida</h1>
        <%
            Persona nuevaPersona = (Persona) request.getAttribute("nuevaPersona");
        %>
        <ul>
            <li><%= nuevaPersona.getId()%></li>
            <li><%= nuevaPersona.getNombre()%></li>
            <li><%= nuevaPersona.getEdad()%></li>
        </ul>
        <form action="mostrarLista" method="get">
            <button type="submit">Mostrar lista</button>
        </form>
        <p><a href="index.html">Volver al inicio</a></p>
    </body>
</html>
