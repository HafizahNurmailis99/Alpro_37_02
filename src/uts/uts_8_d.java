package uts;
import java.util.Scanner;

public class uts_8_d {
        public static void main(final String[] args) {
        Scanner i = new Scanner (System.in);
	System.out.print("Input X: ");
	int x = i.nextInt();  	

	if ( x<=1 ) {
	 System.out.println("Angka "+x+" bukan bilangan Prima");
	} else if ( x==2 || x==3 || x==5 || x==7 ) {
	 System.out.println("Angka "+x+" adalah bilangan Prima");
	} else if ( x%2==0 || x%3==0 || x%5==0 || x%7==0 ) {
	 System.out.println("Angka "+x+" bukan bilangan Prima");
	} else {
	 System.out.println("Angka "+x+" adalah bilangan Prima");
	}
	
    }
}