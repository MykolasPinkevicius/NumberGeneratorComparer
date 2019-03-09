package lt.mykolaspinkevicius.generator;

/**
*	@author MykolasPinkevicius
*	@version 1.0
*/

public class Generator {

	private static final int CONSTANTA_A = 16807;
	private static final int CONSTANTA_B = 48271;
	private static final int CONSTANTA_DIVIDE = 2147483647;

	public static Long[] numbersGenerator (Long a, Long b) {
			
		Long numberA = ((CONSTANTA_A * a) % CONSTANTA_DIVIDE);
		Long numberB = ((CONSTANTA_B * b) % CONSTANTA_DIVIDE);
		
		Long[] numbersArray = new Long[2];
		numbersArray[0] = numberA;
		numbersArray[1] = numberB;
		
		return numbersArray;
	}

}
