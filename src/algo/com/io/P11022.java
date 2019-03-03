package algo.com.io;

import java.util.Scanner;

public class P11022 {
	
	public static void main(String[] args) {
		
		// Case #1: 1 + 1 = 2
		// Case #1: 1 + 1 = 2
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println("Case #"+(i+1)+": "+a+" + "+b+" = "+(a+b));
		}
	}
}
