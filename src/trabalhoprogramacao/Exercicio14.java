
package trabalhoprogramacao;

import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
       
        float NHorasTrab;
        double VlrHoraReg;
        double SalNormal;
        double VlrHoraExt;
        double SalTotal;
                        
        Scanner Entrada = new Scanner(System.in);
        
        System.out.println("Digite a quantidade de horas trabalhada: ");
        NHorasTrab = Entrada.nextInt();
        
        System.out.println("Digite o valor por hora trabalhada: ");
        VlrHoraReg = Entrada.nextDouble();

        if (NHorasTrab  > 160)
        {
            VlrHoraExt  = (NHorasTrab - 160) * (VlrHoraReg*40/100);
            SalTotal  = 160 * VlrHoraReg  + VlrHoraExt;
            System.out.println("O valor do Sálario é: "+SalTotal);
        }
        else
        {
            SalNormal  = VlrHoraReg * 160;
            System.out.println("O valor do Sálario é: "+SalNormal);
        }
    }
}

