public class Jefe extends Enemigo {
	double multiplicadordedano;

	public Jefe(String nombre, Integer puntosdeVida, Integer danobase, double multiplicadordedano) {
		super(nombre, puntosdeVida, danobase);
		this.multiplicadordedano = multiplicadordedano;
	}
	
	public void hablar(){
		System.out.println("Me voy a comer  sus cerebros");
	}
	
	public Integer ataqueCritico() {
		return (int) (Danobase*multiplicadordedano);
		
	}
	
}
