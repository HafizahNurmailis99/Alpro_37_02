package uts;
import java.util.Scanner;

public class uts_8_a {
    public static void main(final String[] args) {
	Scanner i = new Scanner (System.in);
	System.out.print("Input X: ");
	int x = i.nextInt();  
	System.out.print("Input Y: ");
	int y = i.nextInt();       

	if (x>y) {
	 System.out.println("Nilai X ("+x +") adalah nilai tertinggi");
	} else{
	 System.out.println("Nilai Y ("+y +") adalah nilai tertinggi");
	}

    }
}
