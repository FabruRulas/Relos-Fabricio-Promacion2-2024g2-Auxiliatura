public class Vampiro extends Enemigo {

	public Vampiro(String nombre, Integer puntosdeVida, Integer danobase) {
		super(nombre, puntosdeVida, danobase);
	}
	public Integer atacar() {
		PuntosdeVida = PuntosdeVida + (Danobase/2);
		return Danobase;		
	}
}
