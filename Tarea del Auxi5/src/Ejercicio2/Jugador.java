package Ejercicio2;

public class Jugador {
    String nombre;
    Integer puntos;

    public Jugador(String nombre, Integer puntos){
        this.nombre = nombre;
        this.puntos = puntos;
    }

    public void aplicarBonificacion(CalculadoraBonificacion calculadora){
        puntos = puntos + calculadora.calcular(puntos);
    }

    public Integer getPuntos() {
        return puntos;
    }
}
