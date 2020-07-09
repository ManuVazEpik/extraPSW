<%-- 
    Document   : index
    Created on : 4/07/2020, 01:27:33 AM
    Author     : manua
--%>

<%@page contentType="text/html" language="java" session="true" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Estetica La Bella</title>
    </head>
    <body>
        <% 
           String usuario ="";
           HttpSession sesionIni = request.getSession(); 
            
           if (sesionIni.getAttribute("usuario") == null || (Integer)sesionIni.getAttribute("permiso") != 3) {
                    
                
        %>
        
        <jsp:forward page="error.jsp">
            <jsp:param name="Error" value="Es obligatorio que usted se identifique"></jsp:param>
        </jsp:forward>
        
        <%
            }else{
                usuario = (String)sesionIni.getAttribute("usuario");}
            
        %>
        <nav class="navegador">
            <ul>
                <li>Inicio</li>
                <li><a href="servicios.java">Servicios</a></li>
                <li>Usuario
                    <ul>
                        <li><a>Cuenta</a></li>
                        <li><a href="cita.jsp">Agendar Cita</a></li>
                    </ul>
                </li>
                <li><a href="cerrarSesion">Cerrar sesion</a></li>
            </ul>
        </nav>
        <div class="presentacion"><h2>Bienvenido <%=usuario%>.</h2></div>
        <section class="princial">
            <div class="contenedor">
                <h1>¡Bienvenido a la página oficial Éstetica "La Bella"</h1>
                <br>
                <p>Aquí encontrarás todo lo que necesitas para verte presentable para cualquier tipo de evento</p>
            </div>
            <div>Conoce nustra gran gama de servicios a los que podrás acceder con un simple clic.
                <br>
                <p>Desde los cortes de cabello a la moda hasta nuestros servicios especiales, sin duda, una de 
                    tus mejores opciones para lucir
                espectácular en cualquier evento.</p>
            </div>
            <div>
                Inicia sesion para comenzar a hacer reservaciones en este preciso instante.
            </div>
        </section>
    </body>
</html>