/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.PreparedStatement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpSession;

/**
 *
 * @author manua
 */
public class verCitas extends HttpServlet {

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
            throws ServletException, IOException, ClassNotFoundException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            Connection con = conexion.getConexion();
            PreparedStatement ps = null;
            ResultSet rs = null;
            String sql = "select * from cita";
            HttpSession sesionIni = request.getSession();
            int user_id = (Integer)sesionIni.getAttribute("user_id");
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Ver Citas</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<table>"
                    + "<tr>ID:</tr>"
                    + "<tr>Hora de inicio:</tr>"
                    + "<tr>Hora de finalizado:</tr>");
                    
                    try {
                
                        ps = con.prepareStatement(sql);
                        rs = ps.executeQuery();
                        
                        while(rs.next()){
                        
                            out.println("<td>"
                                    + "<tr>"
                                    + rs.getDate("cita_fecha")
                                    + "</tr>"
                                    + "</td>");
                        
                            out.println("<td>"
                                    + "<tr>"
                                    + rs.getTime("cita_hora")
                                    + "</tr>"
                                    + "</td>");
                            
                            out.println("<td>"
                                    + "<tr>"
                                    + rs.getTime("cita_horaF")
                                    + "</tr>"
                                    + "</td>");
                            
                        }
                        
            } catch (Exception e) {
            }
            
            out.println("</table>");
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
            Logger.getLogger(verCitas.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(verCitas.class.getName()).log(Level.SEVERE, null, ex);
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
