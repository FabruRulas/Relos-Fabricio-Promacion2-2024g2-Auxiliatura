import java.util.ArrayList;

public class Inventario {
	ArrayList<String> Lista;
	public Inventario() {
		Lista = new ArrayList<>();
	}
	
	public void agregarItem(String item) {
		Lista.add(item);
	}
	
	public void mostrarItem() {
		System.out.println(Lista);
	}	
}
