

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {

		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String [] input = br.readLine().split(" ");
		
		int n = Integer.parseInt(input[0]);
		int m = Integer.parseInt(input[1]);
		
		int [] baskets = new int [n + 1];
		
		for(int i = 1 ; i <= m ; i++) {
			String [] line = br.readLine().split(" ");
			int start = Integer.parseInt(line[0]);
			int end = Integer.parseInt(line[1]);
			int ball = Integer.parseInt(line[2]);
			
			for(int j = start; j <= end; j++ ) {
				baskets[j] = ball;
					
				}
			}
		
		  for (int i = 1; i <= n ; i++) {
	            bw.write(baskets[i] + " ");
		}
		
		bw.flush();
		br.close();
		bw.close();
	}
}
