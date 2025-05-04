<%-- 
    Document   : mostrarAlquiler
    Created on : 30 abr 2025, 19:41:13
    Author     : Robert
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="com.mycompany.ut11problema1_alquilerbarcos.Alquiler"%>
<!DOCTYPE html>
<html lang="es">
    <head>
        <meta charset=UTF-8">
        <link rel="stylesheet" href="css/mostrarAlquiler.css">
        <title>Mostrar Alquiler</title>
    </head>
    <body>
        <h1>Simulación del Alquiler</h1>
        
        <%
            String mensaje = (String) request.getAttribute("mensaje");
            Alquiler alquilerAmarre = (Alquiler) request.getAttribute("alquilerAmarre");
        %>
        
        <%
            if (mensaje != null){ %>
            <p style="color: blue;"><b><%= mensaje %></b></p>
        <% } %>
            
            <%
                if (alquilerAmarre != null) { %>
                <p><strong>Datos del cliente:</strong></p>
                <p><strong>Nombre: </strong><%= alquilerAmarre.getNombre()%></p>
                <p><strong>DNI: </strong><%= alquilerAmarre.getDni()%></p>
                <p><strong>Días alquilado: </strong><%= alquilerAmarre.getDiasAlquilado()%></p>
                <p><strong>Ubicación del amarre: </strong><%= alquilerAmarre.getUbicacionAmarre() %></p>
                <p><strong>Embarcación: </strong></p>
                <pre><%= alquilerAmarre.getEmbarcacion()%></pre>
                <p><strong>Precio: </strong><%= alquilerAmarre.getPrecio()%> €</p>
           <% } %>
           
           <p><a href="verLista">Volver al listado de embarcaciones</a></p>
    </body>
</html>
