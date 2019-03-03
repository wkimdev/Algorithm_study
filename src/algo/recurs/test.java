package algo.recurs;

public class test {
	
	  public static int[] d;

	    public int solution(int N) {
	       
	      int arr[] = new int[N]; // 17
			int cal = 0;
			int ans = 0;
			for (int i = 0; i < arr.length; i++) {
				d = new int[i+1];
				cal = recurf(i);
				arr[i] = cal;
				if(arr[i] >= N) {
					//System.out.println(i-1);
					ans = i-1;
					return ans;
				}
			}
			return ans;

	    }
	    

	    public static int recurf(int k) {
			int ans = 0;
			
			if( k == 0) {
				d[k] = k;
				return k;
			}
			if( k == 1 ) {
				d[k] = k;
				return k;
			}
			d[k] = recurf(k-1) + k;
			
			return d[k];
		}

	 
}
