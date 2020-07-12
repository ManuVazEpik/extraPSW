/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author manua
 */
public class verificarUsuario extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, ClassNotFoundException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            
            String usuario = request.getParameter("usuario");
            System.out.println(usuario);
            String pass = request.getParameter("pass");
            System.out.println(pass);
            
            conexion con = new conexion();
            usuario u = new usuario();
            u = con.verificarUsuario(usuario, pass);
            
            if (u != null) {
                
                HttpSession sesion = request.getSession(true);
                sesion.setAttribute("usuario",u);
                
                HttpSession sesionIni = request.getSession();
                sesionIni.setAttribute("usuario", usuario);
                System.out.println((String)sesionIni.getAttribute("usuario"));
                sesionIni.setAttribute("correo", u.getCorreo());
                System.out.println((String)sesionIni.getAttribute("correo"));
                sesionIni.setAttribute("password", u.getPassword());
                System.out.println((String)sesionIni.getAttribute("password"));
                sesionIni.setAttribute("permiso", u.getPermiso());
                System.out.println((Integer)sesionIni.getAttribute("permiso"));
                
                System.out.println("Carga de datos concluida");
                
                System.out.println(u.getPermiso());
                
                switch(u.getPermiso()){
                
                    case 0:
                        System.out.println("Eres admi");
                        response.sendRedirect("gerente.jsp");
                        break;
                    
                    case 1:
                        System.out.println("Casi eres admi");
                        response.sendRedirect("Estilista.jsp");
                        break;
                    
                    case 2:
                        System.out.println("Lejos de ser admi");
                        response.sendRedirect("Asistente.jsp");
                        break;
                    
                    case 3:
                        System.out.println("Ni de pedo vas a ser admi");
                        response.sendRedirect("index.jsp");
                        break;
                        
                    default:
                        response.sendRedirect("error.jsp");
                        break;
                
                }
                
            
        }
    }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            try {
                processRequest(request, response);
            } catch (SQLException ex) {
                Logger.getLogger(verificarUsuario.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(verificarUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            try {
                processRequest(request, response);
            } catch (SQLException ex) {
                Logger.getLogger(verificarUsuario.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(verificarUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
