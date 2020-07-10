<%-- 
    Document   : metodoPago
    Created on : 9/07/2020, 01:58:36 AM
    Author     : manua
--%>

<%@page contentType="text/html" language="java" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Metodo de Pago</title>
        <script src="validaciones.js" type="javascript"></script>
    </head>
    <body>
        <form method="post" name="formulario" action="registrarMetodoPago">
            <div>
            <p>Ingresa un nuevo método de pago.</p>
        </div>
        <div class="campo">
            Ingresa la tarjeta de credito/debito:
            <input type="number" name="tarjeta" onkeypress="return validarTarjerta(event)" onpaste="return false" ondrop="return false" required="required">
        </div>
        <div class="campo">
            Codigo de seguridad
            <input type="number" name="codigo" onkeypress="return validarCodigo(event)" ondrop="return false" onpaste="return false" required="required">
        </div>
        <div>
            Fecha de Vencimiento:
            <input type="date" name="vencimiento">
        </div>
        <div class="campo">
            Propietario de la tarjeta:
            <input type="text" maxlength="100" name="propietario" onkeypress="return validarPalabras(event)" onpaste="return false" ondrop="return false" required="required">
        </div>
        </form>
    </body>
</html>
