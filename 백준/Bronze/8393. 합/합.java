

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int x = Integer.parseInt(br.readLine());
		int sum = 0;
		br.close();
				
		for(int y = 0; y < x ; y++) {
			
			sum += y+1;
						
			
		}
		System.out.println(sum);
	}
}
