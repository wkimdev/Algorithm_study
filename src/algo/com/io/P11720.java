package algo.com.io;

import java.util.Scanner;

public class P11720 {

	public static void main(String[] args) {
		// 첫째 줄에 숫자의 개수 N (1 ≤ N ≤ 100)이 주어진다. 둘째 줄에 숫자 N개가 공백없이 주어진다.
		// 54321 --> 이거 하나하나 끊어서 받게 하는 방법>???  
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String str = sc.next();
		int cnt = 0;
		for (int i = 0; i < n; i++) {
			cnt += str.charAt(i)-'0';
		}
		System.out.println(cnt);
	}

}
