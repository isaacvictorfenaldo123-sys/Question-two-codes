
package qn2.saccoinvestmentswhileloop;

import java.util.Scanner;

public class SaccoinvestmentsWhileloop {

    public static void main(String[] args) {
        Scanner save = new Scanner(System.in);
        System.out.print("Enter number of teachers: ");
        int n = save.nextInt();
        int i = 1;

        while (i <= n) {
            System.out.print("Enter principal for teacher " + i + ": ");
            double P = save.nextDouble();
            System.out.print("Enter time in years: ");
            double t = save.nextDouble();
            double A = P * (1 + 0.05 * t);
            System.out.println("Final investment = " + A);
            i++;
        }
    }
}
