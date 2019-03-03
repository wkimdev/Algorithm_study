package algo.com.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class p10953 {
	
	/*
	 * 
	5
	1,1
	2,3
	3,4
	9,8
	5,2
	*/
	public static void main(String[] args) throws IOException {
		// 버퍼리더로 읽고, 
		// StringTokenizer로 nextTokn으로 문자를 하나씩 띄어서 parseint로 바꾼다음 더해서 리스펀스 시킨다. 
		// 애초에 스트링으로 처리해서 parseint로 시키는게 힌트였던 듯. 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < n; i++) {
			String str = br.readLine();
			String str2 = str.replace(",", " ");
			StringTokenizer str3 = new StringTokenizer(str2);
			System.out.println(Integer.parseInt(str3.nextToken())+Integer.parseInt(str3.nextToken()));
//			System.out.println(Integer.parseInt(str3.nextToken()));
//			
		}
	}

}
