package com.mycompany.proyectofinalremesa.implementsInterface;

import com.mycompany.proyectofinalremesa.conexionBD.ConexionBD;
import com.mycompany.proyectofinalremesa.interfaces.DAOCliente;
import com.mycompany.proyectofinalremesa.logica.Cliente;
import com.mycompany.proyectofinalremesa.logica.Encriptacion;
import java.awt.HeadlessException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DAOClienteImpl extends ConexionBD implements DAOCliente {

    /*
            PreparedStatement es una interfaz en Java que extiende la interfaz Statement y se utiliza para ejecutar
            consultas SQL precompiladas en una base de datos relacional. Proporciona una forma eficiente y segura
            de ejecutar consultas parametrizadas, lo que ayuda a prevenir ataques de inyección SQL 
            y mejora el rendimiento de las consultas repetitivas
     */
    @Override         //Insertar datos
    public void registrar(Cliente cliente) throws Exception {

        try {
            this.realizarConexion();

            PreparedStatement st = this.conexion.prepareStatement("INSERT INTO cliente(id,nombre,apellido,cedula,direccion,pais,Usuario,contra,rol) VALUES(?,?,?,?,?,?,?,?,?);");

            // Setear los datos segun la base de datos y la GUI que estariamos enviando
            //Accediendo a los metodos publicos para setear los parametros con los valores de los parametros
            st.setInt(1, cliente.getId_cliente());
            st.setString(2, cliente.getNombre());
            st.setString(3, cliente.getApellido());
            st.setString(4, cliente.getCedula());
            st.setString(5, cliente.getDireccion());
            st.setString(6, cliente.getPais());
            st.setString(7, cliente.getUser());
            st.setString(8, cliente.getContra());

            // Utiliza el método setString() y convierte el char a String
            st.setString(9, String.valueOf(cliente.getRol()));

            // Ejecutar la Query
            st.executeUpdate();

        } catch (SQLException e) {
            throw e;
        } finally {
            this.cerrarConexion();
        }

    }



    @Override
    // Hacer una consulta READ
    public List<Cliente> listar() throws Exception {
        List<Cliente> lista = null;

        try {
            this.realizarConexion();
            /*
            La clase PreparedStatement en Java se utiliza para representar una instrucción SQL precompilada.
            Proporciona una forma más segura y eficiente de ejecutar consultas SQL que contienen parámetros 
            variables.
            
             */
            PreparedStatement st = this.conexion.prepareStatement("SELECT * FROM cliente;");

            lista = new ArrayList();
            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                Cliente client = new Cliente();
                client.setId_cliente(rs.getInt("id"));
                client.setNombre(rs.getString("nombre"));
                client.setApellido(rs.getString("apellido"));
                client.setCedula(rs.getString("cedula"));
                client.setDireccion(rs.getString("direccion"));
                client.setPais(rs.getString("pais"));
                client.setContra(rs.getString("contra"));
                // client.setRol(rs.getChar("rol"));
                lista.add(client);
            }
            rs.close();
            st.close();

        } catch (SQLException e) {
            throw e;

        } finally {
            this.cerrarConexion();
        }

        return lista;
    }

    @Override      
    public Cliente login(String n1, String n2) throws Exception {
        boolean sesion = false;
        ResultSet rs = null;
        Cliente client = null;
        Encriptacion encriptacion = new Encriptacion();
        
        try {
            this.realizarConexion();
            

            // PreparadStatement -> el objeto PreparedStatement proporciona una función para ejecutar una consulta parametrizada.

            PreparedStatement st = this.conexion.prepareStatement("SELECT * FROM cliente WHERE usuario = ? AND contra = ?");

            st.setString(1, n1);
            st.setString(2, n2);
                                    
            rs = st.executeQuery();

            if (rs.next()) {
                client = new Cliente();
                client.setNombre(rs.getString("nombre"));
                client.setApellido(rs.getString("apellido"));
                client.setCedula(rs.getString("cedula"));
                client.setContra("contra");
                
                sesion = true;
                 
                javax.swing.JOptionPane.showMessageDialog(null, "Ingresando...", "INFO", javax.swing.JOptionPane.INFORMATION_MESSAGE); 
            } 
            rs.close();
            st.close();
        } catch (HeadlessException | SQLException e) {
            e.printStackTrace();
        } finally {
            
            this.cerrarConexion();
        }        
        return client;
    }
}
