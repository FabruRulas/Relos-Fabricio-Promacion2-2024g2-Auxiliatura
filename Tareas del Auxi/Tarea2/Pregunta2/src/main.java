import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("QUE LETRA QUIERE BUSCAR");
		Character texto = scanner.next().charAt(0);
		scanner.nextLine();
		String Texto = scanner.nextLine();
		String guardar[];
		int contador = 0;
		guardar= Texto.split(",");  //pepe, maria,merequetengue 
		for(int i=0; i< guardar.length;i++) {
			if(texto == guardar[i].charAt(0))
				contador = contador + 1;
		}
		
		System.out.println("Su letra es " + texto + " y se repitio "+contador+" veces");
	}

}
