package com.mycompany.proyectofinalremesa.logica;


public class Cliente  {
    
    
    private int id_cliente;
    private String nombre;
    private String Apellido;
    private String cedula;
    private String Direccion;
    private String pais;
    
    // Luego cambiar por un USUARIO user
    private String user;
    private String contra;
    private char rol;

    public Cliente() {
    }

    public Cliente(int id_cliente, String nombre, String Apellido, String cedula, String Direccion, String pais, String user, String contra, char rol) {
        this.id_cliente = id_cliente;
        this.nombre = nombre;
        this.Apellido = Apellido;
        this.cedula = cedula;
        this.Direccion = Direccion;
        this.pais = pais;
        this.user = user;
        this.contra = contra;
        this.rol = rol;
    }
    

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
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

    public void setRol(char rol) {
        this.rol = rol;
    }
}

    
