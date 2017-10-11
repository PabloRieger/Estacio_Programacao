
package trabalhoprogramacao;

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
       
        int qtdeComprada;
        double valorDaCompra;
       
        Scanner Entrada = new Scanner (System.in);
        
        System.out.println("Digite a Quantidade de Maças que deseja comprar: ");
        qtdeComprada = Entrada.nextInt();
        
             
        if (qtdeComprada > 12)
        {
            valorDaCompra = qtdeComprada * 1.00;
            System.out.println("O Valor da Compra é: "+ valorDaCompra);
        }
        else
        {
            valorDaCompra = qtdeComprada * 1.30;
            System.out.println("O Valor da Compra é: "+ valorDaCompra);
        }
    }
}

