
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
		
		String [] scoreIndex = br.readLine().split(" ");
		
		
		int max = Integer.parseInt(scoreIndex[0]);
		
		
		
		for(int i = 0 ; i < n ; i++) {
			int score = Integer.parseInt(scoreIndex[i]);
			
			if(score > max) {
				max = score;
			
			}
			
			
			
		}
			
		double sum = 0;
		
		for(int i = 0 ; i < n; i++) {
			
			int score = Integer.parseInt(scoreIndex[i]);
			
			double newScore = (double)score/max*100;
		
			scoreIndex[i] = String.valueOf(newScore); 
            
			sum += newScore;
			
		}
		
		double average = sum/n;

		bw.write(String.valueOf(average));
			
		bw.flush();
		br.close();
		bw.close();
	}
}
