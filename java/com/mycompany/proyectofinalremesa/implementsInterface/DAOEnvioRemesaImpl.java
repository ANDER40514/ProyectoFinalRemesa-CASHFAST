package com.mycompany.proyectofinalremesa.implementsInterface;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.mycompany.proyectofinalremesa.conexionBD.ConexionBD;
import com.mycompany.proyectofinalremesa.interfaces.DAOEnvioRemesa;
import com.mycompany.proyectofinalremesa.logica.EnvioRemesa;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DAOEnvioRemesaImpl extends ConexionBD implements DAOEnvioRemesa {

    private String nombreArchivo;
    private String extensionArchivo;
    private int contador = 1;
    // private String nombreCompletoArchivo = nombreArchivo + "(" + contador + ")" + extensionArchivo;

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
    public void enviarRemesa(EnvioRemesa remesa) throws Exception {
        try {
            this.realizarConexion();

            PreparedStatement st = this.conexion.prepareStatement("INSERT INTO envioRemesa(nombreRemitente,apellidoRemitente,cedulaRemitente,monto,moneda,nombreDestinatario,apellidoDestinatario,cedulaDestinatario,EstatusID) VALUES(?,?,?,?,?,?,?,?,?);");

            // Setear los datos segun la base de datos y la GUI que estariamos enviando
            //Accediendo a los metodos publicos para setear los parametros con los valores de los parametros
            st.setString(1, remesa.getNombreRemitente());
            st.setString(2, remesa.getApellidoRemitente());
            st.setString(3, remesa.getCedulaRemitente());
            st.setDouble(4, remesa.getMonto());
            st.setString(5, remesa.getMoneda());
            st.setString(6, remesa.getNombreDestinatario());
            st.setString(7, remesa.getApellidoDestinatario());
            st.setString(8, remesa.getCedulaDestinatario());
            st.setInt(9, 2);

            // Ejecutar la Query
            st.executeUpdate();

        } catch (SQLException e) {
            throw e;
        } finally {
            this.cerrarConexion();
        }

    }

    @Override
    public List<EnvioRemesa> listar() throws Exception {
        List<EnvioRemesa> lista = null;

        try {
            this.realizarConexion();
            /*
            La clase PreparedStatement en Java se utiliza para representar una instrucción SQL precompilada.
            Proporciona una forma más segura y eficiente de ejecutar consultas SQL que contienen parámetros 
            variables.
            
             */
            PreparedStatement st = this.conexion.prepareStatement("SELECT * FROM envioremesa;");

            lista = new ArrayList();
            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                EnvioRemesa bdremesa = new EnvioRemesa();
                bdremesa.setId_Envio(rs.getInt("id_envio"));
                bdremesa.setNombreRemitente(rs.getString("nombreRemitente"));
                bdremesa.setApellidoRemitente(rs.getString("apellidoRemitente"));
                bdremesa.setCedulaRemitente(rs.getString("cedulaRemitente"));
                bdremesa.setMonto(rs.getFloat("monto"));
                bdremesa.setNombreDestinatario(rs.getString("nombreDestinatario"));
                bdremesa.setApellidoDestinatario(rs.getString("apellidoDestinatario"));
                bdremesa.setCedulaDestinatario(rs.getString("cedulaDestinatario"));
                bdremesa.setEstatusID(rs.getInt("EstatusID"));

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

    @Override
    public List<EnvioRemesa> validarTransacion(int ID) throws Exception {
        List<EnvioRemesa> remesas = new ArrayList<>();

        try {
            this.realizarConexion();
            /*
            La clase PreparedStatement en Java se utiliza para representar una instrucción SQL precompilada.
            Proporciona una forma más segura y eficiente de ejecutar consultas SQL que contienen parámetros 
            variables.
            
             */
            PreparedStatement st = this.conexion.prepareStatement("SELECT e.id_envio ,e.nombreRemitente, e.nombreDestinatario,r.descripcion FROM envioremesa AS e INNER JOIN remesastatus AS r ON e.EstatusID = r.numeroEstado WHERE id_envio = ?;");

            st.setInt(1, ID);
            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                EnvioRemesa bdremesa = new EnvioRemesa();

                bdremesa.setId_Envio(rs.getInt("id_envio"));
                bdremesa.setNombreRemitente(rs.getString("nombreRemitente"));
                bdremesa.setNombreDestinatario(rs.getString("nombreDestinatario"));
                bdremesa.setEstatusDescripcion(rs.getString("descripcion"));

                remesas.add(bdremesa);
            }

            rs.close();
            st.close();
        } catch (SQLException e) {
            throw e;

        } finally {
            this.cerrarConexion();
        }
        return remesas;
    }

    @Override
    public void generarArchivoCSV() {
        setNombreArchivo("Reporte-Envio-Remesa");
        setExtensionArchivo(".csv");

        String rutaDescargas = System.getProperty("user.home") + "/Downloads/";

        String nombreCompletoArchivo = getNombreArchivo() + getExtensionArchivo();
        File ArchivoDescargado = new File(rutaDescargas + nombreCompletoArchivo);

        try {
            while (ArchivoDescargado.exists()) {
                nombreCompletoArchivo = getNombreArchivo() + "(" + contador + ")" + getExtensionArchivo();
                ArchivoDescargado = new File(rutaDescargas + nombreCompletoArchivo);
                contador++;
            }

            this.realizarConexion();

            PreparedStatement st = this.conexion.prepareStatement("SELECT * FROM envioremesa;");
            ResultSet rs = st.executeQuery();

            try (BufferedWriter writer = new BufferedWriter(new FileWriter(ArchivoDescargado))) {
                // Preparar la cabecera del documento CSV
                writer.write("Id_envio,NombreRemitente,ApellidoRemitente,CedulaRemitente,Monto,Moneda,NombreDestinatario,ApellidoDestinatario,CedulaDestinatario,EstatusID\n");

                // Escribir los datos de cada fila en el archivo CSV
                while (rs.next()) {
                    writer.write("\nID: " + escapeCSVValue(rs.getInt("id_envio")) + ",");
                    writer.write("\n");
                    writer.write("Nombre Remitente: " + escapeCSVValue(rs.getString("nombreRemitente")) + ",");
                    writer.write("\n");
                    writer.write("Apellido Remitente: " + escapeCSVValue(rs.getString("apellidoRemitente")) + ",");
                    writer.write("\n");
                    writer.write("Cedula Remitente: " + escapeCSVValue(rs.getString("cedulaRemitente")) + ",");
                    writer.write("\n");
                    writer.write("Monto: " + escapeCSVValue(rs.getFloat("monto")) + ",");
                    writer.write("\n");
                    writer.write("Moneda: " + escapeCSVValue(rs.getString("moneda")) + ",");
                    writer.write("\n");
                    writer.write("Nombre Destinatario: " + escapeCSVValue(rs.getString("nombreDestinatario")) + ",");
                    writer.write("\n");
                    writer.write("Apellido Destinatario: " + escapeCSVValue(rs.getString("apellidoDestinatario")) + ",");
                    writer.write("\n");
                    writer.write("Cedula Destinatario: " + escapeCSVValue(rs.getString("cedulaDestinatario")) + "\n");

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
        setNombreArchivo("Reporte-Remesas");
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

            PreparedStatement st = this.conexion.prepareStatement("SELECT * FROM envioremesa;");
            ResultSet rs = st.executeQuery();

            try (FileWriter escritor = new FileWriter(ArchivoDescargado)) {
                // Escribir los datos en el archivo de texto
                while (rs.next()) {
                    escritor.write("ID: " + rs.getInt("id_envio") + "\n");
                    escritor.write("Nombre Remitente: " + rs.getString("nombreRemitente") + "\n");
                    escritor.write("Apellido Remitente: " + rs.getString("apellidoRemitente") + "\n");
                    escritor.write("Cedula Remitente: " + rs.getString("cedulaRemitente") + "\n");
                    escritor.write("Monto: " + rs.getFloat("monto") + "\n");
                    escritor.write("Moneda: " + rs.getString("moneda") + "\n");
                    escritor.write("Nombre Destinatario: " + rs.getString("nombreDestinatario") + "\n");
                    escritor.write("Apellido Destinatario: " + rs.getString("apellidoDestinatario") + "\n");
                    escritor.write("Cedula Destinatario: " + rs.getString("cedulaDestinatario") + "\n\n");
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

    @Override
    public List<EnvioRemesa> validarTransacionLogeado(String cedula) throws Exception {
        List<EnvioRemesa> remesas = new ArrayList<>();

        try {
            this.realizarConexion();
            /*
            La clase PreparedStatement en Java se utiliza para representar una instrucción SQL precompilada.
            Proporciona una forma más segura y eficiente de ejecutar consultas SQL que contienen parámetros 
            variables.
            
             */
            PreparedStatement st = this.conexion.prepareStatement("SELECT e.*, r.descripcion FROM envioremesa AS e INNER JOIN remesastatus AS r ON e.EstatusID = r.numeroEstado WHERE e.cedulaRemitente = ?;");

            st.setString(1, cedula);
            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                EnvioRemesa bdremesa = new EnvioRemesa();

                bdremesa.setId_Envio(rs.getInt("id_envio"));
                bdremesa.setNombreRemitente(rs.getString("nombreRemitente"));
                bdremesa.setApellidoRemitente(rs.getString("apellidoRemitente"));
                bdremesa.setCedulaRemitente(rs.getString("cedulaRemitente"));
                bdremesa.setMonto(rs.getFloat("monto"));
                bdremesa.setMoneda(rs.getString("moneda"));
                bdremesa.setNombreDestinatario(rs.getString("nombreDestinatario"));
                bdremesa.setApellidoDestinatario(rs.getString("apellidoDestinatario"));
                bdremesa.setCedulaDestinatario(rs.getString("cedulaDestinatario"));
                bdremesa.setEstatusID(rs.getInt("EstatusID"));
                bdremesa.setEstatusDescripcion(rs.getString("descripcion"));

                remesas.add(bdremesa);
            }

            rs.close();
            st.close();
        } catch (SQLException e) {
            throw e;

        } finally {
            this.cerrarConexion();
        }
        return remesas;
    }

    @Override
    public void generarFacturaPDF() {
        setNombreArchivo("Factura-Remesa");
        setExtensionArchivo(".pdf");
        String rutaDescargas = System.getProperty("user.home") + "/Downloads/";

        String nombreCompletoArchivo = getNombreArchivo() + getExtensionArchivo();
        Document document = new Document();
        String dest = rutaDescargas + nombreCompletoArchivo;
        
            // Obtener la fecha y hora actual
        Date fechaHoraActual = new Date();

        // Crear un formato para la hora en HH:MM:SS
        SimpleDateFormat formatoHora = new SimpleDateFormat("HH:mm:ss");
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
        
        System.out.println(formatoFecha);
        
        // Formatear la fecha y hora actual en el formato deseado
        String horaFormateada = formatoHora.format(fechaHoraActual);
        String fechaFormateada = formatoFecha.format(fechaHoraActual);


        try {
            this.realizarConexion();

            PdfWriter.getInstance(document, new FileOutputStream(dest));
             
            String rutaLogo = "file:/C:/Users/Anderson/OneDrive/Documentos/NetBeansProjects/ProyectoFinalRemesa/src/main/resources/imgs/MonedaReporte64.png";
         
            document.open();
            //Prueba Logo
            Image logo = Image.getInstance(rutaLogo);
            

            // Configurar la posición y tamaño del logo
            logo.setAlignment(Image.MIDDLE);
            logo.scaleToFit(64, 64); // ajustar el tamaño

            // Agregar el logo al documento
            document.add(logo);
            
            // Agregar título de la factura
            com.itextpdf.text.Font titleFont = FontFactory.getFont(FontFactory.HELVETICA_BOLD, 24, BaseColor.BLACK);
            Paragraph title = new Paragraph("CASH FAST FACTURA", titleFont);
            title.setAlignment(Element.ALIGN_CENTER);
            document.add(title);

            // Consulta para obtener los datos de la factura
            String query = "SELECT e.*, r.descripcion FROM envioremesa AS e INNER JOIN remesastatus AS r ON e.EstatusID = r.numeroEstado ORDER BY id_envio DESC";
            try (PreparedStatement st = this.conexion.prepareStatement(query); ResultSet rs = st.executeQuery()) {

                // Agregar contenido de la factura
                if (rs.next()) {

                    Paragraph contenidoFactura = new Paragraph();

                    
    
                    contenidoFactura.add(new Chunk("\nID: ", FontFactory.getFont(FontFactory.HELVETICA_BOLD)));
                    contenidoFactura.add(new Chunk(rs.getInt("id_envio") + "\n", FontFactory.getFont(FontFactory.HELVETICA)));

                    
                    contenidoFactura.add("----------------------------------------------------------------------------------------------------------------------------------");
             
                    contenidoFactura.add(new Chunk("\n\nNombre Remitente: \n", FontFactory.getFont(FontFactory.HELVETICA_BOLD)));
                    contenidoFactura.add(new Chunk(rs.getString("nombreRemitente") + "\n\n", FontFactory.getFont(FontFactory.HELVETICA)));

                    contenidoFactura.add(new Chunk("Apellido Remitente: \n", FontFactory.getFont(FontFactory.HELVETICA_BOLD)));
                    contenidoFactura.add(new Chunk(rs.getString("apellidoRemitente") + "\n\n", FontFactory.getFont(FontFactory.HELVETICA)));

                    contenidoFactura.add(new Chunk("Cedula Remitente: \n", FontFactory.getFont(FontFactory.HELVETICA_BOLD)));
                    contenidoFactura.add(new Chunk(rs.getString("cedulaRemitente") + "\n\n", FontFactory.getFont(FontFactory.HELVETICA)));

                    contenidoFactura.add(new Chunk("Monto: \n", FontFactory.getFont(FontFactory.HELVETICA_BOLD)));
                    contenidoFactura.add(new Chunk(rs.getFloat("monto") + "\n\n", FontFactory.getFont(FontFactory.HELVETICA)));

                    contenidoFactura.add(new Chunk("Moneda: \n", FontFactory.getFont(FontFactory.HELVETICA_BOLD)));
                    contenidoFactura.add(new Chunk(rs.getString("moneda") + "\n\n", FontFactory.getFont(FontFactory.HELVETICA)));

                    contenidoFactura.add(new Chunk("Nombre Destinatario: \n", FontFactory.getFont(FontFactory.HELVETICA_BOLD)));
                    contenidoFactura.add(new Chunk(rs.getString("nombreDestinatario") + "\n\n", FontFactory.getFont(FontFactory.HELVETICA)));

                    contenidoFactura.add(new Chunk("Apellido Destinatario: \n", FontFactory.getFont(FontFactory.HELVETICA_BOLD)));
                    contenidoFactura.add(new Chunk(rs.getString("apellidoDestinatario") + "\n\n", FontFactory.getFont(FontFactory.HELVETICA)));

                    contenidoFactura.add(new Chunk("Cedula Destinatario: \n", FontFactory.getFont(FontFactory.HELVETICA_BOLD)));
                    contenidoFactura.add(new Chunk(rs.getString("cedulaDestinatario") + "\n\n", FontFactory.getFont(FontFactory.HELVETICA)));

                    contenidoFactura.add(new Chunk("Estatus Remesa: \n", FontFactory.getFont(FontFactory.HELVETICA_BOLD)));
                    contenidoFactura.add(new Chunk(rs.getString("descripcion") + "\n\n", FontFactory.getFont(FontFactory.HELVETICA)));

                    contenidoFactura.add(new Chunk("Fecha Transaccion: ", FontFactory.getFont(FontFactory.HELVETICA_BOLD)));
                    contenidoFactura.add(fechaFormateada + " - " + horaFormateada + "\n\n");

                    contenidoFactura.add("----------------------------------------------------------------------------------------------------------------------------------");

                 
                    
                    document.add(contenidoFactura);
                }

                System.out.println("PDF creado en: " + dest);

            } catch (SQLException | DocumentException e) {
                e.printStackTrace();
            }

        } catch (DocumentException | FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException ex) {
            Logger.getLogger(DAOEnvioRemesaImpl.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                // No cierres la conexión aquí
                document.close(); // Cierra el documento PDF
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }
}
