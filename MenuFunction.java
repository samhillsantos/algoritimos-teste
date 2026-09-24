import java.util.Scanner;
import java.util.Random;

public class MenuFunction {
    public static final Scanner input = new Scanner(System.in);
    public static final Random rand = new Random();
    public static final int TAM = 6;

    public static void menu(int[] v){
        int escolha = 0;
        do {
            System.out.println("\n+++ MENU +++");
            System.out.println("Escolha uma opção:");
            escolha = input.nextInt();
            switch (escolha) {
                case 0:
                    System.out.print("Saindo...");
                    break;
                case 1:
                    digitarDados(v);
                    operacoes(v);
                    break;
                case 2:
                    dadoAleatorios(v);
                    operacoes(v);
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
            escolha = input.nextInt();
            switch (escolha) {
                case 0:
                    System.out.println("Voltando...");
                    break;
                case 1:
                    System.out.println("\nSoma do vetor: " + VetorFunction.somar(v));
                    System.out.println(" ");
                    break;
            
                default:
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
        for(int i = 0; i < v.length; i+=1){
            System.out.print(v[i] + " ");
        }
        System.out.println(" ");
    }
    public static void dadoAleatorios(int[] v){
        System.out.println("\n+++ Dados aleatorios +++");
        for(int i = 0; i < v.length; i+=1){
            v[i] = rand.nextInt(TAM);
        }
        System.out.println("Valores aleatorios: ");
        for(int i = 0; i < v.length; i++){
            System.out.print(v[i] + " ");
        }
        System.out.println(" ");
    }

    /* +++ DEBUG +++ */
    public static void main(String[] args){
        int[] vetor = new int[TAM];
        menu(vetor);
    }
}
