package curriculum.i;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**************************************************
* Javaカリキュラム2.22　基礎問題6　Q5　ポリモーフィズム
**************************************************/

public class Main {

	public static void main(String[] args) {
		//インスタンス（多態性）
		Employee fE = new FullTimeEmployee( "E001", "full" );
		Employee cE = new ContractEmployee( "E002", "part" );
		
		//FullTimeEmployee リスト
		List<String> fEmployee = new ArrayList<String>(); 
		fEmployee.add(" FullTimeEmployee1 ");
		fEmployee.add(" FullTimeEmployee2 ");
		fEmployee.add(" FullTimeEmployee3 ");
		
		//ContractEmployee リスト
		List<String> cEmployee = new ArrayList<String>();		
		cEmployee.add(" ContractEmployee1 ");
		cEmployee.add(" ContractEmployee2 ");
		cEmployee.add(" ContractEmployee3 ");
		
		//5 ～ 10 の乱数を生成
		int min = 5;
		int max = 10;
		int hours = new Random().nextInt(max - min + 1) + min;
		
		//for-each 正社員給料データ　出力
		fEmployee.forEach(str -> {
		    System.out.println(str + ":" + fE.calculateDailyWage(hours));
		});
		
		System.out.println(""); //改行
		
		//for-each 契約社員給料データ　出力
		cEmployee.forEach(str -> {
		    System.out.println(str + ":" + cE.calculateDailyWage(hours));
		});
	}

}
