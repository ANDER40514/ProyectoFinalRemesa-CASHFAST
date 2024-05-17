
package com.mycompany.proyectofinalremesa.interfaces;

import com.mycompany.proyectofinalremesa.logica.Usuarios;


public interface DAOUsuarios {
    
    /*
    METODOS PARA CRUD DE LA BASE DE DATOS
    C -> Create = INSERT
    R -> READ = Select
    U -> UPDATE = update
    D -> Delete = Delete
     */
    public void registrar(Usuarios usuario) throws Exception;
    
}
