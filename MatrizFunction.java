public class MatrizFunction {
    public static final int[][] matriz = {
        {2, 1, 4},
        {3, 7, 6},
        {5, 9, 3}
    };
    
    public static int soma(int[][] m){
        int soma = 0;
        for(int i = 0; i < m.length; i+=1){
            for(int j = 0; j < m[0].length; j+=1){
                soma = soma + m[i][j];    
            }
        }
        return soma;
    }
    public static void main(String[] args){
        // main de teste isolado do MatrizFunction
        System.out.println(soma(matriz));
    }
}
