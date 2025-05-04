<%-- 
    Document   : listaClientes
    Created on : 4 may 2025, 10:57:34
    Author     : Robert
--%>

<%@page import="com.mycompany.ut11problema1_alquilerbarcos.ClienteDTO"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
    <head>
        <meta charset=UTF-8">
        <link rel="stylesheet" href="css/listaClientes.css">
        <title>Lista Clientes</title>
    </head>
    <body>
        <h1>Listado de clientes</h1>
        <%
            String mensaje = (String) request.getAttribute("mensaje");
            if (mensaje != null) {
        %>
        <p style="color: blue;"><b><%= mensaje%></b></p>
                <% } %>

        <%
            ArrayList<ClienteDTO> listaClientes = (ArrayList<ClienteDTO>) session.getAttribute("listaClientes");
        %>

        <%
            if (listaClientes != null && !listaClientes.isEmpty()) { %>
        <table>
            <thead>
                <tr>
                    <th>Nombre</th>
                    <th>DNI</th>
                    <th>Ciudad</th>
                    <th>Acción</th>
                </tr>
            </thead>
            <tbody>
                <% for (ClienteDTO c : listaClientes) {%>
                <tr>
                    <td><%= c.getNombre()%></td>
                    <td><%= c.getDni()%></td>
                    <td><%= c.getCiudad()%></td>
                    <td>
                        <%
                            String matriculaSeleccionada = (String) session.getAttribute("matriculaSeleccionada");
                        %>
                        <form action="simulador.jsp" method="get">
                            <input type="hidden" name="dni" value="<%= c.getDni()%>">
                            <input type="hidden" name="matricula" value="<%= matriculaSeleccionada%>">
                            <button type="submit">Simular Alquiler</button>
                        </form>
                    </td>

                </tr>
                <% } %>
            </tbody>
        </table>

        <% } else { %>
        <p>No hay clientes registrados</p>
        <% }%>

        <form action="agregarCliente.jsp" method="get">
            <button type ="submit">Agregar nuevo cliente</button>
        </form>

        <p><a href="index.html">Volver al inicio</a></p>
    </body>
</html>
