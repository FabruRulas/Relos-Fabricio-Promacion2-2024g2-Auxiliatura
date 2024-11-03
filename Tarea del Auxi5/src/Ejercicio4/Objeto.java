package Ejercicio4;

public class Objeto {
    String nombre;
    Integer peso;
    Inventario inventario = new Inventario();
    public Objeto(String nombre, Integer peso){
        this.nombre = nombre;
        this.peso =  peso;

        inventario.objetos.add(this);
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getPeso() {
        return peso;
    }
}
