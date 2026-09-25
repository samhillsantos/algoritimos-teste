import java.util.Scanner;
import java.util.Random;

public class InputFunction {
    public static final Scanner input = new Scanner(System.in);
    public static final Random rand = new Random();

    public static int[] criarVetor() {
        System.out.print("\nTamanho do vetor: ");
        return new int[input.nextInt()];
    }

    public static int[][] criarMatriz() {
        System.out.print("\nNúmero de linhas: ");
        int linhas = input.nextInt();
        System.out.print("Número de colunas: ");
        int colunas = input.nextInt();
        return new int[linhas][colunas];
    }

    public static void digitarDadosVetor(int[] v) {
        System.out.println("\n+++ Digitar vetor +++");
        for (int i = 0; i < v.length; i++) {
            System.out.printf("Digite o %dº valor: ", i + 1);
            v[i] = input.nextInt();
        }
        imprimirVetor(v);
    }

    public static void digitarDadosMatriz(int[][] m) {
        System.out.println("\n+++ Digitar matriz +++");
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                System.out.printf("Linha %d, Coluna %d: ", i + 1, j + 1);
                m[i][j] = input.nextInt();
            }
        }
        imprimirMatriz(m);
    }

    public static void dadoAleatoriosVetor(int[] v) {
        for (int i = 0; i < v.length; i++) v[i] = rand.nextInt(v.length);
        System.out.println("\n+++ Vetor aleatório +++");
        imprimirVetor(v);
    }

    public static void dadosAleatoriosMatriz(int[][] m) {
        for (int i = 0; i < m.length; i++)
            for (int j = 0; j < m[0].length; j++)
                m[i][j] = rand.nextInt(20);
        System.out.println("\n+++ Matriz aleatória +++");
        imprimirMatriz(m);
    }

    public static void imprimirVetor(int[] v) {
        for (int i = 0; i < v.length; i++) System.out.print(v[i] + " ");
        System.out.println();
    }

    public static void imprimirMatriz(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) System.out.print(m[i][j] + " ");
            System.out.println();
        }
    }
}