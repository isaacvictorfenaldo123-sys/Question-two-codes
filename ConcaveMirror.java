
package partb.concavemirror;

import java.util.Scanner;

public class ConcaveMirror {

    public static void main(String[] args) {
        Scanner save = new Scanner(System.in);
        System.out.print("Enter object distance (u, negative): ");
        double u = save.nextDouble();
        System.out.print("Enter image distance (v): ");
        double v = save.nextDouble();

        double f = 1 / ((1 / v) + (1 / u));
        System.out.println("Focal Length (f): " + f + " cm");

        if (f >= 21 && f <= 25)
            System.out.println("Mirror acceptable: YES");
        else
            System.out.println("Mirror acceptable: NO");
    }
}
