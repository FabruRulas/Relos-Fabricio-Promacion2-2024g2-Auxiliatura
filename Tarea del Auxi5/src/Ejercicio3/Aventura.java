package Ejercicio3;

import java.util.ArrayList;

public class Aventura {
    ArrayList<Tarea> listaDeAventuras;
    public Aventura(){
        listaDeAventuras = new ArrayList<>();
    }

    public void agregarTarea(Tarea tarea){
        listaDeAventuras.add(tarea);
    }

    public void iniciar(){
        for (Tarea tarea : listaDeAventuras) {
            tarea.ejecutar();
        }
    }
}
