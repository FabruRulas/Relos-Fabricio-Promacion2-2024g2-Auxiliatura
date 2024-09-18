import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String Texto = scanner.nextLine();
		String guardar[];
		
		guardar= Texto.split(" ");
		
		
		switch(guardar[2]) {
			case "enero,":
				if(31 >= Integer.parseInt(guardar[0])) {
					guardar[2] = "01";
					System.out.println(guardar[0]+"/"+guardar[2]+"/"+guardar[3]);
				}
			break;
			case "febrero,":
				if(29 >= Integer.parseInt(guardar[0])) {
					guardar[2] = "02";
					System.out.println(guardar[0]+"/"+guardar[2]+"/"+guardar[3]);
				}
			break;
			case "marzo,":
				if(31 >= Integer.parseInt(guardar[0])) {
					guardar[2] = "03";
					System.out.println(guardar[0]+"/"+guardar[2]+"/"+guardar[3]);
				}
			break;
			case "abril,":
				if(30 >= Integer.parseInt(guardar[0])) {
					guardar[2] = "04";
					System.out.println(guardar[0]+"/"+guardar[2]+"/"+guardar[3]);
				}
			break;
			case "mayo,":
				if(31 >= Integer.parseInt(guardar[0])) {
					guardar[2] = "05";
					System.out.println(guardar[0]+"/"+guardar[2]+"/"+guardar[3]);
				}
			break;
			case "junio,":
				if(30 >= Integer.parseInt(guardar[0])) {
					guardar[2] = "06";
					System.out.println(guardar[0]+"/"+guardar[2]+"/"+guardar[3]);
				}
			break;
			case "julio,":
				if(31 >= Integer.parseInt(guardar[0])) {
					guardar[2] = "07";
					System.out.println(guardar[0]+"/"+guardar[2]+"/"+guardar[3]);
				}
			break;
			case "agosto,":
				if(31 >= Integer.parseInt(guardar[0])) {
					guardar[2] = "08";
					System.out.println(guardar[0]+"/"+guardar[2]+"/"+guardar[3]);
				}
			break;
			case "septiembre,":
				if(30 >= Integer.parseInt(guardar[0])) {
					guardar[2] = "09";
					System.out.println(guardar[0]+"/"+guardar[2]+"/"+guardar[3]);
				}
			break;
			case "octubre,":
				if(31 >= Integer.parseInt(guardar[0])) {
					guardar[2] = "10";
					System.out.println(guardar[0]+"/"+guardar[2]+"/"+guardar[3]);
				}
			break;
			case "noviembre,":
				if(30 >= Integer.parseInt(guardar[0])) {
					guardar[2] = "11";
					System.out.println(guardar[0]+"/"+guardar[2]+"/"+guardar[3]);
				}
			break;
			case "diciembre,":
				if(31 >= Integer.parseInt(guardar[0])) {
					guardar[2] = "12";
					System.out.println(guardar[0]+"/"+guardar[2]+"/"+guardar[3]);
				}
			break;
			default:
				System.out.println("ERROR ERROR ERROR");
			break;
		}
				

	}

}
