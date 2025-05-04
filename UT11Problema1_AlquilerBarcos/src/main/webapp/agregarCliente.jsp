<%-- 
    Document   : agregarCliente
    Created on : 4 may 2025, 17:55:05
    Author     : Robert
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <title>Agregar nuevo cliente</title>
    <link rel="stylesheet" href="css/agregarCliente.css">
</head>
<body>

    <h1>Formulario de alta de cliente</h1>

    <% String mensaje = (String) request.getAttribute("mensaje"); %>
    <% if (mensaje != null) { %>
        <p style="color: blue;"><b><%= mensaje %></b></p>
    <% } %>

    <form action="AgregarCliente" method="post">
        <label for="nombre">Nombre:</label>
        <input type="text" id="nombre" name="nombre" required>

        <label for="dni">DNI:</label>
        <input type="text" id="dni" name="dni" maxlength="9" required>

        <label for="ciudad">Ciudad:</label>
        <input type="text" id="ciudad" name="ciudad" required>

        <input type="submit" value="Agregar Cliente">
    </form>

    <p><a href="VerListadoClientes">Volver al listado de clientes</a></p>

</body>
</html>

