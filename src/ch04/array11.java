package ch04;

public class array11 {
    public static void main (String[] args){
        int [] array ={83, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        
	System.out.print("Menampilkan semua nilai array : ");
	
        for (int i=0;i<array.length;i++){
    	   System.out.print(array[i]+" ");
        }
	System.out.println();
	System.out.println();

	System.out.println("angka terbesar setelah :");
    		
	int max=array[0];
	for (int i=0;i<array.length;i++){
		for (int j=1;j<array.length-1;j++){
	     		if(array[j]>array[i]){
			max=array[j];
			System.out.print(array[i] +"<"+max+" ; ");
	       	 		
	     		}
		}
		System.out.println();
		System.out.println();
	}
    }
}