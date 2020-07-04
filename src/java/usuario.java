/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author manua
 */
public class usuario {
    
    private String nombre;
    private String password;
    private String correo;
    private int id;
    private int permiso;

    public usuario() {
    }

    public usuario(String nombre, String password, String correo, int id, int permiso) {
        this.nombre = nombre;
        this.password = password;
        this.correo = correo;
        this.id = id;
        this.permiso = permiso;
    }
    
    

    public String getNombre() {
        System.out.println(nombre);
        return nombre;
    }

    public void setNombre(String nombre) {
        System.out.println(nombre);
        this.nombre = nombre;
    }

    public String getPassword() {
        System.out.println(password);
        return password;
    }

    public void setPassword(String password) {
        System.out.println(password);
        this.password = password;
    }

    public String getCorreo() {
        System.out.println(correo);
        return correo;
    }

    public void setCorreo(String correo) {
        System.out.println(correo);
        this.correo = correo;
    }

    public int getId() {
        System.out.println(id);
        return id;
    }

    public void setId(int id) {
        System.out.println(id);
        this.id = id;
    }

    public int getPermiso() {
        System.out.println(permiso);
        return permiso;
    }

    public void setPermiso(int permiso) {
        System.out.println(permiso);
        this.permiso = permiso;
    }
    
    
    
}
