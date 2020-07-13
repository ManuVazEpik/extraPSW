<%-- 
    Document   : cita
    Created on : 8/07/2020, 07:39:11 PM
    Author     : manua
--%>

<%@page import="java.text.DateFormat"%>
<%@page contentType="text/html" import="java.sql.*;" language="java" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Agendar Cita</title>
    </head>
    
    <%
    
        
        try{
        
        
        String tiempoA = "select curtime()";
        String fechaA = "select curdate()";
        conexion con = new conexion();
        Connection cn = con.getConexion();
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        ps = cn.prepareStatement(tiempoA);
        rs = ps.executeQuery();
        
        while(rs.next()){
        
            
            
        }
            
        }catch(Exception e){}
    
    %>
    
    <body>
        <div>Agenda una cita ahora mismo.</div>
        <form method="post" name="form" action="agendarCita">
            
            <div class="campo">
                Fecha para la cita:
                <input type="date" name="fecha" min="2020-07-08" max="2030-07-08">
            </div>
            <div class="campo">
                Hora de la cita:
                <input type="time" min="09:00:00" max="18:00:00">
            </div>
            
              
            <input type="submit" value="Agendar Cita">
        </form>
    </body>
</html>
