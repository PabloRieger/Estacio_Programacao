
package trabalhoprogramacao;

public class Exercicio09 {
    public static void main(String[] args) {
         
        int c = 1;
        c = 0;
        System.out.println(c--);
        System.out.println(++c);
        System.out.println(c);
        
        c -= --c - c++;
        
        System.out.println(c--);
        System.out.println(++c);
        System.out.println(c);
        
        System.out.println("Resposta: Retornou 6 linhas todas com o valor zero.");
    }
 
}
