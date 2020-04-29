package ch04;
import java.util.Scanner;

public class array2 {
    public static void main (String[] args){
        int [] array ={82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        
	System.out.println("Angka yang disediakan : ");
        
	for (int i=0;i<array.length;i++){
    	   System.out.print(array[i]+" ");
        }
	System.out.println();
	System.out.print("Cari angka : ");
        
	Scanner cariX = new Scanner (System.in);	
	int cari = cariX.nextInt();
	boolean ketemu = false;
	int i=0;
	for (i=0;i<array.length;i++){
		if(array[i]==cari){
		   ketemu=true;
		}
		
        }
	if (ketemu ){
	   	System.out.println("Angka "+cari+" ditemukan"); 
	}else{
		System.out.println("Angka "+cari+" tidak ditemukan");
	}
    }
}