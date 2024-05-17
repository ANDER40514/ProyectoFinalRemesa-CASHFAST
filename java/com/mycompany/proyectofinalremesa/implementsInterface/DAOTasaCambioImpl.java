package com.mycompany.proyectofinalremesa.implementsInterface;

import com.mycompany.proyectofinalremesa.conexionBD.ConexionBD;
import com.mycompany.proyectofinalremesa.interfaces.DAOTasaCambio;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DAOTasaCambioImpl extends ConexionBD implements DAOTasaCambio {

    private String nombreArchivo;
    private String extensionArchivo;
    private int contador = 1;
    //  private String nombreCompletoArchivo = nombreArchivo + "(" + contador + ")" + extensionArchivo;

    public String getNombreArchivo() {
        return nombreArchivo;
    }

    public String getExtensionArchivo() {
        return extensionArchivo;
    }

    public void setNombreArchivo(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }

    public void setExtensionArchivo(String extensionArchivo) {
        this.extensionArchivo = extensionArchivo;
    }

    @Override
    public void generarArchivoCSV() {
        setNombreArchivo("Reporte-Tasa");
        setExtensionArchivo(".csv");

        String rutaDescargas = System.getProperty("user.home") + "/Downloads/";

        String nombreCompletoArchivo = getNombreArchivo() + getExtensionArchivo(); // Aquí configuras el nombre del archivo correctamente
        File archivoDescargado = new File(rutaDescargas + nombreCompletoArchivo);

        try {

            while (archivoDescargado.exists()) {
                nombreCompletoArchivo = getNombreArchivo() + "(" + contador + ")" + getExtensionArchivo();
                archivoDescargado = new File(rutaDescargas + nombreCompletoArchivo);
                contador++;
            }

            this.realizarConexion();

            PreparedStatement st = this.conexion.prepareStatement("SELECT * FROM tasaCambio;");
            ResultSet rs = st.executeQuery();

            try (BufferedWriter writer = new BufferedWriter(new FileWriter(archivoDescargado))) {
                // Preparar la cabecera del documento CSV
                writer.write("Moneda,MonedaCompra,MonedaVenta\n");

                // Escribir los datos de cada fila en el archivo CSV
                while (rs.next()) {
                    writer.write("Moneda: " + escapeCSVValue(rs.getString("moneda")) + ",");
                    writer.write("\n");
                    writer.write("Moneda Compra: " + escapeCSVValue(rs.getFloat("monedaCompra")) + ",");
                    writer.write("\n");
                    writer.write("Moneda Venta: " + escapeCSVValue(rs.getFloat("monedaVenta")) + "\n");
                }
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            rs.close();
            st.close();
            this.cerrarConexion();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    // Método para escapar valores de columna que contienen comas o comillas
    private String escapeCSVValue(Object value) {
        if (value == null) {
            return ""; // Si el valor es nulo, devolver una cadena vacía
        }
        return String.valueOf(value);
    }

    @Override
    public void generarArchivoTXT() {
        setNombreArchivo("Reporte-Tasa");
        setExtensionArchivo(".txt");
        String rutaDescargas = System.getProperty("user.home") + "/Downloads/";

        String nombreCompletoArchivo = getNombreArchivo() + getExtensionArchivo(); // Aquí configuras el nombre del archivo correctamente

        //Creo el archivo en la carpeta de Descargas
        File ArchivoDescargado = new File(rutaDescargas + nombreCompletoArchivo);

        try {
            while (ArchivoDescargado.exists()) {
                nombreCompletoArchivo = getNombreArchivo() + "(" + contador + ")" + getExtensionArchivo();
                ArchivoDescargado = new File(rutaDescargas + nombreCompletoArchivo);
                contador++;
            }
            this.realizarConexion();

            PreparedStatement st = this.conexion.prepareStatement("SELECT * FROM tasaCambio;");
            ResultSet rs = st.executeQuery();

            try (FileWriter escritor = new FileWriter(ArchivoDescargado)) {
                // Escribir los datos en el archivo de texto
                while (rs.next()) {
                    escritor.write("Moneda: " + rs.getString("moneda") + "\n");
                    escritor.write("Moneda Compra: " + rs.getFloat("monedaCompra") + "\n");
                    escritor.write("Moneda Venta: " + rs.getFloat("monedaVenta") + "\n\n");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

            rs.close();
            st.close();
            this.cerrarConexion();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
