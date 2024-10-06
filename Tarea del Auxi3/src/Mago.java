public class Mago extends Personaje {
	Integer mana;
		
	public Mago(String nombre, Integer nivel, Integer puntosdeVida, Integer mana) {
		super(nombre, nivel, puntosdeVida);
		this.mana = mana;
	}

	public void lanzarHechizo() {
		System.out.println("A lanzado un Hechizo");
	
	}
	
	public void Hablar() {
		System.out.println("Hola criaturitas");
	}
}
	
