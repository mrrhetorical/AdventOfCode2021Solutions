import java.util.*;
import java.io.*;

public class dive_b {
	
	public static void main(String[] args) throws Exception {
		File file = new File("dive_input.txt");

		Scanner scanner = new Scanner(file);

		int[] coords = {0, 0};

		int aim = 0;

		Instruction instr;
		int arg;

		while (scanner.hasNextLine()) {
			String str = scanner.nextLine();
			String[] split = str.toUpperCase().split(" ");
			instr = Instruction.valueOf(split[0]);
			arg = Integer.parseInt(split[1]);

			switch (instr) {
				case FORWARD:
					coords[0] += arg;
					coords[1] += arg * aim;
					break;
				case UP:
					aim -= arg;
					break;
				case DOWN:
					aim += arg;
					break;
			}
		}

		System.out.println("Final position: (" + coords[0] + ", " + coords[1] + ")");
		System.out.println("Depth * Horizontal = " + coords[0] * coords[1]);
	}


	enum Instruction {
		FORWARD, UP, DOWN
	}

}