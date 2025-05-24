<%-- 
    Document   : error
    Created on : 24 may 2025, 19:09:16
    Author     : Robert
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head lang="es">
        <meta charset="UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Error</h1>
        <p><%= request.getAttribute("mensajeError") %></p>
        <p><a href="index.html">Volver al inicio</a>
    </body>
</html>
