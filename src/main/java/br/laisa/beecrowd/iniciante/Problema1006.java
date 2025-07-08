package br.laisa.beecrowd.iniciante;
import java.util.Scanner;

public class Problema1006 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        double A, B, C;
        A = leia.nextDouble();
        B = leia.nextDouble();
        C = leia.nextDouble();

        double MEDIA = (((A*2)+(B*3)+(C*5))/10);

        String media = String.format("MEDIA = %,.1f", MEDIA);
        System.out.println(media);
    }
}
