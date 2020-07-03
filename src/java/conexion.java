/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.sql.*;
import java.util.*;

/**
 *
 * @author manua
 */
public class conexion {
    
    public static Connection getConexion() throws ClassNotFoundException{
    
            Connection con = null;
            String url = "jdbc:mysql://localhost:3306/estetica";
            String user = "root";
            String pass = "n0m3l0";
            
            try {

            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url,user,pass);
                System.out.println("Conexion exitosa");
                
        } catch (Exception e) {
            
                System.out.println("Conexion fallida");
                System.out.println(e.getStackTrace());
                System.out.println(e.getMessage());
            
        }
        
        return con;
    }
    
    public boolean verificarUsuario(String usuario, String password) throws ClassNotFoundException, SQLException{
    
        boolean verificar = false;
        Connection con = conexion.getConexion();
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = "SELECT * FROM usuario WHERE(user_name= ? AND user_pass = ?)";
        
        try {
            
            ps = con.prepareStatement(sql);
            ps.setString(1, usuario);
            ps.setString(2, password);
            rs = ps.executeQuery();
            System.out.println("Conexion a la tabla exitosa");
            usuario u = new usuario();
            
            while(rs.next()){
            
                u.setId(rs.getInt("user_id"));
                System.out.println(u.getId());
                u.setCorreo(rs.getString("user_email"));
                System.out.println(u.getCorreo());
                u.setPassword(rs.getString("user_pass"));
                System.out.println(u.getPassword());
                u.setNombre(rs.getString("user_name"));
                System.out.println(u.getNombre());
                u.setPermiso(rs.getInt("user_priv"));
                System.out.println(u.getPermiso());
                System.out.println("Llenado de datos finalizado");
                verificar = true;
            }
            con.close();
            ps.close();
            rs.close();
        } catch (Exception e) {
            System.out.println(e.getMessage()+ "\n");
            System.out.println("Conexion a la tabla fallida");
            verificar = false;
            con.close();
            ps.close();
            rs.close();
        }
        System.out.println(verificar);
    return verificar;
    }
    
    public boolean modificarNombre(String nombre, String nombreA , int id) throws ClassNotFoundException{
    
        boolean verificar = false;
        Connection con = conexion.getConexion();
        PreparedStatement ps = null;
        int rs = 0;
        try {
            
            usuario u = new usuario();
            
            String sql = "update usuario set user_name= ? where user_name = ? and user_id = ?";
            ps = con.prepareStatement(sql);
            ps.setString(1, nombre);
            ps.setString(2, nombreA);
            ps.setInt(3, id);
            ps.executeUpdate();
            u.setNombre("");
            u.setNombre(nombre);
            
            verificar = true;
            
        } catch (Exception e) {
            
            System.out.println(e.getMessage());
            System.out.println("Fallo en la carga de datos");
            System.out.println(e.getStackTrace());
            verificar = false;
            
        }
        
        
    return verificar;
    }
    
    public boolean modificarCorreo(String correo, String correoA , int id) throws ClassNotFoundException{
    
        boolean verificar = false;
        Connection con = conexion.getConexion();
        PreparedStatement ps = null;
        int rs = 0;
        try {
            
            usuario u = new usuario();
            
            String sql = "update usuario set user_email= ? where user_email = ? and user_id = ?";
            ps = con.prepareStatement(sql);
            ps.setString(1, correo);
            ps.setString(2, correoA);
            ps.setInt(3, id);
            ps.executeUpdate();
            u.setCorreo("");
            u.setCorreo(correo);
            
            verificar = true;
            
        } catch (Exception e) {
            
            System.out.println(e.getMessage());
            System.out.println("Fallo en la carga de datos");
            System.out.println(e.getStackTrace());
            verificar = false;
            
        }
        
        
    return verificar;
    
}
    
    public boolean modificarPassword(String pass, String passA , int id) throws ClassNotFoundException{
    
        boolean verificar = false;
        Connection con = conexion.getConexion();
        PreparedStatement ps = null;
        int rs = 0;
        try {
            
            usuario u = new usuario();
            
            String sql = "update usuario set user_pass= ? where user_pass = ? and user_id = ?";
            ps = con.prepareStatement(sql);
            ps.setString(1, pass);
            ps.setString(2, passA);
            ps.setInt(3, id);
            ps.executeUpdate();
            u.setPassword("");
            u.setPassword(pass);
            
            verificar = true;
            
        } catch (Exception e) {
            
            System.out.println(e.getMessage());
            System.out.println("Fallo en la carga de datos");
            System.out.println(e.getStackTrace());
            verificar = false;
            
        }
        
        
    return verificar;
   
    }
}
