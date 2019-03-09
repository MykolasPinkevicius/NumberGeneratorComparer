package lt.mykolaspinkevicius.NumbersGeneratorComparer;


import java.util.Scanner;

import lt.mykolaspinkevicius.comparator.BitComparator;
import lt.mykolaspinkevicius.generator.Generator;

/**
 * @author MykolasPinkevicius
 * @version 1.0
 * 
 */

public class App {
	public static void main(String[] args) {
		
		int matches = 0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please input first two numbers to start bit comparing application");
		
		Long[] generatedNewNumbers = Generator.numbersGenerator(
				scan.nextLong(),
				scan.nextLong()
				);

		scan.close();
		
		for (int i = 0; i < 1000000; i++) {
			if (BitComparator.compareBit(generatedNewNumbers[0], generatedNewNumbers[1]).equals(true)) {
				matches++;
			}
			
			generatedNewNumbers = Generator.numbersGenerator(generatedNewNumbers[0], generatedNewNumbers[1]);
		}
		
		System.out.println("Last 8 bits matched " + matches + " times");
	}
}
