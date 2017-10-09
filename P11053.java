package com.home.test;

import java.util.Scanner;

public class P11053 {
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		
		//ù �� �Է�
		int n = sc.nextInt();
		int a[] = new int[n];
		
		//�� ��° �� �Է�
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		
		//���� �� �����ϴ� �κ� ���� ���� ���
		// j <i ����, 
		//������ ���̰� �� d�迭�� �� ũ�⿡ n�� �Ҵ�
		int d[] = new int[n];
		for (int i = 0; i < n; i++) {
			//�ּ� ���� ���� 1
			d[i] = 1;
			//j�� i�� ���Ͽ�, i�� �� ũ�� �������� +1
			for (int j = 0; j < i; j++) {
				//a[j] < a[i]�� �����ϸ�, ������ ���� 1���� ���� �������̿� 1�� ����
				if (a[j] < a[i] && d[i] < d[j] + 1) {
					d[i] = d[j] + 1; 
				}
			}
		}
		
		//d[]�迭���� �ִ��� ����ϱ� => �׳� ����ϸ� ���ľȵǼ� ��µ�
		//�����ؼ� ����ϱ�
		int ans = d[0];
		for (int i = 0; i < n; i++) {
			if (ans < d[i]) {
				ans = d[i];
			}
		}
		System.out.println(ans);
	}
}

