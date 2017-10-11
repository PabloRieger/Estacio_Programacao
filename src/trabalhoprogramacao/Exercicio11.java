
package trabalhoprogramacao;

import java.util.Scanner;

public class Exercicio11 {
  
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        float numero;
        
        System.out.println("Digite um número: ");
        numero = entrada.nextFloat();
        
        if(numero > 10)
            System.out.println("O número "+numero+" é maior que 10!");
        else if (numero < 10)
            System.out.println("O número "+numero+" é menor que 10!");
        else
            System.out.println("o número "+numero+" é igual a 10!");
            
            }
}
