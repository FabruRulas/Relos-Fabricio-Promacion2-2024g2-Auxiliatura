public class Personaje {
	private String Nombre;
	private Integer Nivel;
	private Integer PuntosdeVida;
	
	
	
	public Personaje(String nombre, Integer nivel, Integer puntosdeVida) {
		Nombre = nombre;
		Nivel = nivel;
		PuntosdeVida = puntosdeVida;
		Inventario inventario = new Inventario();
	}

	public String mostrarEstado() {
		return Nombre + " " + Nivel+ " " + PuntosdeVida;	
	}
	
	public void recibirDano(Integer Dano){
		PuntosdeVida = PuntosdeVida - Dano;
		
	}
	
	public void curar() {
		PuntosdeVida = PuntosdeVida + 20;
	}

	public Integer getPuntosdeVida() {
		return PuntosdeVida;
	}

	public String getNombre() {
		return Nombre;
	}

	public void Hablar() {
		System.out.println("");
	}
}
