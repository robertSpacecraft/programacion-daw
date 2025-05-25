<%-- 
    Document   : error
    Created on : 25 may 2025, 11:05:32
    Author     : Robert
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
    <head>
        <meta charset="UTF-8">
        <title>Error</title>
    </head>
    <body>
        <h1>Página de error</h1>
        <div>
            <%= request.getAttribute("mensajeError") %>
        </div>
    </body>
</html>
