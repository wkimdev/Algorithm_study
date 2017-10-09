package com.home.test;

import java.util.Scanner;

public class P11053 {
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		
		//첫 행 입력
		int n = sc.nextInt();
		int a[] = new int[n];
		
		//두 번째 행 입력
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		
		//가장 긴 증가하는 부분 수열 길이 출력
		// j <i 만족, 
		//수열의 길이가 들어갈 d배열의 값 크기에 n을 할당
		int d[] = new int[n];
		for (int i = 0; i < n; i++) {
			//최소 수열 길이 1
			d[i] = 1;
			//j와 i를 비교하여, i가 더 크면 수열길이 +1
			for (int j = 0; j < i; j++) {
				//a[j] < a[i]를 만족하면, 수열의 길이 1에서 전의 수열길이에 1을 더함
				if (a[j] < a[i] && d[i] < d[j] + 1) {
					d[i] = d[j] + 1; 
				}
			}
		}
		
		//d[]배열에서 최댓값을 출력하기 => 그냥 출력하면 정렬안되서 출력됨
		//정렬해서 출력하기
		int ans = d[0];
		for (int i = 0; i < n; i++) {
			if (ans < d[i]) {
				ans = d[i];
			}
		}
		System.out.println(ans);
	}
}

