package algo.com.io;

import java.util.Scanner;

//별찍기
public class P2440 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		for(int i = 0 ; i < 5 ; i++) {
			for(int j = 0; j < a-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
     }
}
