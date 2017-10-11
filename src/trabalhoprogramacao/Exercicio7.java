
package trabalhoprogramacao;

import java.util.Scanner;

public class Exercicio7 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        float numero1;
        float numero2;
        char operacao;
        System.out.println("Escolha sua operação [+ - * / ]: ");
        operacao = entrada.nextLine().charAt(0);
        
        System.out.println("Digite o primeiro número inteiro: ");
        numero1 = entrada.nextInt();
        System.out.println("Digite o segundo número inteiro: ");
        numero2 = entrada.nextInt();
        System.out.println();
        
         switch( operacao )
        {
            case '+':
                System.out.printf("%.2f + %.2f = %.2f", numero1, numero2, numero1 + numero2);
                break;        
                
            case '-':
                System.out.printf("%.2f - %.2f = %.2f", numero1, numero2, numero1 - numero2);
                break;
                
            case '*':
                System.out.printf("%.2f * %.2f = %.2f", numero1, numero2, numero1 * numero2);
                break;
                
            case '/':
                System.out.printf("%.2f / %.2f = %.2f", numero1, numero2, numero1 / numero2);
                break;
            
            default:
                System.out.println("Você digitou uma operação inválida.");        
            
        }
        
        
        
        
    }
}
