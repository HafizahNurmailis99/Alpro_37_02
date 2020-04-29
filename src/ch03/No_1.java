package ch03;
import java.util.Scanner;

public class No_1 {
    public static void main(final String[] args) {
	Scanner i = new Scanner (System.in);
	System.out.print("Input X: ");
	int x = i.nextInt();  
	System.out.print("Input Y: ");
	int y = i.nextInt();       

	if (x>y) {
	 System.out.println("Nilai X = "+x +" dan Nilai Y = "+y+" ==> Maka X adalah nilai tertinggi");
	} else{
	 System.out.println("Nilai X = "+x +" dan Nilai Y = "+y+" ==> Maka Y adalah nilai tertinggi");
	}

    }
}
