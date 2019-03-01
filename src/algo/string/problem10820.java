package algo.string;

import java.util.Scanner;

// https://www.acmicpc.net/problem/10820 
// 15044KB	124ms
public class problem10820 {
	
	// 문자열 N개가 주어진다. 이때, 문자열에 포함되어 있는 소문자, 대문자, 숫자, 공백의 개수를 구하는 프로그램을 작성하시오.
	// 각 문자열은 알파벳 소문자, 대문자, 숫자, 공백으로만 이루어져 있다.
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextLine()) {
			String s = sc.nextLine();
			int upper = 0;
			int lower = 0;
			int digit = 0;
			int space = 0;
			
			for (int i = 0; i < s.length(); i++) {
				char c = s.charAt(i);
				// 소문자
				// 대문자
				// 숫자
				// 공백 = ' '
				if('a' <= c && c <= 'z') {
					lower += 1;
				} else if ('A' <= c && c <= 'Z') {
					upper += 1;
				} else if ('0' <= c && c <= '9') { 
					digit += 1;
				} else if (c == ' ') {
					space += 1;
				}
			}
			System.out.println(lower+" "+upper+" "+digit+" "+space);
			//
//			10 2 0 2
//			0 10 1 8
//			5 6 0 16
//			0 8 9 0

		}
	}
}
