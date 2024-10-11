public class Oveja extends Animal implements Productor,Morir{
	public Oveja(String nombre, Integer edad) {
		super(nombre, edad);
		// TODO Auto-generated constructor stub
	}
	public void hacerSonido() {
		System.out.println(Nombre +"hace Bueeeeeeeeee");
	}
	public void producir() {
		System.out.println("Depilando BUEEEE");
	}
	public void muerte() {
		System.out.println("Murio pessi");
	}
}
