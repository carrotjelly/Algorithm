import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		if(n % 4 == 0) {
			for(int i = 4; i <= n ; i += 4) {
				System.out.print("long ");
				
			}
			
			System.out.println("int");
		}
	}
}
