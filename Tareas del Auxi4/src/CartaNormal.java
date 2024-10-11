public class CartaNormal extends Carta implements Joker {
	
	public CartaNormal(Integer Valor, String Palo) {
		super(Valor, Palo);
		// TODO Auto-generated constructor stub
	}

	public void jugar() {
		System.out.println("La Carta normal ha sido jugada");
	}
	public void joker() {
		System.out.println("JAJAJA");
	}
	
}
