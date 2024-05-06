

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {

		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		
		 boolean[] submitted = new boolean[31]; 

	        for (int i = 0; i < 28; i++) {
	            int n = Integer.parseInt(br.readLine());
	            submitted[n] = true;
	        }


	        for (int i = 1; i <= 30; i++) {
	            if (!submitted[i]) { 
	                bw.write(i + "\n");
	            }
	        }
	
			
		bw.flush();
		br.close();
		bw.close();
	}
}
