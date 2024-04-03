import java.util.Scanner;

public class Prova_04 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String menu = "1 - Cadastrar pessoa\n" +
                "2 - Buscar por nome\n" +
                "3 - Buscar por cpf\n" +
                "4 - Sair";

        int op;
        int N = 100;
        String[] cpfs = new String[N];
        String[] nomes = new String[N];
        int count = 0;

        do {
            System.out.println(menu);
            op = sc.nextInt();

            if (op == 1) {
                if (count < N) {
                    System.out.println("Nome:");
                    nomes[count] = sc.next();
                    System.out.println("Cpf:");
                    cpfs[count] = sc.next();
                    count++;
                } else System.out.println("Memória Cheia");
            }
            if (op == 2) {
                System.out.println("Qual o nome?");
                String nomeBusca = sc.next();
                boolean encontrou = false;
                for (int i = 0; i < count; i++) {
                    if (nomes[i].equalsIgnoreCase(nomeBusca)) {
                        System.out.println("Nome: " + nomes[i] + ", CPF: " + cpfs[i]);
                        encontrou = true;
                    }
                }
                if (!encontrou) System.out.println("Nome não encontrado");
            }
            if (op == 3) {
                System.out.println("Qual o cpf?");
                String cpfBusca = sc.next();
                boolean encontrou = false;
                for (int i = 0; i < count; i++) {
                    if (cpfs[i].equals(cpfBusca)) {
                        System.out.println("Nome: " + nomes[i] + ", CPF: " + cpfs[i]);
                        encontrou = true;
                    }
                }
                if (!encontrou) System.out.println("Cpf não encontrado");
            }

        } while (op != 4);


        sc.close();
    }
}
