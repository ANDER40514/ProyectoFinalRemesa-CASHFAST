package com.mycompany.proyectofinalremesa.implementsInterface;

import com.mycompany.proyectofinalremesa.conexionBD.ConexionBD;
import com.mycompany.proyectofinalremesa.interfaces.DAOUsuarios;
import com.mycompany.proyectofinalremesa.logica.Usuarios;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DAOUsuariosImpl extends ConexionBD implements DAOUsuarios {

    @Override
    public void registrar(Usuarios usuario) throws Exception {

        try {
            this.realizarConexion();

            PreparedStatement st = this.conexion.prepareStatement("INSERT INTO usuarios(user,contra,rol) VALUES(?,?,?)");

            // Setear los datos segun la base de datos y la GUI que estariamos enviando
            //Accediendo a los metodos publicos para setear los parametros con los valores de los parametros
            st.setString(1, usuario.getNombreUsuario());
            st.setString(2, usuario.getContra());
            st.setString(3, String.valueOf(usuario.getRol()));
            
            // Ejecutar la Query
            st.executeUpdate();

        } catch (SQLException e) {
            throw e;
        } finally {
            this.cerrarConexion();
        }

    }
}
