

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {

		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[] arr = new int[10]; 

	    	for (int i = 0; i < arr.length; i++) {
	            int n = Integer.parseInt(br.readLine());
	            arr[i] = n % 42;
	 
	        }

	    boolean [] remainder = new boolean [42]; // 0~41 나머지값과 중복여부 확인
	    int remainderCount = 0;
	     
	    for(int i = 0; i < arr.length; i++) {
	    	 if(!remainder[arr[i]]) { // 나머지가 처음 등장하는 경우
	    		 remainder[arr[i]] = true;
	    		 remainderCount++;
	    	 }
	     }
	        
	    bw.write(String.valueOf(remainderCount));
	
			
		bw.flush();
		br.close();
		bw.close();
	}
}
