
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
		int c = Integer.parseInt(br.readLine());

		if ((0 <= x && x <= 23) && (0 <= y && y <= 59) && (0 <= c && c <= 1000)) {

			y += c;

			if (y >= 60) {
				x = x + (y / 60);
				y = y % 60;

				if (x >= 24) {
					x -= 24;

				}
			}
			System.out.println(x + " " + y);
		} else {
			System.out.println("잘못된입력");
		}
	}

}
