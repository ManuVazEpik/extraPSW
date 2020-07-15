/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.sql.*;

/**
 *
 * @author manua
 */
public class direccion {
    
    private String calle;
    private String colonia;
    private String alcaldia;
    private int numE;
    private int numI;
    private int cp;
    
    public boolean registrarDireccion(String calle, String colonia, String alcaldia, int numE, int numI, int cp, int user_id) throws ClassNotFoundException, SQLException{
    
        boolean ver = false;
        Connection con = conexion.getConexion();
        PreparedStatement ps = null;
        int resultado = 0;
        
        try {
            
            String sql = "insert into direccion(calle,numeroExt,numeroInt,colonia,delegacion,CP,user_id)values(?,?,?,?,?,?,?)";
            ps = con.prepareStatement(sql);
            ps.setString(1, calle);
            ps.setInt(2, numE);
            ps.setInt(3, numI);
            ps.setString(4, colonia);
            ps.setString(5, alcaldia);
            ps.setInt(6, cp);
            ps.setInt(7, user_id);
            resultado = ps.executeUpdate();
            
            if (resultado == 1) {
                
                ver = true;
                
            }
            else{
            
                ver = false;
            
            }
            con.close();
            ps.close();
            
            
        } catch (Exception e) {
            
            System.out.println("Error");
            System.out.println(e.getMessage());
            System.out.println(e.getStackTrace());
            ver = false;
            con.close();
            ps.close();
            
        }
    
        return ver;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public String getAlcaldia() {
        return alcaldia;
    }

    public void setAlcaldia(String alcaldia) {
        this.alcaldia = alcaldia;
    }

    public int getNumE() {
        return numE;
    }

    public void setNumE(int numE) {
        this.numE = numE;
    }

    public int getNumI() {
        return numI;
    }

    public void setNumI(int numI) {
        this.numI = numI;
    }

    public int getCp() {
        return cp;
    }

    public void setCp(int cp) {
        this.cp = cp;
    }
    
    
    
}
