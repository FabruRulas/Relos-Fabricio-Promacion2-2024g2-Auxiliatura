public class Moto extends Vehiculo implements Turbo,Gasolina{
	
	public Moto(String marca, String modelo, Integer velocidadMaxima) {
		super(marca, modelo, velocidadMaxima);
		// TODO Auto-generated constructor stub
	}
	public void acelerar() {
		System.out.println("La Moto esta Acelerando");
	}
	public void activarTurbo() {
		System.out.println(Marca+" "+ Modelo+" "+ VelocidadMaxima+" "+"Turbo activado");
	}
	public void gasolina() {
		System.out.println("Metele Gasolina");
	}
}
