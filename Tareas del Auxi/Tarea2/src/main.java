import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String Texto = scanner.nextLine();
		String guardar[];
		guardar= Texto.split(" ");
		System.out.println(guardar[1]);
				
	}

}
