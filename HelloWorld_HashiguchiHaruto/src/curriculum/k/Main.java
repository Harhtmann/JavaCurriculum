package curriculum.k;

import java.util.Random;

/**************************************************
* Javaカリキュラム2.22　基礎問題6　Q7　オブジェクト指向尾設計原則(SOLID)
* 詳細：SOLIDの原則に従い、悪い例文をリファクタリングする
**************************************************/

/**************************************************
* ●リファクタリング前
* 　単一責任化されておらず、可読性が低い
* 　SalaryCaluculator.java　出力、社員の給料算出
* 　Employee.java　変数に型を持たせる
* 
* ●2026/02/16 リファクタリング後
* 　全体　単一責任を持たせるため、下記の通りに構造を変更
* 　Main.java　出力機能
* 　Employee.java　継承クラス
* 　Billables.java　給料算出と従業員名設定用インターフェイス
* 　FullTimeSalary.java　正社員給料算出と名前設定用サブクラス
* 　ContractSalary.java　契約社員給料算出と名前設定用サブクラス
**************************************************/

public class Main {

	public static void main(String[] args) {
		//5 ～ 10 の乱数を生成
		int min = 5;
		int max = 10;
		int hours = new Random().nextInt(max - min + 1) + min;
		
		//正社員（fulltime）と契約社員（contract）の名前を設定
		String fName = "full" ;
		String cName = "cont" ;
		
		//インスタンス（多態性）
		Billables fS = new FullTimeSalary( "full" , "fulltime" , hours );
		Billables cS = new ContractSalary( "cont" , "contract" , hours );
		
		//正社員給料データ　出力
		System.out.println( fS.eName(fName) + "の給料は" + fS.costForDay(hours) + "円" );
		
		System.out.println(""); //改行
		
		//契約社員給料データ　出力
		System.out.println( cS.eName(cName) +  "の給料は" + cS.costForDay(hours) + "円" );
	}

}
