package ch05;

class LCS { 
	public static void main(String[] args) { 
		String kata1 = "SURABAYA"; 
		String kata2 = "SURAKARTA"; 

		char[] X=kata1.toCharArray(); 
		char[] Y=kata2.toCharArray(); 
		int m = X.length; 
		int n = Y.length; 

		System.out.println("Menampilkan semua nilai array : ");
		System.out.println(" "+kata1+" ");
    	     	System.out.println(" "+kata2+" ");
	
		int L[][] = new int[m+1][n+1]; 

		for (int i=0; i<=m; i++) { 
		   for (int j=0; j<=n; j++) { 
			if (i == 0 || j == 0) {
				L[i][j] = 0; 
		        }else if (X[i-1] == Y[j-1]) {
				L[i][j] = L[i-1][j-1] + 1; 
			}else{
			L[i][j] = Integer.max(L[i-1][j], L[i][j-1]); 
			
			}
		   } 
		} 
		System.out.println(" ");
		System.out.println("Panjang dari LCS : " +L[m][n]); 
	} 
} 

