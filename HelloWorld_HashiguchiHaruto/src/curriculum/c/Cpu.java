package curriculum.c;

/**************************************************
* Javaカリキュラム2.24　プログラム作成1
**************************************************/

import java.util.Random;

public class Cpu {
	public int getCpu() {
		Random rand = new Random();
		return rand.nextInt(3);
	}

}
