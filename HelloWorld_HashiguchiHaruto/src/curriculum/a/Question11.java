package curriculum.a;

/*************************************************
* [概要]Javaカリキュラム2.10 Java基礎問題1 Q11
* [詳細]次䛾条件を満たすプログラムを条件演算子を使用して作成する。
　　　　int型の変数aに10を代入
　　　　int型の変数bに20を代入
　　　　aがbより小さいかどうかをboolean変数resultに代入
　　　　resultの値を表示
*************************************************/

public class Question11 {

	public static void main(String[] args) {
		//変数を宣言し初期化
		int a = 10;
		//変数を宣言し初期化
		int b = 20;
		//変数を宣言しaがbより小さいかどうかを代入
		boolean result = (a < b);
		
		//resultの値を表示
		System.out.println( result );
	}

}
