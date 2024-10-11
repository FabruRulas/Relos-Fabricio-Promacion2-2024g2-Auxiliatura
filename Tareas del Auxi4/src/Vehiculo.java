public abstract class Vehiculo{
	String Marca;
	String Modelo;
	Integer VelocidadMaxima;
	public Vehiculo(String marca, String modelo, Integer velocidadMaxima) {
		Marca = marca;
		Modelo = modelo;
		VelocidadMaxima = velocidadMaxima;
	}
	public abstract void acelerar();
	public void mostrarInfo() {
		System.out.println(Marca +" " + Modelo + " " +VelocidadMaxima);
	}
	
}
