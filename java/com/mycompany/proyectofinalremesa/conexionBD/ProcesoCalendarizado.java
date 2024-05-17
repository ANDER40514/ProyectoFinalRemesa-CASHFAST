package com.mycompany.proyectofinalremesa.conexionBD;

import java.sql.PreparedStatement;
import java.sql.SQLException;


public class ProcesoCalendarizado extends ConexionBD {

    public void actualizacionProgramada() {

        ConexionBD conexion = new ConexionBD();

        PreparedStatement st = null;
        conexion = null;
        // Crear un ScheduledExecutorService con un solo hilo
        // Programar la tarea para que se ejecute cada minuto
        try {
            this.realizarConexion();

            String query = "UPDATE envioremesa SET EstatusID = 3 WHERE EstatusID = 2";
            st = this.conexion.prepareStatement(query);

            // Ejecutar la Query
            st.executeUpdate();

            // Cerrar la declaración
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (st != null) {
                    st.close();
                }
                if (conexion != null) {
                    this.cerrarConexion();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Proceso Calendarizado de actualizacion de Remesas completado satisfactoriamente.");
    }
}
