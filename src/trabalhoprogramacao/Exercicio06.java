
package trabalhoprogramacao;

import java.util.Scanner;

public class Exercicio06 {
    
    public static void main(String[] args) {
        
        Scanner Entrada = new Scanner (System.in);
        System.out.println("Digite um numero: "); 
        int i = Entrada.nextInt();
        if (i % 2 == 0){
        System.out.println(i + " O numero é par");
        } else{
        System.out.println(i + " O numero é impar");}
    }
}
