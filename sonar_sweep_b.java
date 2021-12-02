import java.util.*;
import java.io.*;

public class sonar_sweep_b {

	public static void main(String[] args) throws Exception {
		File file = new File("sonar_sweep_b_input.txt");
		if (!file.exists()) {
			throw new IOException("File doesn't exist!");
		}

		Scanner scanner = new Scanner(file);

		int count = 0;
		int pMin2 = scanner.nextInt(),
			pMin1 = scanner.nextInt(),
			p = scanner.nextInt();

		while (scanner.hasNextInt()) {
			int next = scanner.nextInt();
			if (pMin1 + p + next > pMin2 + pMin1 + p) {
				count++;
			}
			pMin2 = pMin1;
			pMin1 = p;
			p = next;
		}



		System.out.println("Value: " + count);
	}

}