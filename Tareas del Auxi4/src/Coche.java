public class Coche extends Vehiculo implements Gasolina  {

	public Coche(String marca, String modelo, Integer velocidadMaxima) {
		super(marca, modelo, velocidadMaxima);
		// TODO Auto-generated constructor stub
	}
	public void acelerar() {
		System.out.println("El coche esta acelerando");
	}
	public void gasolina() {
		System.out.println("Gasolina papa");
	}
}
