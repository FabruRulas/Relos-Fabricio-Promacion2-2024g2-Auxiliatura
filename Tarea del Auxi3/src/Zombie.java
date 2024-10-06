public class Zombie extends Enemigo{

	public Zombie(String nombre, Integer puntosdeVida, Integer danobase) {
		super(nombre, puntosdeVida, danobase);
	}
	
	public Integer atacar() {
		PuntosdeVida = PuntosdeVida + 5;
		return Danobase;		
	}

}
