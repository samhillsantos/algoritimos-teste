import java.util.Scanner;

public class MenuFunction {
    public static final Scanner input = new Scanner(System.in);

    public static void menuPrincipal() {
        int escolha = 0;
        do {
            System.out.println("\n+++ MENU +++");
            System.out.println("Escolha uma opção: ");
            System.out.println("1 - Vetores");
            System.out.println("2 - Matrizes");
            System.out.println("0 - Sair");
            escolha = input.nextInt();
            switch (escolha) {
                case 0:
                    System.out.println("Saindo...");
                    break;
                case 1:
                    menuVetor();
                    break;
                case 2:
                    menuMatrizes();
                    break;
                default:
                    break;
            }
        } while (escolha != 0);
    }

    public static void menuVetor() {
        int escolha = 0;
        int[] vetor = new int[0];
        do {
            System.out.println("\n++++++ VETORES ++++++");
            System.out.println("1 - Digitar");
            System.out.println("2 - Dados Aleatorios");
            System.out.println("0 - Sair");
            escolha = input.nextInt();
            switch (escolha) {
                case 0:
                    System.out.println("Saindo...");
                    break;
                case 1:
                    vetor = InputFunction.criarVetor();
                    InputFunction.digitarDadosVetor(vetor);
                    operacoesVetor(vetor);
                    break;
                case 2:
                    vetor = InputFunction.criarVetor();
                    InputFunction.dadoAleatoriosVetor(vetor);
                    operacoesVetor(vetor);
                    break;
                default:
                    break;
            }
        } while (escolha != 0);
    }

    public static void menuMatrizes() {
        int escolha = 0;
        int[][] matriz = new int[0][0];
        do {
            System.out.println("\n+++ MATRIZES +++");
            System.out.println("1 - Digitar");
            System.out.println("2 - Dados aleatorios");
            System.out.println("0 - Sair");
            escolha = input.nextInt();
            switch (escolha) {
                case 0:
                    System.out.println("Saindo...");
                    break;
                case 1:
                    matriz = InputFunction.criarMatriz();
                    InputFunction.digitarDadosMatriz(matriz);
                    operacoesMatrizes(matriz);
                    break;
                case 2:
                    matriz = InputFunction.criarMatriz();
                    InputFunction.dadosAleatoriosMatriz(matriz);
                    operacoesMatrizes(matriz);
                    break;
                default:
                    break;
            }
        } while (escolha != 0);
    }

    public static void operacoesVetor(int[] v) {
        int escolha = 0;
        do {
            System.out.println("\n+++ OPERAÇÕES VETOR +++");
            System.out.println("1  - Somar vetor");
            System.out.println("2  - Média do vetor");
            System.out.println("3  - Menor valor");
            System.out.println("4  - Maior valor");
            System.out.println("5  - Contar pares");
            System.out.println("6  - Contar ocorrências");
            System.out.println("7  - Buscar valor");
            System.out.println("8  - Inverter vetor");
            System.out.println("9  - Filtrar pares");
            System.out.println("10 - Copiar vetor");
            System.out.println("11 - Verificar repetido");
            System.out.println("0  - Voltar");
            escolha = input.nextInt();
            switch (escolha) {
                case 0:
                    System.out.println("Voltando...");
                    break;
                case 1:
                    System.out.println("Soma: " + VetorFunction.somar(v));
                    break;
                case 2:
                    System.out.printf("Média: %.2f\n", VetorFunction.media(v));
                    break;
                case 3:
                    System.out.println("Menor: " + VetorFunction.menor(v));
                    break;
                case 4:
                    System.out.println("Maior: " + VetorFunction.maior(v));
                    break;
                case 5:
                    System.out.println("Pares: " + VetorFunction.contarPares(v));
                    break;
                case 6:
                    System.out.print("Valor: ");
                    int vc = input.nextInt();
                    System.out.println("Ocorrências: " + VetorFunction.contarOcorrencias(v, vc));
                    break;
                case 7:
                    System.out.print("Valor: ");
                    int vb = input.nextInt();
                    int idx = VetorFunction.buscaSequencial(v, vb);
                    System.out.println(idx == -1 ? "Não encontrado" : "Índice: " + idx);
                    break;
                case 8:
                    int[] inv = VetorFunction.copiar(v);
                    VetorFunction.inverter(inv);
                    System.out.print("Invertido: ");
                    for (int i = 0; i < inv.length; i++) System.out.print(inv[i] + " ");
                    System.out.println();
                    break;
                case 9:
                    int[] par = VetorFunction.filtrarPares(v);
                    System.out.print("Pares: ");
                    for (int i = 0; i < par.length; i++) System.out.print(par[i] + " ");
                    System.out.println();
                    break;
                case 10:
                    int[] cop = VetorFunction.copiar(v);
                    System.out.print("Cópia: ");
                    for (int i = 0; i < cop.length; i++) System.out.print(cop[i] + " ");
                    System.out.println();
                    break;
                case 11:
                    System.out.println(VetorFunction.temRepetido(v) ? "Sim" : "Não");
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        } while (escolha != 0);
    }

    public static void operacoesMatrizes(int[][] m) {
        int escolha = 0;
        do {
            System.out.println("\n+++ OPERAÇÕES MATRIZ +++");
            System.out.println("1 - Soma");
            System.out.println("0 - Voltar");
            escolha = input.nextInt();
            switch (escolha) {
                case 0:
                    System.out.println("Voltando...");
                    break;
                case 1:
                    System.out.println("Soma: " + MatrizFunction.soma(m));
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        } while (escolha != 0);
    }
}