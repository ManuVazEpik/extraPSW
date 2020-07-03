<%-- 
    Document   : cuentaEstilista
    Created on : 1/07/2020, 12:05:12 AM
    Author     : manua
--%>

<%@page contentType="text/html" language="java" import="java.sql.*;" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cuenta</title>
    </head>
    <body>
        
        <div>
            <%
                
                usuario u = new usuario();
                String user = u.getNombre();
                String correo = u.getCorreo();
                String pass = u.getPassword();
                
            %>
            <form method="post" action="modificarNombreE">
                <div class="campo">
                Usuario:
                <input type="text" value="<%=user%>" readonly="readonly">
                </div>
                <br>
                <div class="campo">
                    Nuevo usuario:
                    <input type="text" name="correo" required="required">
                </div>
                <input type="submit" value="Actualizar">
            </form>
                <br>
            <form method="post" action="modificarCorreoE">
                <div class="campo">
                Correo anterior:
                <input type="text" value="<%=correo%>">
                </div>
                <br>
                <div class="campo">
                    Correo nuevo:
                    <input type="text" name="correo" required="required">
                </div>
                <br>
                <input type="submit" value="Actualizar">
            </form>
                <br>
            <form method="post" action="modificarPassE">
                <div class="campo">
                Usuario:
                <input type="text" value="<%=pass%>" readonly="readonly">
                </div>
                <br>
                <div class="campo">
                    Nuevo usuario:
                    <input type="text" name="password" required="required">
                </div>
                <br>
                <input type="submit" value="Actualizar">
            </form>
                <br>
                <form method="post" action="modificarDireccionE">
                <div class="campo">
                Usuario:
                <input type="text" value="<%=pass%>" readonly="readonly">
                </div>
                <br>
                <div class="campo">
                    Nuevo usuario:
                    <input type="text" name="password" required="required">
                </div>
                <br>
                <input type="submit" value="Actualizar">
            </form>
                <br>
        </div>
                <div><a href="admin.jsp">Volver</a></div>
    </body>
</html>
