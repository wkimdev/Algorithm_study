package algo.recurs;

import java.util.Scanner;

// https://www.acmicpc.net/problem/10872
// 14260KB	112ms 
public class P10872 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(factorial(n));
	}
	
	public static int factorial(int n) {
		// runtime error
//		int ans;
//		// 1일 경우 예외처리 
//		if (n == 1) {
//			return 1;
//		} else {
//			ans = ( n * factorial(n-1) );
//		}
//		return ans;
		int num = 1;
		for (int i = n; i >= 1; i--) {
			num *= i;
		}
		return num;
	}
}
