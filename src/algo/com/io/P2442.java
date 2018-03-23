package algo.com.io;

import java.util.Scanner;

public class P2442 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		for(int i = 1; i <= a ; i++) {
			
			for(int n = 0; n < a-i ; n++) {
				System.out.print(" ");
			}
			for(int j = 0 ; j < ( 2 * i - 1 ) ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
