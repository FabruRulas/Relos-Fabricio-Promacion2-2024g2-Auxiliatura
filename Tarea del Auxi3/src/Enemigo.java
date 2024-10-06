public class Enemigo {
	String Nombre;
	Integer PuntosdeVida;
	Integer Danobase;
	
	public Enemigo(String nombre, Integer puntosdeVida, Integer danobase) {
		Nombre = nombre;
		PuntosdeVida = puntosdeVida;
		Danobase = danobase;
	}
	
	public Integer atacar() {
		return Danobase;		
	}
	
	public void recibirDano(Integer Dano) {
		PuntosdeVida = PuntosdeVida - Dano;
	}
	
	public boolean estaVivo() {
		if(PuntosdeVida>0) {
			return true;					
		}
		else {
			return false;
		}
	}
}
