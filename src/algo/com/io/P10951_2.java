package algo.com.io;

import java.util.Scanner;

public class P10951_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 타입을 맞춰라!!
		while(sc.hasNextInt()) {
			System.out.println(sc.nextInt()+sc.nextInt());
		}
		sc.close();
	}
}
