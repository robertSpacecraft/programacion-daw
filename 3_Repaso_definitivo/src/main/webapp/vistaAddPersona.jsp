<%@page import="modelo.Persona"%>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <title>Persona Añadida</title>
</head>
<body>

    <h1>Persona añadida correctamente</h1>

    <ul>
        <%
            Persona persona = (Persona) request.getAttribute("personaAdd");
        %>
        <li>ID: <%= persona.getId() %></li>
        <li>Nombre: <%= persona.getNombre() %></li>
        <li>Apellido: <%= persona.getApellido() %></li>
        <li>Edad: <%= persona.getEdad() %></li>
        <li>Notas: <%= persona.getNotas() %></li>
    </ul>

    <form action="ListarPersonas" method="get">
        <button type="submit">Ver lista completa</button>
    </form>
    
    <p><a href="index.html">Volver al inicio</a></p>

</body>
</html>
