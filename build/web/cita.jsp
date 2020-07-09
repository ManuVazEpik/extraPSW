<%-- 
    Document   : cita
    Created on : 8/07/2020, 07:39:11 PM
    Author     : manua
--%>

<%@page import="java.text.DateFormat"%>
<%@page contentType="text/html" import="java.util.*;" language="java" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Agendar Cita</title>
    </head>
    
    <%
    
        DateFormat calen = DateFormat.getDateInstance();
        Date fechaActual = new Date();
    
    %>
    
    <body>
        <div>Agenda una cita ahora mismo.</div>
        <form method="post" name="form1" action="agendarCita">
            
            <div class="campo">
                Fecha para la cita:
                <input type="date" name="fecha" min="2020-07-08" max="2030-07-08">
            </div>
            <div class="campo">
                Hora de la cita:
                <input type="time" min="09:00:00" max="18:00:00">
            </div>
            <select name="servicios">
                <%
                
        Vector<servicio> listaS  = servicio.listaServicios();
        if (listaS != null && listaS.isEmpty()) {
                
            for( servicio servicioT: listaS ){
            
                %>
                <option>
                    <%= servicioT.getNombre() %>
                </option>
                <% } 
            } %>
            </select>
            <input type="submit" value="Agendar Cita">
        </form>
    </body>
</html>
