
package trabalhoprogramacao;

public class Exercicio10 {
    public static void main(String[] args) {
        
        int a, b, c;
        for (a = 2; a <= 10; a += 2) {
            for (b = a; b <= 2; b++) {
                for (c = 1; c <= a; c += b) {
                    System.out.println("" + a + b + c);
                    System.out.println("Resposta: é o numero 221");
                }
            }
        }
    }
}
