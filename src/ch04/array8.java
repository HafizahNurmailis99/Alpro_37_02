package ch04;

public class array8 {
    public static void main (String[] args){
        int [] array ={82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        
	System.out.print("Menampilkan semua nilai array : ");

        for (int i=0;i<array.length;i++){
    	   System.out.print(array[i]+" ");
        }
	
	System.out.println();
    	System.out.print("Jumlah angka dalam array : "+array.length);

	System.out.println();
	
	int jumlah = 0;
	for (int i=0;i<array.length;i++){
	   jumlah = jumlah+array[i];
	}
    	System.out.print("Penjumlahan atas semua angka : "+jumlah);
    }
}