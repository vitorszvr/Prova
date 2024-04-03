import java.util.Scanner;

public class Prova_02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Quantas pessoas serão cadastradas?");
        int N = sc.nextInt();

        String[] nomes = new String[N];
        int[] idades = new int[N];
        int count = 0;

        while (count < N) {
            System.out.println("Nome:");
            nomes[count] = sc.next();
            System.out.println("Idade:");
            idades[count] = sc.nextInt();
            count++;
        }


        System.out.println("Qual o nome?");
        String nomeBusca = sc.next();
        boolean encontrou = false;
        for (int i = 0; i < count; i++) {
            if (nomes[i].equalsIgnoreCase(nomeBusca)) {
                if (idades[i] >= 5 && idades[i] < 8) {
                    System.out.println("Categoria Infantil A");
                } else if (idades[i] >= 8 && idades[i] < 11) {
                    System.out.println("Categoria Infantil B");
                } else if (idades[i] >= 11 && idades[i] < 17) {
                    System.out.println("Categoria Juvenil");
                } else if (idades[i] < 5) {
                    System.out.println("Menor que 5 anos, nenhuma categoria");
                } else System.out.println("Categoria Adulto");

                encontrou = true;
            }
        }
        if (!encontrou) System.out.println("Nome não encontrado");


        sc.close();
    }
}
