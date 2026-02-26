package curriculum.c;

/**************************************************
* Javaカリキュラム2.24　プログラム作成1
**************************************************/

public class Show {
	public void showResult( int user , int cpu , String endResult ) {
		String[] jankenList = { "グー" , "チョキ" , "パー" };
		System.out.println();
		System.out.println( "あなた:" + jankenList[user] + "\n" + "CPU:" + jankenList[cpu] );
		
		if(endResult == "勝ち") {
			System.out.println();
			System.out.println( "結果:" + endResult + "->じゃんけん終了" );
			System.out.println();
		}else {
			System.out.println();
			System.out.println( "結果:" + endResult + "->もう一回" );
			System.out.println();
		}
	}
	
	
}
