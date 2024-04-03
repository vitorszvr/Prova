import java.util.Scanner;

public class Prova_01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] meses = {"Jan", "Fev", "Mar", "Abr", "Mai", "Jun", "Jul", "Ago", "Set", "Out", "Nov", "Dez"};
        int[] acidentes = new int[12];

        for (int i = 0; i < 12; i++) {
            System.out.println("Quantidade de acidentes em " + meses[i]);
            acidentes[i] = sc.nextInt();
        }

        int maisAcidentes = acidentes[0];
        String mesMaisAcidentes = meses[0];
        for (int i = 1; i < 12; i++) {
            if (acidentes[i] > maisAcidentes) {
                maisAcidentes = acidentes[i];
                mesMaisAcidentes = meses[i];
            }
        }

        int menosAcidentes = acidentes[0];
        String mesMenosAcidentes = meses[0];
        for (int i = 1; i < 12; i++) {
            if (acidentes[i] < menosAcidentes) {
                menosAcidentes = acidentes[i];
                mesMenosAcidentes = meses[i];
            }
        }

        int total = 0;
        for (int i = 0; i < 12; i++) {
            total += acidentes[i];
        }

        double percentual = (double) acidentes[1] / total * 100;

        System.out.print("Mes com mais acidentes: ");
        System.out.println(mesMaisAcidentes);
        System.out.print("Mes com menos acidentes: ");
        System.out.println(mesMenosAcidentes);
        System.out.print("Total de acidentes: ");
        System.out.println(total);
        System.out.print("Percentual de acidentes no mês de fevereiro: ");
        System.out.println(percentual + "%");

        sc.close();
    }
}
