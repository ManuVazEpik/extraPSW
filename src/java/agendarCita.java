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
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author manua
 */
public class agendarCita extends HttpServlet {

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
            
            Connection con = conexion.getConexion();
            PreparedStatement ps = null;
            ResultSet rs = null;
            String sql = "select servicio from servicios;";
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Agendar Cita</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Agenda tu cita ahora mismo.</h1>");
            out.println("<form method='post' name='form' action='validarCita'>"
                    + "<div>"
                    + "Elija fecha de la cita:"
                    + "<input type='date' min='2020-07-15' max='2021-07-15' name='dia'>"
                    + "</div><br>"
                    + "<div>"
                    + "Elija la hora de la fecha:"
                    + "<input type='time' min='09:00:00' max='18:00:00' name='hora'>"
                    + "</div><br>"
                    + "<div>"
                    + "Elija el servicio 1:"
                    + "<select name='ser1'>");
                    
                    try{
                    
                        ps = con.prepareStatement(sql);
                        rs = ps.executeQuery();
                        while(rs.next()){
                        
                            out.println("<option>" + rs.getString("servicio") + "</option>");
                        
                        }
                        
                    }catch(Exception e){
                    
                        System.out.println("Error");
                    
                    }
                    
                     out.println("</select>"
                    + "</div><br>"
                    + "<div>"
                    + "Elija el servicio 2:"
                    + "<select name='ser2'>"
                    + "<option>Ninguno</option>");
                    
                    try{
                    
                        ps = con.prepareStatement(sql);
                        rs = ps.executeQuery();
                        while(rs.next()){
                        
                            out.println("<option>" + rs.getString("servicio") + "</option>");
                        
                        }
                        
                    }catch(Exception e){
                    
                        System.out.println("Error");
                    
                    }
                    
                     out.println("</select>"
                             + "</div><br>"
                             + "<div>"
                             + "Elija el servicio 3:"
                    + "<select name = 'ser3'>");
                    
                    try{
                    
                        ps = con.prepareStatement(sql);
                        rs = ps.executeQuery();
                        while(rs.next()){
                        
                            out.println("<option>" + rs.getString("servicio") + "</option>");
                        
                        }
                        
                    }catch(Exception e){
                    
                        System.out.println("Error");
                    
                    }
                    
                     out.println("</select>"
                             + "</div><br>"
                             + "<input type='submit' value='Registrar Cita'>"
                    + "</form>");
            out.println("</body>");
            out.println("</html>");
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
            processRequest(request, response);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(agendarCita.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(agendarCita.class.getName()).log(Level.SEVERE, null, ex);
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
            processRequest(request, response);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(agendarCita.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(agendarCita.class.getName()).log(Level.SEVERE, null, ex);
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
