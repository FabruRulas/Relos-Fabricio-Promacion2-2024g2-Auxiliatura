public class Arquero extends Personaje {
	Integer Destreza;
	
	public Arquero(String nombre, Integer nivel, Integer puntosdeVida, Integer destreza) {
		super(nombre, nivel, puntosdeVida);
		Destreza = destreza;
	}

	public void LanzarFlecha() {
		System.out.println("A disparado una flecha");
	}
		
	public void Hablar() {
		System.out.println("Dele murillo ganamos con bendicion");
	}
}
