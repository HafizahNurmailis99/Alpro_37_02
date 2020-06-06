package uts;
import java.util.Scanner;
class uts_9_a { 
	public static void main (String[] args){
        int [] array ={92, 12, 51, 38, 29, 26, 19, 48, 10, 55, 28, 32, 5};
        int i, cari;
	boolean ketemu;
	System.out.println("Disediakan array : ");
	for (i=0;i<array.length;i++){
    	   System.out.print(array[i]+" ");
        }
	System.out.println();

	System.out.print("Cari angka ? ");
	Scanner cariX = new Scanner (System.in);	
	cari = cariX.nextInt();
	ketemu = false;
	for (i=0;i<array.length;i++){
	   if(array[i]==cari){
		ketemu=true;
	   }
        }
	if (ketemu){
	   	System.out.println("Angka "+cari+" ditemukan"); 
	}else{
		System.out.println("Angka "+cari+" tidak ditemukan");
	}
    }
}