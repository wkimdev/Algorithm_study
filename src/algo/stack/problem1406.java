package algo.stack;

import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;


// 메모리 212628KB	816ms
public class problem1406 {
	
	public static void main(String[] args) throws IOException {
		
		// 문자열 입력
		// 명령어 갯수 
		// 명령어에 따른 처리 
		// 출력 
		
		// 엔터는 어떻게 해석하지??? --> br.readLine()
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		
		Stack<Character> left = new Stack<Character>();
		Stack<Character> right = new Stack<Character>();

		// 받은 문자열을 stack에 넣어야 한다.
		
		int m = Integer.parseInt(br.readLine());
		System.out.println(s);
		System.out.println(m);
		
		String[] text = br.readLine().split(" ");
		char what = text[0].charAt(0);
		
//		String[] line = br.readLine().split(" ");
//        char what = line[0].charAt(0);
        
//	        for (int i=0; i<s.length(); i++) {
//	            left.push(s.charAt(i));
//	        }
//	        int m = Integer.parseInt(br.readLine());
//	        
//		
//		int m = br.read();
//		System.out.println(text);
//		System.out.println(m);
		
		// 명령어가 수행되기 전에 커서는 문장의 맨 뒤에 위치하고 있다. 
//		Stack<Character> left = new Stack<Character>();
//		Stack<Character> right = new Stack<Character>();
		
//		while(m-- > 0) {
//			//L, D, B, P $,
//			// 그리고 값이 empty 인지 아닌지를 확인?? 
//			if( text == "L") {
//				// 커서를 왼쪽으로 한칸 옮기기 
//				right.push(left.pop());
//				
//			} else if(text == "D") {
//				// 커서를 오른쪽으로 한칸 옮김
//				left.push(right.pop());
//				
//			} else if(text == "B") {
//				// 커서 왼쪽에 있는 문자를 삭제
//				left.pop();
//				
//			} else if(text == "P ") { // P $
//				// $라는 문자를 커서 왼쪽에 추가
//				char a = how?
//				left.push(a);
//			}
//		}
//		
//		// 최종 취합
//		// stack 한쪽으로 모아서 뽑아야 하는데... 
//		// 오른쪽 stack으로 모아서 출력 
//		left.push(right.pop());
//		StringBuilder sb = new StringBuilder();
//		sb.append(right);
//		
//		
	}
}
