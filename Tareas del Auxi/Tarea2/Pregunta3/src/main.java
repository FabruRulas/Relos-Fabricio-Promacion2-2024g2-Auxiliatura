import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated methodstub
		MatarEnemigos matarEnemigos = new MatarEnemigos();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Quieres Matar un enemigo");
		String siONo = scanner.next();
		while(siONo.equals("Si")) {
			matarEnemigos.generarBotin();
			matarEnemigos.mostrarBotin();
			System.out.println("Quieres seguir jugando criaturita ?");
			siONo = scanner.next();
		}
		matarEnemigos.AcabarJuego();
		
	}

}
