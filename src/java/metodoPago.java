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
public class metodoPago {
    
    private int tarjeta;
    private int codigo;
    private long vencimiento;
    private String propietario;

    public metodoPago() {
    }

    public metodoPago(int tarjeta, int codigo, long vencimiento, String propietario) {
        this.tarjeta = tarjeta;
        this.codigo = codigo;
        this.vencimiento = vencimiento;
        this.propietario = propietario;
    }

    public boolean registrarTarjeta(int tarjeta, int codigo, long vencimiento, String propietario) throws ClassNotFoundException, SQLException{
    
        boolean ver = false;
        Connection con = conexion.getConexion();
        PreparedStatement ps = null;
        ResultSet rs = null;
        usuario u = new usuario();
        
        try {
            
            String sql = "insert into metodopago(num_tar,nom_tar,cod_tar,ven_tar,user_id)values(?,?,?,?,?)";
            ps = con.prepareStatement(sql);
            ps.setInt(1, tarjeta);
            ps.setString(2, propietario);
            ps.setInt(3, codigo);
            ps.setLong(4, vencimiento);
            ps.setInt(5, u.getId());
            System.out.println("Carga de datos completa");
            rs = ps.executeQuery();
            ver= true;
            con.close();
            ps.close();
            rs.close();
            
            
        } catch (Exception e) {
            
            System.out.println("Fallo el procedimiento");
            System.out.println(e.getStackTrace());
            System.out.println(e.getMessage());
            ver = false;
            con.close();
            ps.close();
            rs.close();
            
        }
        
    return ver;    
    }
    
    public int getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(int tarjeta) {
        this.tarjeta = tarjeta;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public long getVencimiento() {
        return vencimiento;
    }

    public void setVencimiento(long vencimiento) {
        this.vencimiento = vencimiento;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }
    
    
    
}
