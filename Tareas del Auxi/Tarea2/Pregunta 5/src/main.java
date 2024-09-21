import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tamanio = scanner.nextInt();
        int min = scanner.nextInt();
        int pos = 0;
        int var;
        for(int i=0;i<tamanio;i++){
            for(int j=0;j<tamanio;j++){
                if(i==0 && j ==0){
                    continue;
                }
                var = scanner.nextInt();
                if(i == 0 && j == tamanio-1){
                    if(var<min){
                        min = var;
                        pos = 1;
                    }
                }

                if(i==tamanio-1 && j==0){
                    if(var<min){
                        min = var;
                        pos = 3;
                    }
                }

                if(i==tamanio-1 && j==tamanio-1){
                    if(var<min){
                        min = var;
                        pos = 2;
                    }
                }
            }
        }
        System.out.println(pos);
    }
}