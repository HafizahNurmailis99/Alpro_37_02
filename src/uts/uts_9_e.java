package uts;

class uts_9_e{ 
	public static void main (String[] args){
        int [] array ={92, 12, 51, 38, 29, 26, 19, 48, 10, 55, 28, 32, 5};
        int jumlahS, i;
	System.out.print("Menampilkan semua nilai array : ");
        for (i=0;i<array.length;i++){
    	   System.out.print(array[i]+" ");
        }
	System.out.println();
    	System.out.print("Jumlah angka dalam array/Panjang array -> "+array.length);
	System.out.println();

	jumlahS = 0;
	for (i=0;i<array.length;i++){
	   jumlahS = jumlahS+array[i];
	}
    	System.out.print("Penjumlahan atas semua angka didalam array -> "+jumlahS);
    }
}