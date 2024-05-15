
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {

		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String [] arr = br.readLine().split(" ");
		
		int n = Integer.parseInt(arr[0]);
		int m = Integer.parseInt(arr[1]);
		
		int [] basket = new int [n];
		
		for(int i = 0; i < n; i++) {
			basket[i] = i+1;
		}
		
		for(int i = 0; i < m; i++) {
			String [] arr2 = br.readLine().split(" ");
			int first = Integer.parseInt(arr2[0]) -1;
			int last = Integer.parseInt(arr2[1]) -1;
			
			while(first < last) {
				int temp = basket[first];
				basket[first] = basket[last];
				basket[last] = temp;
				first++;
				last--;
			}
			
			
		}		
		for(int i = 0; i < n; i++) {
			bw.write(basket[i] + " ");
		}
		
		bw.flush();
		br.close();
		bw.close();
	}
}
