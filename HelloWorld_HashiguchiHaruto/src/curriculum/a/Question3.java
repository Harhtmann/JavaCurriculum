package curriculum.a;

/*************************************************
* [概要]Javaカリキュラム2.8 Java基礎問題1 Q3
* [詳細]値を代入した変数を用いて出力する
*************************************************/

public class Question3 {

	public static void main(String[] args) {
		//変数intNum1を宣言し初期化
		int intNum1 = 11110;
		//変数intNum2を宣言し初期化
		int intNum2 = 20;
		//変数char1を宣言し初期化
		char char1 = 'a';
		//変数lettersを宣言し初期化
		String letters = "ハロー";
		//変数isBooleanを宣言し初期化
		boolean isBoolean = true;
		//変数intNum3を宣言し初期化
		int intNum3 = intNum1 + intNum2;
		//変数longNumを宣言し初期化
		long longNum = 10 * 1000 * 1000 * 1000L;
		//変数doubleNumを宣言し初期化
		double doubleNum = 10.5 / 100;
		//変数intNum4を宣言し初期化
		int intNum4 = 10 - 100;

				
		//11110を出力
		System.out.println( intNum1 );
		//20を出力
		System.out.println( intNum2 );
		//a ハロー trueを出力
		System.out.println( char1 + letters + isBoolean );
		//11130を出力
		System.out.println( intNum3 );
		//1000000000000を出力
		System.out.println( longNum );
		//0.105を出力
		System.out.println( doubleNum );
		//-90を出力
		System.out.println( intNum4 );
	}

}
