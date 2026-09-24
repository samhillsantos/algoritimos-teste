public class VetorFunction {
    public static int somar(int[] v){
        int soma = 0;
        for(int i = 0; i < v.length; i+=1){
            soma += v[i];
        }
        return soma;
    }
    public static double media(int[] v){
        int soma = 0;
        for(int i = 0; i < v.length; i++){
            soma += v[i];
        }
        return soma / v.length;
    }
    public static int maior(int[] v){
        int maior = v[0];
        for(int i = 0; i < v.length; i+=1){
            if(v[i] > maior){
                maior = v[i];
            }
        }
        return maior;
    }
    public static int menor(int[] v){
        int menor = v[0];
        for(int i = 0; i < v.length; i++){
            if(v[i] < menor){
                menor = v[i];
            }
        }
        return menor;
    }
    public static int contarPares(int[] v){
        int contador = 0;
        for(int i = 0; i < v.length; i+=1){
            if(v[i] % 2 == 0){
                contador+=1;
            }
        }
        return contador;
    }
    public static int contarOcorrencias(int[] v, int x){
        int vezes = 0;
        for(int i = 0; i < v.length; i+=1){
            if(v[i] == x){
                vezes+=1;
            }
        }
        return vezes;
    }
    public static int buscaSequencial(int[] v, int x){
        int indice = 0;
        for(int i = 0; i < v.length; i+=1){
            if(v[i] == x){
                indice = i;
                return indice;
            }
        }
        return -1;
    }
    public static void inverter(int[] v){
        int temp = 0;
        for(int i = 0, j = v.length-1; i < j; i++, j--){
            temp = v[i];
            v[i] = v[j];
            v[j] = temp;
        }
        for(int i = 0; i < v.length; i+=1){
            System.out.print(v[i] + " ");
        }
        System.out.println(" ");
    }
    public static int[] filtrarPares(int[] v){
        int[] vetor = new int[v.length];
        int k = 0;
        for(int i = 0; i < v.length; i+=1){
            if(v[i] % 2 == 0){
                vetor[k] = v[i];
                k = k + 1;
            }
        }
        return vetor;
    }
    public static int[] copiar(int[] v){
        int[] novoVetor = new int[v.length];
        for(int i = 0; i < v.length; i++){
            novoVetor[i] = v[i];
        }
        return novoVetor;
    }
    public static boolean temRepetido(int[] v){
        for(int i = 0; i < v.length; i+=1){
            for(int j = i + 1; j < v.length; j+=1){
                if(v[i] == v[j]){
                    return true;
                }
            }
        }
        return false;
    }
    public static int[] removerRepetidos(int[] v){
        boolean achou = temRepetido(v);
        int[] novoVeotor = new int[v.length];
        int contador = 0;
        for(int i = 0; i < v.length; i+=1){
            achou = false;
            for(int j = 0; j < contador; j+=1){
                if(v[i] == novoVeotor[j]){
                    achou = true;
                    break;
                }
            }
            if(achou == false){
                novoVeotor[contador] = v[i];
                contador = contador + 1;
            }
        }
        return novoVeotor;
    }
    public static void bubbleSort(int[] v){
        int temp = 0;
        for(int i = 0; i < v.length; i+=1){
            for(int j = 0; j < v.length-1; j+=1){
                if(v[j] > v[j+1]){
                    temp = v[j];
                    v[j] = v[j+1];
                    v[j+1] = temp;
                }
            }
        }
        for(int i = 0; i < v.length; i+=1){
            System.out.print(v[i] + " ");
        }
    }
    /* +++ DEBUG +++ */
    public static void main(String[] args){
        int[] vetor = {5, 3, 1, 2, 4, 5, 6};
        System.out.println(somar(vetor));
        System.out.println(media(vetor));
        System.out.println(maior(vetor));
        System.out.println(menor(vetor));
        System.out.println(contarPares(vetor));
        System.out.println(contarOcorrencias(vetor, 5));
        System.out.println(buscaSequencial(vetor, 0));
        inverter(vetor);
        for(int i = 0; i < vetor.length; i++){
            System.out.print(filtrarPares(vetor)[i] + " ");
        }
        System.out.println(" ");
        for(int i = 0; i < vetor.length; i++){
            System.out.print(copiar(vetor)[i] + " ");
        }
        System.out.println(" ");
        System.out.println(temRepetido(vetor));
        for(int i = 0; i < vetor.length; i++){
            System.out.print(removerRepetidos(vetor)[i] + " ");
        }
        System.out.println(" ");
        bubbleSort(vetor);
    }
}
