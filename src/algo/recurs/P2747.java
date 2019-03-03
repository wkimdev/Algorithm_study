package algo.recurs;

import java.util.Scanner;

// 14332KB	116ms
// https://www.acmicpc.net/problem/2747 
public class P2747 {
	
	public static int[] d;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		// 메모이제이션 제대로 이해 못 한듯... 
		d = new int[n+1];
		//d[n+1] = -1; // 초기값 -1은 피보나치 결과로 절대 나올 수 없는 값. why n + 1????
		System.out.println(fibonacci(n));
	}
	
	public static int fibonacci(int n) {
		if( n == 0 ) {
			d[n] = n;
			return n;
		}
		if( n == 1 ) {
			d[n] = n;
			return n;
		}
		
		// 이미 계산한 값이 있다면 그 값을 바로 리턴한다.
		if(d[n] != 0) {
			return d[n]; 
		}
		
		// 아니라면 계산해서 dp 리스트에 넣어서 보존한다.
		d[n] = fibonacci(n-2) + fibonacci(n-1);
		return d[n]; 
	}
}
