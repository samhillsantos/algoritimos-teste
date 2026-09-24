import java.util.Scanner;
import java.util.Random;

public class MenuFunction {
    public static final Scanner input = new Scanner(System.in);
    public static final Random rand = new Random();

    public static int[] criarVeotor(){
        int[] vetor = new int[0];
        System.out.println("\nDiga o tamanho do vetor: ");
        return new int[input.nextInt()];
    }
    public static void menu(){
        int escolha = 0;
        int[] vetor = new int[0];
        do {
            System.out.println("\n++++++ MENU ++++++");
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Digitar dados");
            System.out.println("2 - Dados aleatorios");
            System.out.println("0 - Sair");

            escolha = input.nextInt();
            switch (escolha) {
                case 0:
                    System.out.print("\nSaindo...");
                    break;
                case 1:
                    vetor = criarVeotor();
                    digitarDados(vetor);
                    operacoes(vetor);
                    break;
                case 2:
                    vetor = criarVeotor();
                    dadoAleatorios(vetor);
                    operacoes(vetor);
                    break;
                default:
                    break;
            }
        } while (escolha != 0);
        System.out.println(" ");
    }
    public static void operacoes(int[] v){
        int escolha = 0;
        do{
            System.out.println("\n+++ OPERAÇÕES +++");
            System.out.println("Escolha uma operação:");
            System.out.println("1  - Somar vetor");
            System.out.println("2  - Média do vetor");
            System.out.println("3  - Menor valor");
            System.out.println("4  - Maior valor");
            System.out.println("5  - Contar pares");
            System.out.println("6  - Contar ocorrências de um valor");
            System.out.println("7  - Buscar valor (retorna índice)");
            System.out.println("8  - Inverter vetor");
            System.out.println("9  - Filtrar pares");
            System.out.println("10 - Copiar vetor");
            System.out.println("11 - Verificar se tem repetido");
            System.out.println("0  - Voltar para menu");
        
            escolha = input.nextInt();
            switch (escolha) {
                case 0:
                    System.out.println("\nVoltando...");
                    break;
                case 1:
                    System.out.println("\n++++++ SOMA ++++++");
                    System.out.println("Soma do vetor: " + VetorFunction.somar(v));
                    break;
                case 2:
                    System.out.println("\n++++++ MÉDIA ++++++");
                    System.out.println("Média do vetor: " + VetorFunction.media(v));
                    break;
                case 3:
                    System.out.println("\n++++++ MENOR ++++++");
                    System.out.println("Menor valor: " + VetorFunction.menor(v));
                    break;
                case 4:
                    System.out.println("\n++++++ MAIOR ++++++");
                    System.out.println("Maior valor: " + VetorFunction.maior(v));
                    break;
                case 5:
                    System.out.println("\n++++++ CONTAR PARES ++++++");
                    System.out.println("Quantidade de pares: " + VetorFunction.contarPares(v));
                    break;
                case 6:
                    System.out.println("\n++++++ CONTAR OCORRÊNCIAS ++++++");
                    System.out.print("Valor a contar: ");
                    int valorContar = input.nextInt();
                    System.out.println("Ocorrências: " + VetorFunction.contarOcorrencias(v, valorContar));
                    break;
                case 7:
                    System.out.println("\n++++++ BUSCA ++++++");
                    System.out.print("Valor a buscar: ");
                    int valorBuscar = input.nextInt();
                    int indice = VetorFunction.buscaSequencial(v, valorBuscar);
                    if (indice == -1) {
                        System.out.println("Valor não encontrado.");
                    } else {
                        System.out.println("Encontrado no índice: " + indice);
                    }
                    break;
                case 8:
                    System.out.println("\n++++++ INVERTER ++++++");
                    int[] invertido = VetorFunction.copiar(v);
                    VetorFunction.inverter(invertido);
                    System.out.print("Vetor invertido: ");
                    for (int i = 0; i < invertido.length; i++) {
                        System.out.print(invertido[i] + " ");
                    }
                    System.out.println();
                    break;
                case 9:
                    System.out.println("\n++++++ FILTRAR PARES ++++++");
                    int[] pares = VetorFunction.filtrarPares(v);
                    System.out.print("Pares: ");
                    for (int i = 0; i < pares.length; i++) {
                        System.out.print(pares[i] + " ");
                    }
                    System.out.println();
                    break;
                case 10:
                    System.out.println("\n++++++ COPIAR ++++++");
                    int[] copia = VetorFunction.copiar(v);
                    System.out.print("Cópia: ");
                    for (int i = 0; i < copia.length; i++) {
                        System.out.print(copia[i] + " ");
                    }
                    System.out.println();
                    break;
                case 11:
                    System.out.println("\n++++++ REPETIDOS ++++++");
                    if (VetorFunction.temRepetido(v)) {
                        System.out.println("Sim, tem repetido.");
                    } else {
                        System.out.println("Não tem repetido.");
                    }
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        } while (escolha != 0);
    }
    public static void digitarDados(int[] v){
        System.out.println("\n+++ Digitar dados +++");
        for(int i = 0; i < v.length; i+=1){
            System.out.printf("Digite o %dº valor: ", i+1);
            v[i] = input.nextInt();
        }
        System.out.println("\nVetor:");
        for(int i = 0; i < v.length; i+=1){
            System.out.print(v[i] + " ");
        }
        System.out.println(" ");
    }
    public static void dadoAleatorios(int[] v){
        System.out.println("\n+++ Dados aleatorios +++");
        for(int i = 0; i < v.length; i+=1){
            v[i] = rand.nextInt(v.length);
        }
        System.out.println("\nValores aleatorios: ");
        for(int i = 0; i < v.length; i++){
            System.out.print(v[i] + " ");
        }
        System.out.println(" ");
    }

    /* +++ DEBUG +++ */
    public static void main(String[] args){
        menu();
    }
}
