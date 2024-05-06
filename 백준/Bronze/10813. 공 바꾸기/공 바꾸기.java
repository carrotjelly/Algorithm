
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {

		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String [] index = br.readLine().split(" "); 
		
		int n = Integer.parseInt(index[0]);
		int m = Integer.parseInt(index[1]);
		
		int [] baskets = new int [n + 1];
		
		for(int i = 1 ; i <= n ; i++) {
			baskets[i] = i;
		}
		
		for(int i = 1 ; i <= m ; i++) {
			
			String [] line = br.readLine().split(" ");
			
			int firBall = Integer.parseInt(line[0]);
			int secBall = Integer.parseInt(line[1]);
			
		
			int temp;
			
			temp = baskets[firBall];
			baskets[firBall] = baskets[secBall];
			baskets[secBall] = temp;
			
					
		}
		
		for(int j = 1 ; j <= n; j++) {
			bw.write(baskets[j]+" ");
		}
		
		bw.flush();
		br.close();
		bw.close();
	}
}
