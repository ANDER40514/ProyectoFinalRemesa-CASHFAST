
package com.mycompany.proyectofinalremesa.logica;


public class TasaCambio {
    private String moneda;
    private float montoCompra;
    private float montoVenta;

    public TasaCambio() {
    }

    public TasaCambio(String moneda, float montoCompra, float montoVenta) {
        this.moneda = moneda;
        this.montoCompra = montoCompra;
        this.montoVenta = montoVenta;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public float getMontoCompra() {
        return montoCompra;
    }

    public void setMontoCompra(float montoCompra) {
        this.montoCompra = montoCompra;
    }

    public float getMontoVenta() {
        return montoVenta;
    }

    public void setMontoVenta(float montoVenta) {
        this.montoVenta = montoVenta;
    }

    
   
    
    
    
}
