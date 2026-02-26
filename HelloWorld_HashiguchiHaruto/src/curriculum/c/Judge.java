package curriculum.c;

/**************************************************
* Javaカリキュラム2.24　プログラム作成1
**************************************************/

public class Judge {
	public String judgeJanken( int user , int cpu ) {
		String result = "";
		
		if( (user == 0 && cpu == 1) || (user == 1 && cpu == 2) || (user == 2 && cpu == 0) ) {
			result = "勝ち";
		}else if( (user == 0 && cpu == 2) || (user == 1 && cpu == 0) || (user == 2 && cpu == 1) ) {
			result = "負け";
		}else {
			result = "あいこ";
		}
		
		return result;
		
	}
}
