package TK;
import java.util.Scanner;

public class euclidean {
    public static void main (String[] args){
        Scanner input = new Scanner (System.in);
	int x,y,r;
	System.out.print("Masukkan Bilangan ke-1 : ");	
	x = input.nextInt();
	System.out.print("Masukkan Bilangan ke-2 : ");	
	y = input.nextInt();
	
	System.out.print("FPB (Faktor Persekutuan Terbesar dari "+x+" dan "+y+" adalah ");
		
	while(y!=0){
	   r=x%y;
	   x=y;
	   y=r;
	}
	System.out.print(x);
    }
}