
package trabalhoprogramacao;

import java.util.Scanner;


public class Exercicio15 {
    public static void main(String[] args) {
        
        int qtdeEstoque;
        int qtdeMaxima;
        int qtdeMinima;
        int mediaEstoque;

        Scanner Entrada = new Scanner(System.in);
        System.out.println("Entre com a Quantidade de Estoque Atual: ");
        qtdeEstoque = Entrada.nextInt();
        System.out.println("Entre com a Quantidade Maxima de Estoque: ");
        qtdeMaxima = Entrada.nextInt();
        System.out.println("Entre com a Quantidade Minima de Estoque: ");
        qtdeMinima = Entrada.nextInt();
        
        mediaEstoque = (qtdeMaxima + qtdeMinima)/2;
        System.out.println("A Média do estoque é " + mediaEstoque );
        
        if (qtdeEstoque <= mediaEstoque) 
        {
            System.out.println("Não efetuar Compra");
        }
        else
        {
            System.out.println("Efetuar Compras");
        }
    }
    }

