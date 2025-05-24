<%-- 
    Document   : mostrarTriangulo
    Created on : 24 may 2025, 19:15:29
    Author     : Robert
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
    <head>
        <meta charset="UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Triángulo</h1>
        <p><%= request.getAttribute("a") %></p>
        <p><%= request.getAttribute("b") %></p>
        <p><%= request.getAttribute("c") %></p>
        
        <p><%= request.getAttribute("perimetro") %></p>
        <p><%= request.getAttribute("area") %></p>
        <p><%= request.getAttribute("triangulo") %></p>
        
        <p><a href="index.html">Volver al inicio</a></p>
    </body>
</html>
