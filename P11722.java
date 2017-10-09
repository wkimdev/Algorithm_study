package com.home.test;

import java.util.*;
public class P11722 {
	public static void main(String[] args) {
		
		//LIS 의 반대로 풀기
		//수열A를 뒤집어서 가장 긴 증가하는 부분 수열을 구하는 방법
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		
		int d[] = new int[n];
		
		//반대로 이번에는, j > i , a[j] > a[i]
		for (int i = 0; i < n; i++) {
			d[i] = 1;
			for (int j = 0; j < i; j++) {
				if (a[j] > a[i] && d[i] < d[j] + 1) {
					d[i] = d[j] + 1;
				}
			}
		}
		
		//줄어드는 순서대로 정렬된 배열 d의 최댓값
		int ans = d[0];
		for (int i = 0; i < n; i++) {
			if(ans < d[i]) {
				ans = d[i];
			}
		}
		System.out.println(ans);
		
	}

}
