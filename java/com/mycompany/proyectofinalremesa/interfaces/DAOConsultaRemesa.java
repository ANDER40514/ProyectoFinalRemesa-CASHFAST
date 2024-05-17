
package com.mycompany.proyectofinalremesa.interfaces;

import com.mycompany.proyectofinalremesa.logica.EnvioRemesa;
import java.util.List;


public interface DAOConsultaRemesa {
    
    public void eliminarRemesas(int id);
    
    public void actualizarRemesas(int id);
    
    public List<EnvioRemesa> listar(String nombre, String apellido) throws Exception;
    
   // Si me sobra el tiempo Darle funcionalidad a este metodo para la actualizacion de EStatus
   //public void actualizacionRemesa();
    
}
