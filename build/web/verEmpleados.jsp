<%-- 
    Document   : verEmpleados
    Created on : 2/07/2020, 01:36:47 AM
    Author     : manua
--%>

<%@page contentType="text/html" language="java" import="java.sql.*;" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ver Empleados</title>
    </head>
    <body>
        
        <table>
            <tr>
                <th>ID</th>
                <th>Nombre</th>
                <th>Correo</th>
            </tr>
            <% 
            
                conexion con = new conexion();
                Connection cn = con.getConexion();
                PreparedStatement ps = null;
                ResultSet rs = null;
                
                String sql = "SELECT * FROM usuario WHERE user_priv = 1";
                ps = cn.prepareStatement(sql);
                rs = ps.executeQuery();
                
                while(rs.next()){
                
            %>
            <tr>
                <td><% rs.getInt("user_id"); %></td>
                <td><% rs.getString("user_name"); %></td>
                <td><% rs.getString("user_email"); %></td>
            </tr>
            <%
                }
            %>
        </table>
    </body>
</html>
