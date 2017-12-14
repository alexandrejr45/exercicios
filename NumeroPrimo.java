package questao1;

import java.util.Scanner;

public class NumeroPrimo {
    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);
        
        int[] numero = new int[5];
        int[] valores  = {2, 3, 5, 7};
        int[] aux = new int[5];
   
         
        for(int i = 0; i < 5; i++){
            System.out.println("Digite um número ");
            numero[i] = valor.nextInt();
        
        }
        
        
        for(int j = 0; j < 5; j++){
            aux[j] = 0;
            
            for(int m = 0; m < 4; m++){
                if(numero[j] % valores[m] == 0){
                    aux[j]++;
                }
                
                if(numero[j] == valores[m]){
                    aux[j] = 0;
                }
            }
            
            if(aux[j] == 0){
                System.out.println("Número " + numero[j] + " é primo");
            }
        }
        
        
    }
}
