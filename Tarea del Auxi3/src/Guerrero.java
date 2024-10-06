public class Guerrero extends Personaje {
	Integer Fuerza;

	public Guerrero(String nombre, Integer nivel, Integer puntosdeVida,Integer Fuerza) {
		super(nombre, nivel, puntosdeVida);
		this.Fuerza = Fuerza;
		// TODO Auto-generated constructor stub
	}

	public void atacar() {
		System.out.println("A atacado");
	}
	public void Hablar() {
		System.out.println("Hola hijitas");
	}
}
