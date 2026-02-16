package curriculum.h;

/**************************************************
* Javaカリキュラム2.22　基礎問題6　Q4　継承
**************************************************/

public class Main {

	public static void main(String[] args) {
		//インスタンス化
		FullTimeEmployee fE = new FullTimeEmployee( "E001" , "full" );
		PartTimeEmployee pE = new PartTimeEmployee( "E002" , "part" );
		
		int hours = 9;
		
		//表示
		System.out.println( " 正社員の給与: " + fE.calculateDailyWage(hours) + "円");
		System.out.println( " パート社員の給与: " + pE.calculateDailyWage(hours) + "円");
	}

}