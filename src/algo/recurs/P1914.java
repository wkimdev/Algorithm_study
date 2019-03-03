package algo.recurs;

import java.util.Scanner;

// https://www.acmicpc.net/problem/1914
public class P1914 {
	public static int[] d;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int arr[] = new int[n]; // 17
		int cal = 0;
		for (int i = 0; i < arr.length; i++) {
			d = new int[i+1];
			cal = recurf(i);
			arr[i] = cal;
			if(arr[i] >= n) {
				System.out.println(i-1);
				return; 
			}
		}
		
	}
	
	public static int recurf(int k) {
		int ans = 0;
		
		if( k == 0) {
			d[k] = k;
			return k;
		}
		if( k == 1 ) {
			d[k] = k;
			return k;
		}
		d[k] = recurf(k-1) + k;
		
		return d[k];
	}
	
}
