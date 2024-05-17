package com.mycompany.proyectofinalremesa.conexionBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {

    String userName = "root";
    String password = "mysql";
    String schema = "remesa"; // Base de datos
    String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    String url = "jdbc:mysql://localhost:3307/" + schema;

    protected Connection conexion;
    //Usar DAO -> DATA BASE OBJECT

    public ConexionBD() {

    }

    public Connection realizarConexion() {

        try {
            Class.forName(JDBC_DRIVER).newInstance();

            conexion = DriverManager.getConnection(url, userName, password);
            
            //System.out.println("Conexion a la BD " + schema + " Realizada Correctamente.");

        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | SQLException e) {
            System.err.println("Error al conectarse a la BD.");
            System.err.println(e.getMessage());
            e.printStackTrace();
        }
        return conexion;
    }

    public void cerrarConexion() throws SQLException {
        try {
            conexion.close();
        } catch (SQLException e) {
            System.out.println("No fue posible cerrar la conexion");
            e.printStackTrace();
        }
    }
}
