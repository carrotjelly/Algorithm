import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
				
		int c = Integer.parseInt(br.readLine());

		for(int i = 0 ; i < c; i++){
			String [] a = br.readLine().split(" ");
			
			int x = Integer.parseInt(a[0]);
			int y = Integer.parseInt(a[1]);
			
			bw.write(x+y+"\n");
			
		}
		
		bw.flush();
		bw.close();
	}
}
