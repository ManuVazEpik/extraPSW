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
        <link href="css/index.css" rel="stylesheet" type="text/css">
        <link href="css/navegador.css" rel="stylesheet" type="text/css">
        <script src="https://kit.fontawesome.com/9745ccff2a.js" crossorigin="anonymous"></script>
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
        
    <header>
    <input type="checkbox" id="btn-menu">
    <label for="btn-menu"><i class="fas fa-bars"></i></label>
    <nav class="navegador">
        <ul>
            <li><a href="index.jsp"><i class="fas fa-home"></i>Inicio</a></li>
            <li><a href="serviciosLog"><i class="fas fa-concierge-bell"></i>Servicios</a></li>
            <li><a href="cuenta.jsp"><i class="fas fa-user"></i>Cuenta</a></li>
            <li><a href="agendarCita"><i class="far fa-calendar-plus"></i>Agendar Cita</a></li>
            <li><a href="metodoPago.jsp">Registrar Metodo de Pago</a></li>
            <li><a href="cerrarSesion"><i class="fas fa-sign-out-alt"></i>Cerrar Sesion</a></li>
        </ul>
    </nav>
   </header>
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
            <br>
            <div>
                <a href="inicioSesion.jsp">Inicia sesion para comenzar a hacer reservaciones en este preciso instante.</a>
            </div>
        </section>
        <br>
        <section class="conocenos">
            <div class="izquierda">
                <img src="img/persona3.jpg" alt="Administrador Ivan" class="grande">
                <div>
                    <h1>Iván</h1>
                    <p>El fundador de nuesto negocio, Iván Vázquez. Bajo la idea de poner precios accesibles a servicios de belleza, fundó la primer sucursal que daría píe a este imperio de la moda.</p>
                </div> 
            </div>
            <br>
            <div class="derecha">
                <img src="img/persona1.jpg" alt="Estilista Sara" class="grande">
                <div>
                    <h1>Sara</h1>
                    <p>Graduada de la Alta Academia de Belleza de la Ciudad de México, Sara, una de nuestras mejores maquillistas, creadora de íconicos estilos
                        de tus personajes favoritos de peliculas y caricaturas. ¡Su ingenio no tiene limites!
                    </p>
                </div>
            </div>
            <br>
            <div class="izquierda">
                <img src="img/persona2.jpg" alt="Estilista Guadalupe" class="grande">
                <div>
                    <h1>Guadalupe</h1>
                    <p>Una especialista del cuidado capilar. Sus delicadas manos haran a tu cabeza, pies y manos sentir que estas en el cielo.</p>
                </div>
            </div>
        </section>
        <br>
        <br>
        <section class="imagenes">
            <p>Conoce algunos de los tranajos realizados por nuestros especialistas</p>
            <div class="tarjeta">
                <img alt="Imagen 1" src="img/IMG-20200701-WA0046.jpg" class="ampliar chico">
                <br>
            </div>
            <div class="tarjeta">
                <img alt="Imagen 2" src="img/IMG-20200701-WA0021.jpg" class="ampliar chico">
                <br>
            </div>
            <div class="tarjeta">
                <img alt="Imagen 3" src="img/IMG-20200701-WA0044.jpg" class="ampliar chico">
                <br>
            </div>
            <div class="tarjeta">
                <img alt="Imagen 4" src="img/IMG-20200701-WA0050.jpg" class="ampliar chico">
                <br>
            </div>
        </section>
    </body>
</html>