
package trabalhoprogramacao;

import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {
        
        int n=0;
        Scanner leitorDeDos = new Scanner(System.in);
        System.out.println("Digite o valor de n");
        n = leitorDeDos.nextInt();
        
        for(int linha = 1; linha<=n; linha++){
            for(int coluna = 1; coluna<=n; coluna++){
                System.out.print(""+linha+coluna+" ");
            }
            System.out.println("");
        }
    }
}
