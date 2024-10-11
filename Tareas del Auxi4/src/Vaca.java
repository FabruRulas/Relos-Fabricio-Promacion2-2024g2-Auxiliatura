public class Vaca extends Animal implements Productor,Morir{

	public Vaca(String nombre, Integer edad) {
		super(nombre, edad);
		// TODO Auto-generated constructor stub
	}
	public void hacerSonido() {
		System.out.println(Nombre +"hace Muuuuuuuuuuu");
	}
	public void producir() {
		System.out.println("Lunes de lechita");
	}
	public void muerte() {
		System.out.println(Nombre+" Murio");
	}
}
