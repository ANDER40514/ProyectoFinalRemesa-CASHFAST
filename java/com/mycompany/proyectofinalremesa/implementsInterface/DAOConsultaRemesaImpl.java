package com.mycompany.proyectofinalremesa.implementsInterface;

import com.mycompany.proyectofinalremesa.conexionBD.ConexionBD;
import com.mycompany.proyectofinalremesa.interfaces.DAOConsultaRemesa;
import com.mycompany.proyectofinalremesa.logica.EnvioRemesa;
import java.awt.HeadlessException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class DAOConsultaRemesaImpl extends ConexionBD implements DAOConsultaRemesa {

    @Override
    // La remesa seleccionada se eliminara de la bdd
    public void eliminarRemesas(int id) {
        try {
            this.realizarConexion();

            // PreparadStatement -> el objeto PreparedStatement proporciona una función para ejecutar una consulta parametrizada.
            String query = "DELETE FROM envioremesa WHERE id_envio = ?";

            PreparedStatement st = this.conexion.prepareStatement(query);

            st.setInt(1, id);

            int rowsAffected = st.executeUpdate();

            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(null, "Remesa retirada correctamente.");
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró ninguna remesa con el ID especificado.");
            }
            st.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                this.cerrarConexion();
            } catch (SQLException ex) {
                Logger.getLogger(DAOConsultaRemesaImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    public void actualizarRemesas(int id) {
        try {
            this.realizarConexion();

            // PreparadStatement -> el objeto PreparedStatement proporciona una función para ejecutar una consulta parametrizada.
            String query = "UPDATE envioremesa SET EstatusID = 4 WHERE id_envio = ?";

            PreparedStatement st = this.conexion.prepareStatement(query);

            st.setInt(1, id);
      
            // Ejecutar la Query
            st.executeUpdate();

            st.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                this.cerrarConexion();
            } catch (SQLException ex) {
                Logger.getLogger(DAOConsultaRemesaImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    public List<EnvioRemesa> listar(String nombre, String apellido) throws Exception {
        List<EnvioRemesa> lista = null;

        try {
            this.realizarConexion();
            /*
            La clase PreparedStatement en Java se utiliza para representar una instrucción SQL precompilada.
            Proporciona una forma más segura y eficiente de ejecutar consultas SQL que contienen parámetros 
            variables.
            
             */
            String query = "SELECT e.id_envio, concat(e.nombreRemitente,' ',e.apellidoRemitente) AS nombreCR, e.monto, concat(e.nombreDestinatario,' ',e.apellidoDestinatario) AS nombreCD, r.descripcion FROM envioremesa AS e INNER JOIN remesastatus AS r ON e.EstatusID = r.numeroEstado WHERE e.nombreRemitente = ? AND e.apellidoRemitente = ?";

            PreparedStatement st = this.conexion.prepareStatement(query);
            
            st.setString(1, nombre);
            st.setString(2, apellido);

            lista = new ArrayList();
            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                EnvioRemesa bdremesa = new EnvioRemesa();

                bdremesa.setId_Envio(rs.getInt("id_envio"));
                bdremesa.setNombreRemitente(rs.getString("nombreCR"));
                bdremesa.setMonto(rs.getFloat("monto"));
                bdremesa.setNombreDestinatario(rs.getString("nombreCD"));
                bdremesa.setEstatusDescripcion(rs.getString("descripcion"));

                lista.add(bdremesa);
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
}
