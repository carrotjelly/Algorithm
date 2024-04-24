import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {

		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String [] x = br.readLine().split(" ");
		
		int n = Integer.parseInt(x[0]);
		
		int m = Integer.parseInt(x[1]);
		
		String [] y = br.readLine().split(" ");
		
		
		for (int i = 0; i < n; i++) {
			
			int a = Integer.parseInt(y[i]);
			
			if(m > a) {
				bw.write(Integer.toString(a)+" ");
			}
		}
		bw.flush();
		br.close();
		bw.close();
	}
}
