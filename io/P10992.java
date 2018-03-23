package algo.com.io;

import java.util.Scanner;

public class P10992 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		for(int i = 1; i <= a; i++) {
			for(int j = 0 ; j < (2 * i -1) ; i--) {
				System.out.print("*");
			}
		}
     }
}
