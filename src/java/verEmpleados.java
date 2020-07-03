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
public class verEmpleados extends HttpServlet {

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
            String sql = "select * from usuario where user_priv = 1";
            String sql2 = "select * from usuario where user_priv = 2";
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Ver empleados</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<table>" + "<tr><th>Estilistas</th></tr>"
                    + "<tr>\n" +
"                   <th>ID</th>\n" +
"                   <th>Nombre</th>\n" +
"                   <th>Correo</th>\n" +
"                       </tr>");
            
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            while(rs.next()){
            
                out.println("<tr>");
                out.println("<td>" + rs.getInt("user_id") +"</td>");
                out.println("<td>" + rs.getString("user_name") +"</td>");
                out.println("<td>" + rs.getString("user_email") +"</td>");
                
                out.println("</tr>");
            
            }
            out.println("</table>");
            
            //Reset de los parametros 
            con = null;
            con = conexion.getConexion();
            ps = null;
            rs = null;
            
            out.println("<table>" + "<tr><th>Asistentes</th></tr>"
                    + "<tr>\n" +
"                   <th>ID</th>\n" +
"                   <th>Nombre</th>\n" +
"                   <th>Correo</th>\n" +
"                       </tr>");
            
            ps = con.prepareStatement(sql2);
            rs = ps.executeQuery();
            
            while(rs.next()){
            
                out.println("<tr>");
                out.println("<td>" + rs.getInt("user_id") +"</td>");
                out.println("<td>" + rs.getString("user_name") +"</td>");
                out.println("<td>" + rs.getString("user_email") +"</td>");
                
                out.println("</tr>");
            
            }
            out.println("</table>");
            
            out.println("<a href='gerente.jsp'>Volver</a>");
            out.println("</body>");
            out.println("</html>");
            con.close();
            rs.close();
            ps.close();
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
                Logger.getLogger(verEmpleados.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(verEmpleados.class.getName()).log(Level.SEVERE, null, ex);
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
                Logger.getLogger(verEmpleados.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(verEmpleados.class.getName()).log(Level.SEVERE, null, ex);
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
