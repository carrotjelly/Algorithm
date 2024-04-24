

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {

		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		

		int n = Integer.parseInt(br.readLine());

		
		String [] x = br.readLine().split(" ");
		
		int min = Integer.parseInt(x[0]);
		
		int max = Integer.parseInt(x[0]);
		
		for (int i = 1; i < n; i++) {
			
			int a = Integer.parseInt(x[i]);
			
			if(min > a) {
				min = a;
			}
				
			if(max < a) {
				max = a;
				
			}
		}
		
		bw.write(min+" "+max);

		bw.flush();
		br.close();
		bw.close();
	}
}
