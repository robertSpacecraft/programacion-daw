<%-- 
    Document   : error
    Created on : 25 may 2025, 18:10:22
    Author     : Robert
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head lang="es">
        <meta charset="UTF-8">
        <title>Error</title>
    </head>
    <body>
        <h1>Error</h1>
        <p><%= request.getAttribute("mensajeError") %></p>
        <p><a href="index.html">Volver al inicio</a>
    </body>
</html>
