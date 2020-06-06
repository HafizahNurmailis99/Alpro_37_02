package uts;

class uts_9_c{ 
	public static void main (String[] args){
        int [] array ={92, 12, 51, 38, 29, 26, 19, 48, 10, 55, 28, 32, 5};
        
	System.out.println("Menampilkan semua nilai array : ");
	for (int i=0;i<array.length;i++){
	   System.out.print(array[i]+" ");  
        }
	System.out.println("");
	System.out.print("Cari kelipatan 3? Tampilkan: ");
	for (int i=0;i<array.length;i++){
	   if (array[i]%3==0){
	      System.out.print(array[i]+" ");
	   }
	}
    }
}