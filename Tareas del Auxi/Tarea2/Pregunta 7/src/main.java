import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] lista = new int[N];
        for (int i = 0; i < N; i++) {
            lista[i] = scanner.nextInt();
        }

        for (int bit = 31; bit >= 0; bit--) {
            for (int i = 0; i < N; i++) {
                for (int j = i + 1; j < N; j++) {
                    if (((lista[i] >> bit) & 1) < ((lista[j] >> bit) & 1)) {
                        int temp = lista[i];
                        lista[i] = lista[j];
                        lista[j] = temp;
                    }
                }
            }
        }

        for (int i = 0; i < N; i++) {
            System.out.print(lista[i] + " ");
        }
    }
}
