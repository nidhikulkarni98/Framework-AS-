package Generic_utility;

import java.util.Random;

/**
 * This method is used to return Random Number
 */

public class Java_utility {
	
	public int returnRandomNumber() {
		Random ran = new Random();
		int ranNum = ran.nextInt(1000);
		return ranNum;
	}

}
