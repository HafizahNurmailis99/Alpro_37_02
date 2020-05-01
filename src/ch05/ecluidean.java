package ch05;
import java.util.Scanner;

public class ecluidean {
    public static void main (String[] args){
        Scanner input = new Scanner (System.in);
	int m,n,r;
	System.out.print("Input Angka 1 : ");	
	m = input.nextInt();
	System.out.print("Input Angka 2 : ");	
	n = input.nextInt();
	
	System.out.print("FPB dari "+m+" dan "+n+" adalah ");
		
	while(n!=0){
	   r=m%n;
	   m=n;
	   n=r;
	}
	System.out.print(m);
    }
}