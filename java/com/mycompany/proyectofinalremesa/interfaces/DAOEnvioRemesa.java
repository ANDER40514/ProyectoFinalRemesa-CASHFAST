package com.mycompany.proyectofinalremesa.interfaces;

import com.mycompany.proyectofinalremesa.logica.EnvioRemesa;
import java.util.List;

public interface DAOEnvioRemesa {

    public void enviarRemesa(EnvioRemesa remesa) throws Exception;

    public List<EnvioRemesa> listar() throws Exception;
    
    public List<EnvioRemesa> validarTransacion(int ID) throws Exception;

    public List<EnvioRemesa> validarTransacionLogeado(String cedula) throws Exception;
    
    public void generarArchivoCSV();    
    
    public void generarArchivoTXT();
    
    public void generarFacturaPDF();
    
}
