/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
/**
 *
 * @author manua
 */
public class servicio {
    
    private int id;
    private String nombre;
    private Date fecha;
    private double precio;

    public servicio() {
    }

    public servicio(int id, String nombre, Date fecha, double precio) {
        this.id = id;
        this.nombre = nombre;
        this.fecha = fecha;
        this.precio = precio;
    }

    public boolean faltaMedia(long fecha){
        
        Calendar calen = null;
        boolean ver = false;
        Date fechaA = calen.getTime();
        
        
        return ver;
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

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    
    
}
