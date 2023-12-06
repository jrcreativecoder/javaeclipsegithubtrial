package okul2;

import java.util.Date;
import java.util.Scanner;

public class okul2 {
	
	public static Date getDateCreated;

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("noktanın x koordinatını girin: ");
        double x = scanner.nextDouble();

        System.out.print("noktanın y koordinatını girin: ");
        double y = scanner.nextDouble();

        if (noktacemberalaninindami(x, y)) {
            System.out.println("nokta çemberin içinde.");
        } else {
            System.out.println("nokta çemberin dışında.");
        }
    }

    public static boolean noktacemberalaninindami (double x, double y) {
        
        double uzaklik = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
        return uzaklik <= 10;
    }
}
