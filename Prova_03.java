import java.util.Scanner;

public class Prova_03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("Quantos numeros serão cadastradas no vetor A?");
        int numA = sc.nextInt();
        int[] vetA = new int[numA];
        int count = 0;

        while (count < numA) {
            System.out.println("numero " + (count + 1));
            vetA[count] = sc.nextInt();
            count++;
        }

        System.out.println("Quantos numeros serão cadastradas no vetor B?");
        int numB = sc.nextInt();
        int[] vetB = new int[numB];
        int count2 =0;

        while (count2 < numB) {
            System.out.println("numero" + (count2 + 1));
            vetB[count2] = sc.nextInt();
            count2++;
        }



        sc.nextInt();
    }
}
