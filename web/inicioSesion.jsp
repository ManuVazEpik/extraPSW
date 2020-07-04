<%-- 
    Document   : inicioSesion
    Created on : 24/06/2020, 09:01:01 PM
    Author     : manua
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Inicio Sesion</title>
        <link href="css/estiloSesion.css" rel="stylesheet" type="text/css">
        <script src="js/validacionLogin.js"></script>
    </head>
    <body>
        <form method="post" name="formulario" action="verificarUsuario">
            <div class="izquierda">
                <h1>Si ya tienes una cuenta registrada, inicia sesion.</h1>
                <br>
                Usuario:
                <div class="campo"><input type="text" name="usuario" required="required"></div>
                <br>
                Contraseña:
                <div class="campo"><input type="password" name="pass" required="required"></div>
                <br>
                <input type="submit" value="Iniciar Sesion" class="boton">
            </div>
        </form>
        <form method="post" name="formulario2" action="registrarUsuario">
            <div class="derecha">
                <h1>Si aun no tienes una cuenta registrada, crea una en este momento.</h1>
            <br>
            Usuario:
            <div class="campo"><input type="text" name="usuarior" required="required"></div>
            <br>
            Correo Electronico:
            <div class="campo"><input type="text" name="correo" required="required"></div>
            <br>
            Contraseña:
            <div class="campo"><input type="password" name="passr" required="required"></div>
            <br>
            <input type="submit" value="Registrar" class="boton">
            </div>
        </form>
    </body>
</html>
