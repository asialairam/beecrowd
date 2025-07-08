package br.laisa.beecrowd.iniciante;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Problema1009 {
    public static void main(String[] args) {
        DecimalFormat formatador = new DecimalFormat("#.00");
        Scanner leia = new Scanner(System.in);
        String nome = leia.next();
        double salario = leia.nextDouble();
        double vendas = leia.nextDouble();

        double totalAReceber = (salario + (vendas*0.15));

        System.out.println("TOTAL = R$ " + formatador.format(totalAReceber));
    }
}