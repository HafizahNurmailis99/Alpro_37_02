package ch03;
import java.util.Scanner;

public class No_2 {
    public static void main(final String[] args) {
        Scanner i = new Scanner (System.in);
	System.out.print("Input X: ");
	int x = i.nextInt();  
	System.out.print("Input Y: ");
	int y = i.nextInt();  
	System.out.print("Input Z: ");
	int z = i.nextInt(); 

	if (x>y && x>z) {
	 System.out.println("Nilai X = "+x +"; Nilai Y = "+y+"; Nilai Z = "+z+" ==> Maka X adalah nilai tertinggi");
	} else if (y>x && y>z){
	 System.out.println("Nilai X = "+x +"; Nilai Y = "+y+ "; Nilai Z = "+z+" ==> Maka Y adalah nilai tertinggi");
	} else {
	 System.out.println("Nilai X = "+x +"; Nilai Y = "+y+ "; Nilai Z = "+z+" ==> Maka Z adalah nilai tertinggi");
	}

    }
}
