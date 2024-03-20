import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int a = Integer.parseInt(br.readLine());
		
		
		for(int i = 1; i <= a ; i++) {
			
			String [] x = br.readLine().split(" ");
			
			int n = Integer.parseInt(x[0]);
			int m = Integer.parseInt(x[1]);
			
			bw.append("Case #" +i+ ":"+ " "+ n + " "+ "+" + " "+ m +" "+ "="+" "+(n+m)+"\n");
			
			
		}
		bw.flush();
		bw.close();
	}
}