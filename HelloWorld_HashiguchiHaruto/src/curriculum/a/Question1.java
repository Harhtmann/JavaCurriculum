package curriculum.a;

public class Question1 {

	public static void main(String[] args) {
		/*********************************************
		 * [概要]Javaカリキュラム2.7 Java基礎問題1 Q1
		 * [詳細]指定された変数の宣言と初期値の設定
		 *********************************************/
		//変数byteNum1の初期値設定
		byte byteNum1 = 1;
		//変数shortNum1の初期値設定
		short shortNum1 = 1;
		//変数intNum1の初期値設定
		int intNum1 = 1;
		//変数longNum1の初期値設定
		long longNum1 = 1;
		//変数floatNum1の初期値設定
		float floatNum1 = 1;
		//変数doubleNum1の初期値設定
		double doubleNum1 = 1;
		//変数letter1の初期値設定
		char letter1 = 1;
		//変数letters1の初期値設定
		String letters1 = "letters";
		//変数isBooleanの初期値設定
		boolean isBoolean1 = false;
		
		/*************************************************
		 * [概要]Javaカリキュラム2.7 Java基礎問題1 Q2
		 * [詳細]Q1で宣言した変数へ指定された値を代入する
		 *************************************************/
		//変数byteNum2の初期値設定
		byte byteNum2 = 1;
		//変数byteNum2に10を代入
		byteNum2 = 10;
		//変数shortNum2の初期値設定
		short shortNum2 = 1;
		//変数shortNum2に100を代入
		shortNum2 = 100;
		//変数intNum2の初期値設定
		int intNum2 = 1;
		//変数intNum2に1000を代入
		intNum2 = 1000;
		//変数longNum2の初期値設定
		long longNum2 = 1;
		//変数longNum2に10000を代入
		longNum2 = 10000;
		//変数floatNumQ2の初期値設定
		float floatNum2 = 1;
		//変数floatNum2に9.5fを代入
		floatNum2 = 9.5f;
		//変数doubleNum2の初期値設定
		double doubleNum2 = 1;
		//変数doubleNum2に10.5を代入
		doubleNum2 = 10.5;
		//変数letter2の初期値設定
		char letter2 = '1';
		//変数letter2に"a"を代入
		letter2 = 'a';
		//変数letters12の初期値設定
		String letters2 = "letters";
		//変数letters2Q2に"ハロー"を代入
		String letters3 = "ハロー";
		//変数isBoolean2の初期値設定
		boolean isBoolean2 = false;
		//変数isBoolean2にtrueを代入
		isBoolean2 = true;
		
		/*************************************************
		* [概要]Javaカリキュラム2.8 Java基礎問題1 Q3
		* [詳細]値を代入した変数を用いて出力する
		*************************************************/
		//変数intNum1Q3を宣言し初期化
		int intNum3 = 11110;
		//変数intNum2Q3を宣言し初期化
		int intNum4 = 20;
		//変数letter3を宣言し初期化
		char letter3 = 'a';
		//変数letters4を宣言し初期化
		String letters4 = "ハロー";
		//変数isBoolean3を宣言し初期化
		boolean isBoolean3 = true;
		//変数intNum5を宣言し初期化
		int intNum5 = intNum3 + intNum4;
		//変数longNum3を宣言し初期化
		long longNum3 = 10 * 1000 * 1000 * 1000L;
		//変数doubleNum3を宣言し初期化
		double doubleNum3 = 10.5 / 100;
		//変数intNum6を宣言し初期化
		int intNum6 = 10 - 100;

				
		//11110を出力
		System.out.println( intNum3 );
		//20を出力
		System.out.println( intNum4 );
		//a ハロー trueを出力
		System.out.println( letter3 + letters4 + isBoolean3 );
		//11130を出力
		System.out.println( intNum5 );
		//1000000000000を出力
		System.out.println( longNum3 );
		//0.105を出力
		System.out.println( doubleNum3 );
		//-90を出力
		System.out.println( intNum6 );
		
		/*************************************************
		* [概要]Javaカリキュラム2.8 Java基礎問題1 Q4
		* [詳細]コンソールに"こんにちは、山田太郎さん！"と
		* 　　　表示させる。
		*************************************************/
		//変数nameの宣言と初期化
		String name = "山田太郎";
		
		//コンソールへ"こんにちは、山田太郎さん！"と表示する
		System.out.println( "こんにちは、" + name + "さん！" );
		
		/*************************************************
		* [概要]Javaカリキュラム2.8 Java基礎問題1 Q5
		* [詳細]コンソールに"年齢：25歳"と表示させる。
		*************************************************/
		//変数ageの宣言と初期化
		int age = 25;
		
		//コンソールに"年齢：25歳"と表示する。
		System.out.println("年齢：" + age + "歳");
		
		/*************************************************
		* [概要]Javaカリキュラム2.8 Java基礎問題1 Q6
		* [詳細]変数num1、num2を足した結果をコンソールへ
		* 　　　表示する。
		*************************************************/
		//変数num1、num2の宣言と初期化
		int num1 = 10;
		int num2 = 5;
		
		//変数num1、num2を足した結果をコンソールへ表示する。
		System.out.println( num1 + num2 );
		
		/*************************************************
		* [概要]Javaカリキュラム2.8 Java基礎問題1 Q7
		* [詳細]変数scoreへ20を加え"最終スコア：100"をコンソールへ
		* 　　　表示する。
		*************************************************/
		//変数scoreの宣言と初期化
		int score = 80;
		
		//scoreへ20を加える
		score += 20;
		
		//最終スコアをコンソールへ表示する。
		System.out.println( "最終スコア:" + score );
		
		/*************************************************
		* [概要]Javaカリキュラム2.9 Java基礎問題1 Q8
		* [詳細]priceをint型に変換し、整数価格:99と
		* 　　　コンソールに表示してください。
		*************************************************/
		//変数priceの宣言と初期化
		double price = 99.99;
		//変数priceをdoubleからintへ変換
		int priceInt = (int) price;
		
		//"整数価格:99"と表示する。
		System.out.println( "整数価格:" + priceInt );
		
		/*************************************************
		* [概要]Javaカリキュラム2.9 Java基礎問題1 Q9
		* [詳細]変数後の値:の後ろにnumStr + 10した結果を
		* 　　　コンソールに表示する。
		*************************************************/
		//変数numStrの宣言と初期化
		String numStr = "123";
		//変数numStrをStringからintへ変換
		int num3 = Integer.parseInt(numStr);
		//変数numへ10を加える
		num3 += 10;
		
		//”変換後の値:”の後にnumStr + 10した結果を表示する。
		System.out.println( "変換後の値:" + num3 );
		
		/*************************************************
		* [概要]Javaカリキュラム2.9 Java基礎問題1 Q10
		* [詳細]int型の変数numをString型へ変換し、"得点50点"を
		* 　　　表示する。
		*************************************************/
		//変数numを宣言し初期化
		int num4 = 50;
		//変数numをintからString型へ変換する
		String str = String.valueOf( num4 );
		
		//"得点50点"を表示する。
		System.out.println( "得点:" + str );
		
		/*************************************************
		* [概要]Javaカリキュラム2.10 Java基礎問題1 Q11
		* [詳細]次䛾条件を満たすプログラムを条件演算子を使用して作成する。
		　　　　int型の変数aに10を代入
		　　　　int型の変数bに20を代入
		　　　　aがbより小さいかどうかをboolean変数resultに代入
		　　　　resultの値を表示
		*************************************************/
		//変数を宣言し初期化
		int a = 10;
		//変数を宣言し初期化
		int b = 20;
		//変数を宣言しaがbより小さいかどうかを代入
		boolean result = (a < b);
		
		//resultの値を表示
		System.out.println( result );
		
		/*************************************************
		* [概要]Javaカリキュラム2.10 Java基礎問題1 Q12
		* [詳細]条件演算子(参考演算子)を使用して以下の結果を表示する。
		* 　　　int型の変数xに15を代入
		* 　　　xが10以上なら"OK"、そうでなければ"NG"を表示する。
		*************************************************/
		//変数xの宣言と初期化
		int x = 15;
		//"OK"か"NG"か処理
		String c = x > 10 ? "OK" : "NG";
		
		//結果表示
		System.out.println( c );
		
		/*************************************************
		* [概要]Javaカリキュラム2.10 Java基礎問題1 Q13
		* [詳細]String text = "私はJavaが大好きです。Javaは楽しい!"
		* 　　　という文章の中にある「Java」を「Python」に置き換えて表示する。
		*************************************************/
		//変数textを宣言し初期化
		String text = "私はJavaが大好きです。Javaは楽しい!";
		
		//変数textの文字列置換前を表示する。
		System.out.println( text );
		
		//変数textの文字列「Java」を「Python」に変換
		String newtext = text.replace("Java", "Python"); 
		
		//変数textの文字列置換後を表示する。
		System.out.println( newtext );
		
	}

}