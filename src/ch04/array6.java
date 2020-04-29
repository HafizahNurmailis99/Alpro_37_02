package ch04;
import java.util.Scanner;

public class array6 {
    public static void main (String[] args){
        int [] array ={82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        
	System.out.println("Menampilkan semua nilai array : ");

	for (int i=0;i<array.length;i++){
	   System.out.print(array[i]+" ");  
        }
	System.out.println("\n");

	System.out.print("Hanya angka ganjil yang di apit genap : ");
	for (int i=0;i<array.length;i++){
	   if (array[i]%2==0){
	   }else {
		if (array[i]!=3){
	         System.out.print(array[i]+" ; ");
		}
	   }
	}
    }
}