
package trabalhoprogramacao;

import java.util.Scanner;

public class Exercicio8 {
   
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        float nota1;
        float nota2;
        float media;
        System.out.println("Digite a primeira nota: ");
        nota1 = entrada.nextFloat();
        System.out.println("Digite a segunda nota: ");
        nota2 = entrada.nextFloat();
        
        media = (nota1+nota2)/2;
        
        if(media >= 7)
            System.out.println("A Leke, você está aprovado com a nota: "+media);
        else
            System.out.println("Poha Leke, vamos estudar mais, você está reprovado com a nota: "+media);
    }
}
