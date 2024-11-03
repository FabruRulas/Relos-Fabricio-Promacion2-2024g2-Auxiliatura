package Ejercicio1;

import java.util.ArrayList;

public class Evento {
    String nombre;
    ArrayList<EventoNotificacion> eventosGuardados;

    public Evento(String nombre){
        this.nombre = nombre;
        eventosGuardados = new ArrayList<>();
    }
    public void registrarNotificacion(EventoNotificacion notificacion){
        eventosGuardados.add(notificacion);
    }

    public void activar(){
        for(EventoNotificacion notificacion : eventosGuardados){
            notificacion.notificar(nombre);
    }
    }
}

