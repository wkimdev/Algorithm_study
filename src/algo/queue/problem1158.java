package algo.queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// https://www.acmicpc.net/problem/1158
// 280240KB	548ms
public class problem1158 {
	
	// 7 3
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		StringBuilder sb = new StringBuilder();
		sb.append("<");
		
		Queue<Integer> queue = new LinkedList<Integer>();
		for (int i = 1; i <= n; i++) {
			// 객체 넣기 
			queue.offer(i);
		}
		for (int i = 0; i < n-1; i++) {
			for (int j = 0; j < m-1; j++) {
				// 객체 빼고, 넣기
				queue.offer(queue.poll());
			}
			// 객체 빼기 
			sb.append(queue.poll()+", ");
		}
		sb.append(queue.poll() + ">");
		System.out.println(sb);
		
	}
	
}
