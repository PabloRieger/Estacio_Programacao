
package trabalhoprogramacao;

import java.util.Scanner;

public class Exercicio162 {
    public static void main(String[] args) {
        
         int conta;
        float saldo, saldoAtual;
        float credito;
        float debito;

        Scanner Entrada = new Scanner(System.in);
        System.out.println("Digite o Número da Conta: ");
        conta = Entrada.nextInt();
        System.out.println("Informe o Saldo da Conta: ");
        saldo = Entrada.nextFloat();
        System.out.println("Informe o Valor do Credito: ");
        credito = Entrada.nextFloat();
        System.out.println("Informe o Valor do Dedito: ");
        debito = Entrada.nextFloat();

        saldoAtual = saldo - debito + credito;
       
        System.out.println("O Saldo Atual é : " + saldoAtual);
        if (saldoAtual >= 0) {
            System.out.println("Saldo Positivo");
        } else {
            System.out.println("Saldo Negativo");
        }
    }
}

