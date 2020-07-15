<%-- 
    Document   : admin
    Created on : 30/06/2020, 11:33:03 PM
    Author     : manua
--%>


<%@page contentType="text/html" language="java" session="true" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Gerente La Bella</title>
        <link href="css/index.css" rel="stylesheet" type="text/css">
        <link href="css/navegador.css" rel="stylesheet" type="text/css">
        <script src="https://kit.fontawesome.com/9745ccff2a.js" crossorigin="anonymous"></script>
    </head>
    <body>
        <% 
           String usuario ="";
           HttpSession sesionIni = request.getSession(); 
            
           if (sesionIni.getAttribute("usuario") == null || (Integer)sesionIni.getAttribute("permiso") != 0) {
                    
                
        %>
        
        <jsp:forward page="error.jsp">
            <jsp:param name="Error" value="Es obligatorio que usted se identifique"></jsp:param>
        </jsp:forward>
        
        <%
            }else{
                usuario = (String)sesionIni.getAttribute("usuario");}
            
        %>
        <header>
        <input type="checkbox" id="btn-menu">
        <label for="btn-menu"><i class="fas fa-bars"></i></label>
        <nav class="navegador">
        <ul>
            <li><a href="gerente.jsp"><i class="fas fa-home"></i>Inicio</a></li>
            <li><a href="servicios"><i class="fas fa-concierge-bell"></i>Servicios</a></li>
            <li><a href="verCitas"><i class="far fa-calendar-alt"></i>Ver Citas</a></li>
            <li><a href="cerrarSesion"><i class="fas fa-sign-out-alt"></i>Cerrar Sesion</a></li>
        </ul>
        </nav>
        </header>
        <div class="presentacion"><h2>Bienvenido <%=usuario%>.</h2></div>
        <section class="princial">
            <div class="contenedor">
                <h1>¡Bienvenido a la página oficial Éstetica "La Bella"</h1>
                <br>
                <p>Aquí encontrarás todo lo que necesitas para verte presentable para cualquier tipo de evento</p>
            </div>
            <div>Conoce nustra gran gama de servicios a los que podrás acceder con un simple clic.
                <br>
                <p>Desde los cortes de cabello a la moda hasta nuestros servicios especiales, sin duda, una de tus mejores opciones para lucir
                espectácular en cualquier evento.</p>
            </div>
            <div>
                Inicia sesion para comenzar a hacer reservaciones en este preciso instante.
            </div>
        </section>
        <section class="conocenos">
            
            
        </section>
        <section class="imagenes">
            <div class="contenedor">
                <img src="img/IMG-20200701-WA0036.jpg" alt="Imagen chida" class="derecha ampliar">
                <p>
                Dentro de nuestras sucursales tenemos un equipo de especialistas, dedicados enteramente para tu cuidado.
                <br>
                ¡Deja tu cabello en nustras manos y no te arrepentiras!</p>
            </div>
        </section>
        <section class="imagenes">
            <p>Conoce algunos de los tranajos realizados por nuestros especialistas</p>
            <div class="tarjeta">
                <img alt="Imagen 1" src="img/IMG-20200701-WA0046.jpg" class="ampliar">
                <br>
            </div>
            <div class="tarjeta">
                <img alt="Imagen 2" src="img/IMG-20200701-WA0021.jpg" class="ampliar">
                <br>
            </div>
            <div class="tarjeta">
                <img alt="Imagen 3" src="img/IMG-20200701-WA0044.jpg" class="ampliar">
                <br>
            </div>
            <div class="tarjeta">
                <img alt="Imagen 4" src="img/IMG-20200701-WA0050.jpg" class="ampliar">
                <br>
            </div>
        </section>
    </body>
</html>

