package uts;
import java.util.Scanner;

public class uts_8_b {
    public static void main(final String[] args) {
	Scanner i = new Scanner (System.in);
	System.out.print("Input X: ");
	int x = i.nextInt();  
	System.out.print("Input Y: ");
	int y = i.nextInt();       
	System.out.print("Input Z: ");
	int z = i.nextInt();

	if ((x>y) && (x>z)) {
	 System.out.println("Nilai X ("+x +") adalah nilai tertinggi");
	} else if ((y>x) && (y>z)) {
	    System.out.println("Nilai Y ("+y +") adalah nilai tertinggi");
	}else{
	    System.out.println("Nilai Z ("+z +") adalah nilai tertinggi");
	}
    }
}
