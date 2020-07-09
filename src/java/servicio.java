/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.*;
import java.util.Vector;

/**
 *
 * @author manua
 */
public class servicio {
    
    private int id;
    private String nombre;
    private Time fecha;
    private double precio;

    public servicio() {
    }

    public servicio(int id, String nombre, Time fecha, double precio) {
        this.id = id;
        this.nombre = nombre;
        this.fecha = fecha;
        this.precio = precio;
    }

    public boolean faltaMedia(long fecha) throws ClassNotFoundException{
        
        Time calen = null;
        boolean ver = false;
        long dia = calen.getTime();
        int mes = calen.getMonth();
        int año = calen.getYear()+1900;
        Connection con = conexion.getConexion();
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql ="select cita_fecha,cita_hora from cita where cita_fecha = ?";
        //String sql2 = "select ";
        
        try {
            
            ps = con.prepareStatement(sql);
            ps.setInt(1, 0);
            
        } catch (Exception e) {
        }
        
        //System.out.println(fechaA);
        
        return ver;
    }
    
    public static Vector<servicio> listaServicios() throws ClassNotFoundException, SQLException{
    
        Connection con = conexion.getConexion();
        PreparedStatement ps = null;
        ResultSet rs  = null;
        Vector<servicio> listaS = new Vector<servicio>();
        
        try {
            
            String sql = "Select * from servicios";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            while(rs.next()){
            
                servicio ser = new servicio();
                ser.setId(rs.getInt("id_ser"));
                ser.setNombre(rs.getString("servicio"));
                ser.setFecha(rs.getTime("duracion"));
                ser.setPrecio(rs.getDouble("costo"));
                listaS.add(ser);
                con.close();
                ps.close();
                rs.close();
                
            }
            
        } catch (Exception e) {
            
            System.out.println("Fallo en la carga de datos");
            con.close();
            rs.close();
            ps.close();
            
        }
    
        return listaS;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Time getFecha() {
        return fecha;
    }

    public void setFecha(Time fecha) {
        this.fecha = fecha;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    
    
}
