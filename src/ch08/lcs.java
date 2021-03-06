package ch08;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
  
public class lcs{
    public String lcs(String str1, String str2){
        int l1 = str1.length();
        int l2 = str2.length();
 
        int[][] arr = new int[l1 + 1][l2 + 1];
 
        for (int i = l1 - 1; i >= 0; i--) {
            for (int j = l2 - 1; j >= 0; j--) {
                if (str1.charAt(i) == str2.charAt(j))
                    arr[i][j] = arr[i + 1][j + 1] + 1;
                else 
                    arr[i][j] = Math.max(arr[i + 1][j], arr[i][j + 1]);
            }
        }
 
        int i = 0, j = 0;
        StringBuffer sb = new StringBuffer();
        while (i < l1 && j < l2) {
            if (str1.charAt(i) == str2.charAt(j))  {
                sb.append(str1.charAt(i));
                i++;
                j++;
            }
            else if (arr[i + 1][j] >= arr[i][j + 1]) 
                i++;
            else
                j++;
        }
        return sb.toString();
    }
    
 
    public static void main(String[] args) throws IOException{    
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
        System.out.println("\nInput Kata Pertama: ");
        String a = br.readLine();
 
        System.out.println("\nInput Kata Kedua: ");
        String b = br.readLine();
 
        lcs obj = new lcs(); 
        String result = obj.lcs(a, b);
 
        System.out.println("\nLCS : "+ result);
    }
}