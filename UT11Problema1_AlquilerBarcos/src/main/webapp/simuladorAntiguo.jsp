<%-- 
    Document   : simulador
    Created on : 29 abr 2025, 19:20:32
    Author     : Robert
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html lang="es">
    <head>
        <meta charset="UTF-8">
        <!-- <link rel="stylesheet" href="css/simulador.css"> -->
        <title>Simular alquiler</title>
    </head>
    <body>
        <h1>Simulación del alquiler</h1>
        <%
            String matricula = request.getParameter("matricula");
            if (matricula == null) {            
        %>
        <p style="color:red;">Error al recibir la matrícula</p>
        <p><a href="listaEmbarcaciones.jsp">Volver al listado</a></p>
        <% 
        } else {
        %>
        <form action="calcularAlquiler" method="post">
            <label for="matricula">Matricula de la embarcación</label>
            <input type="text" name="matricula" value="<%= matricula %>" readonly style="background-color: #f0f0f0;">
             
            <label for="nombre">Nombre del cliente</label>
            <input type="text" id="nombre" name="nombre" required><br>
            
            <label for="dni">DNI del cliente</label>
            <input type="text" id="dni" name="dni" required><br>
            
            <label for="diasAlquilado">Días de alquiler</label>
            <input type="number" id="diasAlquilado" name="diasAlquilado" required><br>
            
            <label for="ubicacionAmarre">Ubicación del amarre</label>
            <input type="text" id="ubicacionAmarre" name="ubicacionAmarre" required>
            
            <button type="submit">Simular Alquiler</button>
            
        </form>
            <%
                }
            %>
    </body>
</html>
