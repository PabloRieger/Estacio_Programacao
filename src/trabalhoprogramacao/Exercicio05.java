
package trabalhoprogramacao;

public class Exercicio05 {
    public static void main(String[] args) {
       
        int a = 3;
        int b = 1;
        int c = b + 1;
        int d = c > ++b ? (a - 3) : b;
        int e = 4;
        if( d > a && b + 1 < a || b > 1)
        c += 7;
        if( -7 >= -c)
        a -= 4;
        else
        d *= 2;
        e = ++d % 3;
        b = d++ % 3;
        System.out.println("Resultado de A: " + a);
        System.out.println("Resultado de B: " + b);
        System.out.println("Resultado de C: " + c);
        System.out.println("Resultado de D: " + d);
        System.out.println("Resultado de E: " + e);
        
    }
 
}
