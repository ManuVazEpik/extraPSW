<%-- 
    Document   : datos
    Created on : 13/07/2020, 02:07:46 AM
    Author     : manua
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registrar Datos</title>
        <script src="js/validaciones.js"></script>
    </head>
    <body>
        <form method="post" action="registrarDireccion" name="form">
            
            <h2>Registra tu domicilio</h2>
            
            <div class="campo">
                Calle:
                <input type="text" onkeypress="return validarPalabras(event)">
            </div>
        </form>
    </body>
</html>
