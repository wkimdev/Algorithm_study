package algo.com.io;

import java.util.*;

public class P2441 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		for(int i = a ; i > 0 ; i--) {
			for(int j = 0; j < a - i ; j++) {
				System.out.print(" ");
			}
			for(int n = i ; n > 0 ; n-- ) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
