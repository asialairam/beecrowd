package br.laisa.beecrowd.iniciante;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Problema1010 {
    public static void main(String[] args) {
        DecimalFormat format = new DecimalFormat("#.00");
        Scanner leia = new Scanner(System.in);
        int codigo1 = leia.nextInt();
        int numPeças1 = leia.nextInt();
        double valorUnitario1 = leia.nextDouble();
        int codigo2 = leia.nextInt();
        int numPeças2 = leia.nextInt();
        double valorUnitario2= leia.nextDouble();

        double total = ((numPeças1*valorUnitario1) + (numPeças2*valorUnitario2));

        System.out.println("VALOR A PAGAR: R$ " + format.format(total));

    }
}