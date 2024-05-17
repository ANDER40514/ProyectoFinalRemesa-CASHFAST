package com.mycompany.proyectofinalremesa.logica;

public class EnvioRemesa {

    private int id_Envio;
    private String nombreRemitente;
    private String apellidoRemitente;
    private String cedulaRemitente;
    private double monto; // Decimal
    private String moneda;
    private String nombreDestinatario;
    private String apellidoDestinatario;
    private String cedulaDestinatario;
    private int EstatusID;
    private String EstatusDescripcion;

    public EnvioRemesa() {
    }

    public EnvioRemesa(String nombreRemitente, String apellidoRemitente, String cedulaRemitente, float monto, String moneda, String nombreDestinatario, String apellidoDestinatario, String cedulaDestinatario) {
        this.nombreRemitente = nombreRemitente;
        this.apellidoRemitente = apellidoRemitente;
        this.cedulaRemitente = cedulaRemitente;
        this.monto = monto;
        this.moneda = moneda;
        this.nombreDestinatario = nombreDestinatario;
        this.apellidoDestinatario = apellidoDestinatario;
        this.cedulaDestinatario = cedulaDestinatario;
    }

    public int getId_Envio() {
        return id_Envio;
    }

    public void setId_Envio(int id_Envio) {
        this.id_Envio = id_Envio;
    }

        
    public String getNombreRemitente() {
        return nombreRemitente;
    }

    public void setNombreRemitente(String nombreRemitente) {
        this.nombreRemitente = nombreRemitente;
    }

    public String getApellidoRemitente() {
        return apellidoRemitente;
    }

    public void setApellidoRemitente(String apellidoRemitente) {
        this.apellidoRemitente = apellidoRemitente;
    }

    public String getCedulaRemitente() {
        return cedulaRemitente;
    }

    public void setCedulaRemitente(String cedulaRemitente) {
        this.cedulaRemitente = cedulaRemitente;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public String getNombreDestinatario() {
        return nombreDestinatario;
    }

    public void setNombreDestinatario(String nombreDestinatario) {
        this.nombreDestinatario = nombreDestinatario;
    }

    public String getApellidoDestinatario() {
        return apellidoDestinatario;
    }

    public void setApellidoDestinatario(String apellidoDestinatario) {
        this.apellidoDestinatario = apellidoDestinatario;
    }

    public String getCedulaDestinatario() {
        return cedulaDestinatario;
    }

    public void setCedulaDestinatario(String cedulaDestinatario) {
        this.cedulaDestinatario = cedulaDestinatario;
    }

    public int getEstatusID() {
        return EstatusID;
    }

    public void setEstatusID(int EstatusID) {
        this.EstatusID = EstatusID;
    }

    public String getEstatusDescripcion() {
        return EstatusDescripcion;
    }

    public void setEstatusDescripcion(String EstatusDescripcion) {
        this.EstatusDescripcion = EstatusDescripcion;
    } 
}
