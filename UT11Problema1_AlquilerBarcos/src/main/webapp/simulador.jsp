<%@page import="com.mycompany.ut11problema1_alquilerbarcos.ClienteDTO"%>
<%@page import="com.mycompany.ut11problema1_alquilerbarcos.ClienteDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <title>Simulación del Alquiler</title>
    <link rel="stylesheet" href="css/simulador.css">
</head>
<body>
    <h1>Simulación de Alquiler</h1>

    <%
        String dni = request.getParameter("dni");
        String matricula = (String) session.getAttribute("matriculaSeleccionada"); // vendrá del listado de embarcaciones

        ClienteDTO cliente = ClienteDAO.getListaClientes()
                .stream()
                .filter(c -> c.getDni().equalsIgnoreCase(dni))
                .findFirst()
                .orElse(null);
    %>

    <% if (cliente == null) { %>
        <p style="color: red;">Cliente no encontrado. <a href="agregarCliente.jsp">Agregar nuevo cliente</a></p>
    <% } else { %>
        <form action="calcularAlquiler" method="post">
            <!-- Datos ocultos que no debe cambiar el usuario -->
            <input type="hidden" name="dni" value="<%= cliente.getDni() %>">
            <input type="hidden" name="nombre" value="<%= cliente.getNombre() %>">
            <input type="hidden" name="matricula" value="<%= matricula %>">

            <!-- Ciudad editable -->
            <label for="ubicacionAmarre">Ubicación del amarre:</label>
            <input type="text" id="ubicacionAmarre" name="ubicacionAmarre" value="<%= cliente.getCiudad() %>" required><br>

            <!-- Días de alquiler -->
            <label for="diasAlquilado">Días de alquiler:</label>
            <input type="number" id="diasAlquilado" name="diasAlquilado" min="1" required><br>

            <button type="submit">Confirmar Simulación</button>
        </form>
    <% } %>

    <p><a href="verListadoClientes">Volver al listado de clientes</a></p>
</body>
</html>

