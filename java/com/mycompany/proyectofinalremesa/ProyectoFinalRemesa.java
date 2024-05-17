package com.mycompany.proyectofinalremesa;

import com.mycompany.proyectofinalremesa.GUI.WindowLoginUser;
import com.mycompany.proyectofinalremesa.conexionBD.ProcesoCalendarizado;
import java.util.Timer;
import java.util.TimerTask;

public class ProyectoFinalRemesa {

    public static void main(String[] args) {
        ProcesoCalendarizado proceso = new ProcesoCalendarizado();
        Timer timer = new Timer();

      
        // Crear una tarea que se ejecutará cada 2 minutos
        TimerTask task = new TimerTask() {
            
            @Override
            public void run() {
                proceso.actualizacionProgramada();
            }
        };

        // scheduleAtFixedRate(tarea,retraso(delay),periodo)
        // En milisegundos es igual = (2 * 60 * 1000 ms = 2 minutos).
        // TIempo inicial 6 minutos y luego intervalos de 5 minutos
        timer.scheduleAtFixedRate(task, 4 * 60 * 1000, 2 * 60 * 1000);

        //Mostrar la ventana de LoginUser
        WindowLoginUser lg = new WindowLoginUser();

        lg.setVisible(true);

        // Ubicacion del Jframe Null -> En el centro
        lg.setLocationRelativeTo(null);
    }
}
