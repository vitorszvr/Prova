import java.util.Scanner;

public class Prova_03_chat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // nao deu tempo de fazer!

        // Solicita o tamanho do vetor
        System.out.print("Informe o tamanho dos vetores: ");
        int tamanho = scanner.nextInt();

        // Criação dos vetores
        int[] vetorA = new int[tamanho];
        int[] vetorB = new int[tamanho];

        // Preenchimento do vetor A
        System.out.println("Preencha o vetor A:");
        preencherVetor(vetorA, scanner);

        // Preenchimento do vetor B
        System.out.println("Preencha o vetor B:");
        preencherVetor(vetorB, scanner);

        // Realização das operações aritméticas e exibição dos resultados
        for (int i = 0; i < tamanho; i++) {
            System.out.println("Elemento " + (i + 1) + ":");
            System.out.println("Soma: " + (vetorA[i] + vetorB[i]));
            System.out.println("Subtração: " + (vetorA[i] - vetorB[i]));
            System.out.println("Multiplicação: " + (vetorA[i] * vetorB[i]));
            if (vetorB[i] != 0) {
                System.out.println("Divisão: " + ((double) vetorA[i] / vetorB[i]));
            } else {
                System.out.println("Divisão: Não é possível dividir por zero.");
            }
            System.out.println();
        }
    }

    // Método para preencher um vetor com valores digitados pelo usuário
    private static void preencherVetor(int[] vetor, Scanner scanner) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite o valor do elemento " + (i + 1) + ": ");
            vetor[i] = scanner.nextInt();
        }
    }
}
