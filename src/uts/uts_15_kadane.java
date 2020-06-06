package uts;
import java.util.Scanner;

public class uts_15_kadane {
         public static void main(String[] args) {
 	 int array[] = { -5, 2, -2, 4, 2}; 

	 System.out.println("Menampilkan semua nilai dalam array : ");
	 for (int i=0;i<array.length;i++){
    	     System.out.print(" "+array[i]+" ");
         }
	
	 System.out.println(" ");
	 
         int maxSum, sum;
         sum = array[0];
         maxSum = array[0];
         for (int i=0;i<array.length;i++) {
            if (sum < 0) {
		sum = array [i];
	    }else{
                sum = sum + array[i];
            }
            if (sum > maxSum) {
                maxSum = sum;
            }
         }
	 System.out.println("Jumlah sub-array yang berdekatan dengan jumlah terbesar adalah "+maxSum);
    }
}