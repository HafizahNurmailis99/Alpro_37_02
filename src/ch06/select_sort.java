package ch06;
import java.util.Scanner;

public class select_sort {
    public static void main (String[] args){
        int [] array ={82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        
	System.out.println("Menampilkan Array Sebelum Di Urutkan : ");
        
	for (int h=0;h<array.length;h++){
    	System.out.print(array[h]+" ");
        }

	System.out.println(" ");

	System.out.println("Menampilkan Array Sesudah Di Urutkan : ");
        
	for (int i=0;i<array.length-1;i++){
		int min = i;
		for (int j=1+i;j<array.length;j++){
    			if(array[min]>array[j]){
				min = j;
			}
		int temp = array[min];
		array[min] = array[i];
		array[i] = temp;
		}
        }
	for ( int h = 0; h<array.length;h++){
		System.out.print(array[h]+" ");
	}
    }
}