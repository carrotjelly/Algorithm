

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] str = br.readLine().split(" ");

		int x = Integer.parseInt(str[0]);
		int y = Integer.parseInt(str[1]);
		int z = Integer.parseInt(str[2]);

		if (x != y && y != z && x != z) {
			int max = Math.max(x, (Math.max(y, z)));
			System.out.println(max*100);
		} else if (x == y && y == z) {
			System.out.println(10000 + (y * 1000));
		} else if (x == y || x == z) {
			System.out.println(1000 + (x * 100));
		} else {
			System.out.println(1000 + (y * 100));
		}

	}
}
