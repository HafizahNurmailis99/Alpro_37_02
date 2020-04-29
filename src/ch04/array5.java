package ch04;
import java.util.Scanner;

public class array5 {
    public static void main (String[] args){
        int [] array ={82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        
	System.out.println("Menampilkan semua nilai array : ");

	for (int i=0;i<array.length;i++){
	   System.out.print(array[i]+" ");  
        }
	System.out.println(" ");
	System.out.print("Hanya yang memiliki angka 2 di array : ");

	for(int i=0;i<array.length;i++){
	   if((array[i]%2==0)&&(array[i]!=38)&&(array[i]!=48)&&(array[i]!=8)){
	   	System.out.print(array[i]+" ");
	   }
	}
    }
}