package curriculum.j;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**************************************************
* Javaカリキュラム2.22　基礎問題6　Q6　インターフェイスと抽象クラス
**************************************************/

public class Main {

	public static void main(String[] args) {
		//インスタンス（多態性）
		Billable fE = new FullTimeEmployee( "E001" , "full" );
		Billable cE = new ContractEmployee( "E002" , "cont" );
		
		//FullTimeEmployee リスト
		List<String> fBillable = new ArrayList<String>(); 
		fBillable.add(" FullTimeEmployee1 ");
		fBillable.add(" FullTimeEmployee2 ");
		fBillable.add(" FullTimeEmployee3 ");
		
		//ContractEmployee リスト
		List<String> cBillable = new ArrayList<String>();		
		cBillable.add(" ContractEmployee1 ");
		cBillable.add(" ContractEmployee2 ");
		cBillable.add(" ContractEmployee3 ");
		
		//5 ～ 10 の乱数を生成
		int min = 5;
		int max = 10;
		int hours = new Random().nextInt(max - min + 1) + min;
		
		//for-each 正社員給料データ　出力
		fBillable.forEach(str -> {
		    System.out.println(str + ":" + fE.costForDay(hours) );
		});
		
		System.out.println(""); //改行
		
		//for-each 契約社員給料データ　出力
		cBillable.forEach(str -> {
		    System.out.println(str + ":" + cE.costForDay(hours));
		});
	}

}
