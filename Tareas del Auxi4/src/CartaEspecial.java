public class CartaEspecial extends Carta implements Accionable,Joker{
	
	public CartaEspecial(Integer Valor, String Palo) {
		super(Valor, Palo);
		// TODO Auto-generated constructor stub
	}
	public void jugar() {
		System.out.println("La Carta especial ha sido jugada");
	}
	public void realizarAccion() {
		System.out.println("Accion especial de la carta");
	}
	public void joker() {
		System.out.println("Cagaste");
	}
}
