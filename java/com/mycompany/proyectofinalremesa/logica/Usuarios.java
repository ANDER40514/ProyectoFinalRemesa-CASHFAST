
package com.mycompany.proyectofinalremesa.logica;


//Mapeando la clase usuarios
public class Usuarios {
    
    // ALT + ESPACIO para mostrar las opciones

    private int id_Usuario;
    private String nombreUsuario;
    private String contra;
    private char rol;

    public Usuarios() {
    }

    public Usuarios(int id_Usuario, String nombreUsuario, String contra, char rol) {
        this.id_Usuario = id_Usuario;
        this.nombreUsuario = nombreUsuario;
        this.contra = contra;
        this.rol = rol;
    }

    public int getId_Usuario() {
        return id_Usuario;
    }

    public void setId_Usuario(int id_Usuario) {
        this.id_Usuario = id_Usuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public char getRol() {
        return rol;
    }

    public void setRol(char Rol) {
        this.rol = Rol;
    }
    
    
}
