import java.util.ArrayList;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner (System.in);
		String fecha = scanner.nextLine();
		String fechasCortadas[];
		String meses[] = {" ","enero,","febrero,","marzo,","abril,","mayo,","junio,","julio,",
				"agosto,","septiembre,","octubre,","noviembre,","diciembre,"};
		fechasCortadas = fecha.split(" ");
		int mes = 0;
		for(int i=0; i<meses.length; i++) {
			if(meses[i].equals(fechasCortadas[2])) {
				mes = i;
			}
		}

		if(mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
			if(Integer.valueOf(fechasCortadas[0])<=31) {
				if(mes<10)
					System.out.println(fechasCortadas[0]+"/0"+mes+"/"+fechasCortadas[3]);
				else
					System.out.println(fechasCortadas[0]+"/"+mes+"/"+fechasCortadas[3]);
			}
		}
		
		if(mes== 4 || mes == 6 || mes == 9 || mes == 11) {
			if(Integer.valueOf(fechasCortadas[0])<=30) {
				if(mes<10)
					System.out.println(fechasCortadas[0]+"/0"+mes+"/"+fechasCortadas[3]);
				else
					System.out.println(fechasCortadas[0]+"/"+mes+"/"+fechasCortadas[3]);
			}
		}
		
		if(mes == 2) {
			if(Integer.valueOf(fechasCortadas[0])<=29) {
				System.out.println(fechasCortadas[0]+"/0"+mes+"/"+fechasCortadas[3]);
			}
		}
	}

}
