import java.util.*;
import java.io.*;

public class sonar_sweep {

	public static void main(String[] args) throws Exception {
		File file = new File("sonar_sweep_input.txt");
		if (!file.exists()) {
			throw new IOException("File doesn't exist!");
		}

		Scanner scanner = new Scanner(file);

		int count = 0;
		int prev = scanner.nextInt();
		while (scanner.hasNextInt()) {
			int current = scanner.nextInt();
			if (current > prev)
				count++;
			prev = current;
		}

		System.out.println("Value: " + count);
	}

}