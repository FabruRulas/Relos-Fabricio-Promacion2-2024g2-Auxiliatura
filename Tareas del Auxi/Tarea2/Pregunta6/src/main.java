import java.util.ArrayList;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> lista = new ArrayList();
		lista.add(1);
		lista.add(1);
		Scanner cin = new Scanner(System.in);
		int indice = cin.nextInt();
		for(int i=0; i<indice-1;i++)
			lista.add(lista.getLast()+lista.get(i));
		System.out.println(lista.getLast());
	}

}
