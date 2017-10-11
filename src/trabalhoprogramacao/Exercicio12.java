
package trabalhoprogramacao;

import java.util.Scanner;

public class Exercicio12 {
   
    public static void main(String[] args) {
        
        int ladoX, ladoY, ladoZ;
        int opcao = 1;
        while (opcao == 1) {
            Scanner Entrada = new Scanner(System.in);
            System.out.println("Entre com o lado x:");
            ladoX = Entrada.nextInt();
            System.out.println("                           ");
            System.out.println("Entre com lado y:");
            ladoY = Entrada.nextInt();
            System.out.println("                           ");
            System.out.println("Entre com lado z:");
            ladoZ = Entrada.nextInt();
            System.out.println("                           ");
            if ((ladoX < ladoY + ladoZ) && (ladoY < ladoX + ladoZ) && (ladoZ < ladoX + ladoY)) {
                if (ladoX == ladoY && ladoX == ladoZ) {
                    System.out.println("Triangulo Equilatero");
                } else if ((ladoX == ladoY) || (ladoX == ladoZ)) {
                    System.out.println("Triangulo Isosceles");
                } else {
                    System.out.println("Triângulo Escaleno");
                }
            } else {
                System.out.println("Não é um triangulo!");
            }
            System.out.println("");
            System.out.println("Deseja continuar? 1 = sim, 2 = não");
            opcao = Entrada.nextInt();
           }
        System.out.println("O programa foi finalizado.");
    }
}
