import java.util.Scanner;

public class main {
    static int cadenaBinaria[] = new int[30];

    static int potencia(int b, int e){
        int r = 1;
        while (e>0){
            if(e%2 == 1){
                r = r*b;
            }
            b = b*b;
            e/=2;
        }
        return r;
    }

    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int rep = x.nextInt();
        int bin;
        for(int i=0;i<rep;i++){
            bin = x.nextInt();
            String elBinario = Integer.toBinaryString(bin);
            String invBin = new StringBuilder(elBinario).reverse().toString();
            for(int j=0; j<invBin.length();j++){
                if (invBin.charAt(j) == '1'){
                    cadenaBinaria[j]++;
                }
            }
        }

        for(int i=0;i<rep;i++){
            int cont = 0;
            for(int j=0;j<cadenaBinaria.length;j++){
                if(cadenaBinaria[j]>0){
                    cadenaBinaria[j]--;
                    cont = cont + potencia(2,j);
                }
            }
            System.out.println(cont);
        }

    }

}