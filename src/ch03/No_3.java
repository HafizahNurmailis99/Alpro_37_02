package ch03;
import java.util.Scanner;

public class No_3 {
    public static void main(final String[] args) {
        Scanner i = new Scanner (System.in);
	do {
	System.out.print("Input A: ");
	int a = i.nextInt(); 
	System.out.print("Input B: ");
	int b = i.nextInt(); 
	} while ((a>2)&&(b>2)&&(a!=b));

	
	While(x=0){
	   x=x+a;
	   if (x%b==0){
		System.out.println("KPK dari "+a+" dan "+b+" = "+x);
	   	x++;
	   }
	}
    }
}
