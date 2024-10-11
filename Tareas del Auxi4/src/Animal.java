public abstract class Animal {
	String Nombre;
	Integer Edad;
	public Animal(String nombre, Integer edad) {
		Nombre = nombre;
		Edad = edad;
	}
	public abstract void hacerSonido();
	public void  mostrarInfo() {
		System.out.println(Nombre + Edad);
	}
	
}
