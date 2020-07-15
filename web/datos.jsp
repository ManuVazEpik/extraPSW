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
        <link href="css/isEstilos.css" type="text/css" rel="stylesheet">
        <script src="js/validaciones.js"></script>
    </head>
    <body>
        <form method="post" action="registrarDireccion" name="form">
            
            <h2>Registra tu domicilio</h2>
            
            <div class="campo">
                Calle *:
                <input type="text" name="calle" ondrop="return false" onkeypress="return validarPalabras(event)">
            </div>
            <br>
            <div class="campo">
                Numero Exterior *:
                <input type="number" min="0" max="999" name="numeroE" ondrop="return false" onkeypress="return validarNumero(event)">
            </div>
            <br>
            <div>
                Numero Interior:
                <input type="number" min="0" max="999" name="numeroI" ondrop="return false" onkeypress="return validarNumero(event)">
            </div>
            <br>
            <div>
                Colonia *:
                <input type="text" name="colonia" ondrop="return false" onkeypress="return validarPalabras(event)">
            </div>
            <br>
            <div>
                Delegación *:
                <select name="alcaldia">
                    <option>Coyoacán</option>
                    <option>Miguel Hidalgo</option>
                    <option>Magdalena Contreras</option>
                    <option>Tlahuac</option>
                    <option>Azcapotzalco</option>
                    <option>Iztacalco</option>
                    <option>Alvaro Obregon</option>
                    <option>Xochimilco</option>
                    <option>Venustiano Carranza</option>
                    <option>Tlalpan</option>
                    <option>Cuajimalpa de Morelos</option>
                    <option>Cuauhtemoc</option>
                    <option>Iztapalapa</option>
                    <option>Milpa Alta</option>
                    <option>Benito Juarez</option>
                    <option>Gustavo A. Madero</option>
                </select>
            </div>
            <div>
                Código Postal*:
                <input type="number" min="1" max="99999" name="cp">
            </div>
            <br>
            <input type="submit" value="Registrar Direccion">
        </form>
    </body>
</html>
