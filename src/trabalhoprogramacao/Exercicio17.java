
package trabalhoprogramacao;

import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        
        Scanner Entrada = new Scanner(System.in);
        int decimal, modulo, aux;
        String binario = "";
        System.out.println("Digite um numero decimal: ");
        decimal = Entrada.nextInt();
        aux = decimal;

        while (decimal > 0) {
            modulo = (decimal % 2);
            binario = modulo + binario;
            decimal = decimal / 2;
        }
        System.out.println("O numero " + aux + " em base 10 é: " + binario + " na base 2");
    }
}
