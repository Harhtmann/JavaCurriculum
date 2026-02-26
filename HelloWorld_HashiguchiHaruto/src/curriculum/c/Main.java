package curriculum.c;

/**************************************************
* Javaカリキュラム2.24　プログラム作成1
* 詳細　じゃんけんプログラム
* 参考URL（https://ict-skillup.com/java/1107/#toc3）
**************************************************/

public class Main {

	public static void main(String[] args) {
		
		String endResult = "負け";
		
		//インスタンス生成
		User userIns = new User();
		Cpu cpuIns = new Cpu();
		Judge jIns = new Judge();
		Show sIns= new Show();
		
		while((endResult == "負け") || (endResult == "あいこ")) {
			//プレイヤー側の手を取得
			int user = userIns.getUser();
			
			//プレイヤーが3：終了を選択した場合、プログラム終了
			if(user == 3) {
				System.out.println();
				System.out.println( "3:終了が入力されました。" );
				System.out.println( "プログラムを終了します。" );
				System.out.println();
				break;
			}
			
			//CPU側の手を取得
			int cpu = cpuIns.getCpu();
			
			//勝敗の判定出力
			endResult = jIns.judgeJanken( user , cpu );
			
			//じゃんけん結果出力
			sIns.showResult( user , cpu , endResult );
		}
	}

}
