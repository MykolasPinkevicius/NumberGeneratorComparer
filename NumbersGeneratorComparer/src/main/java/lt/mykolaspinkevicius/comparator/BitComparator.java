package lt.mykolaspinkevicius.comparator;

/**
 * 
 * @author MykolasPinkevicius
 * @version 1.0
 *
 */

public class BitComparator {

	
	public static Boolean compareBit (Long c, Long d) {
		
		String numberC = Long.toBinaryString(c);
		String numberD = Long.toBinaryString(d);	
		
		if(numberC.length() > 7 && numberD.length() > 7) {
		numberC = numberC.substring(numberC.length()-8);
		numberD = numberD.substring(numberD.length()-8);
		
		if(numberC.equals(numberD)) {
			return true;
		} else {
			return false;
		}
		
		} else {
			return false;
		}
	}
	
	
}
