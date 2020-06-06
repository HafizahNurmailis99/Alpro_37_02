package ch06;
import java.util.Scanner;

public class insert_sort {
    public static void main (String[] args){
        int [] array ={82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        
	System.out.println("Menampilkan Array Sebelum Di Urutkan : ");
        
	for (int h=0;h<array.length;h++){
    	System.out.print(array[h]+" ");
        }

	System.out.println(" ");

	System.out.println("Menampilkan Array Sesudah Di Urutkan : ");
        
	for (int i=1;i<array.length;i++){
		for(int j =i;j>0;j--){
			if(array[j]<array[j-1]){
				int temp = array[j-1];
				array[j-1] = array[j];
				array[j] = temp;
			}
		}
	}
	for ( int h = 0; h<array.length;h++){
		System.out.print(array[h]+" ");
	}
    }
}