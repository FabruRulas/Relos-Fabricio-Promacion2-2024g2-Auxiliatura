package Ejercicio4;

import java.util.ArrayList;

public class Inventario {
    ArrayList<Objeto> objetos = new ArrayList<>();
    public Inventario(){

    }

    public ArrayList<Objeto> filtrarObjetos(FiltroObjeto filtro) {
        ArrayList<Objeto> objetosFiltrados = new ArrayList<>();
        for (Objeto objeto : objetos) {
            if (filtro.filtrar(objeto)) {
                objetosFiltrados.add(objeto);
            }
        }
        return objetosFiltrados;
    }
}
