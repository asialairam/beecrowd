package br.laisa.beecrowd.iniciante;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Problema1008 {
    public static void main(String[] args) {
        DecimalFormat formatador = new DecimalFormat("0.00");
        Scanner leia = new Scanner(System.in);
        int numero = leia.nextInt();
        int horasTrabalhadas = leia.nextInt();
        double valorHorasTrabalhadas = leia.nextDouble();

        double salario = (horasTrabalhadas*valorHorasTrabalhadas);
        System.out.println("NUMBER = " + numero);
        System.out.println("SALARY = U$ " + formatador.format(salario));
    }
}
