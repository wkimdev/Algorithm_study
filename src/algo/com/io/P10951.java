package algo.com.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P10951 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String str;
		
		while((str=br.readLine()) != null && str.length()!=0){
			int a=0, b=0;
			
			String[] cal = new String[2];
			cal = str.split(" ");
			a = Integer.parseInt(cal[0]);
			b = Integer.parseInt(cal[1]);
			
			bw.write(Integer.toString(a+b));
			bw.write("\n");
		}
		
		br.close();
		bw.flush();
		bw.close();
	}
}
