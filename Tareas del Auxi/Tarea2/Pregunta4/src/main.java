import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner (System.in);
		Integer A = scanner.nextInt();
		Integer B = scanner.nextInt();
		Integer C = (B-(A-1))/A;
		System.out.println(C);
	}

}
