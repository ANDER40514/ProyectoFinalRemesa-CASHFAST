package com.mycompany.proyectofinalremesa.interfaces;

import com.mycompany.proyectofinalremesa.logica.Cliente;
import java.util.List;

public interface DAOCliente {

    /*
    METODOS PARA CRUD DE LA BASE DE DATOS
    C -> Create = INSERT
    R -> READ = Select
    U -> UPDATE = update
    D -> Delete = Delete
    
     */
    public void registrar(Cliente client) throws Exception;
    
    public Cliente login(String n1,String n2) throws Exception;

    public List<Cliente> listar() throws Exception;
}
