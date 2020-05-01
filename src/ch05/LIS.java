package ch05;

class LIS { 
	public static void main(String args[]) { 
		int array[] = {1, 4, 3, 5, 2, 6}; 
		int n = array.length; 
		System.out.println("Menampilkan semua nilai array : ");
		for (int i=0;i<n;i++){
    	     		System.out.print(" "+array[i]+" ");
         	} 
		int lis[] = new int[n]; 
		int i, j, max = 0; 
		
		for (i = 0; i < n; i++){
			lis[i] = 1; 
		}
		for (i = 1; i < n; i++){ 
			for (j = 0; j < i; j++){ 
				if (array[i] > array[j] && lis[i] < lis[j] + 1){ 
					lis[i] = lis[j] + 1; 
				}
			}
		}
		for (i = 0; i < n; i++){ 
			if (max < lis[i]){ 
				max = lis[i]; 
			}
		}
		System.out.println(" ");
		System.out.println("Panjang dari LIS : " + max);
		 
	} 
} 
