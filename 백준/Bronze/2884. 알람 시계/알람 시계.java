import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] str = br.readLine().split(" ");
		
		int x = Integer.parseInt(str[0]);
		int y = Integer.parseInt(str[1]);
		
		if ((0 <= x && x <= 23) && (0 <= y && y <= 59)) {
			
			if(y < 45) {
				
			x--;
			y=60-(45-y);
			
				if(x < 0) {
				x = 23;		
				}
				System.out.println( x + " " + y);
			}else {
			System.out.println( x + " " + (y-45));
			}
		}
		
	}
}
