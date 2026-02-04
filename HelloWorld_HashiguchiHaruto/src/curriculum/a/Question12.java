package curriculum.a;

/*************************************************
* [概要]Javaカリキュラム2.10 Java基礎問題1 Q12
* [詳細]条件演算子(参考演算子)を使用して以下の結果を表示する。
* 　　　int型の変数xに15を代入
* 　　　xが10以上なら"OK"、そうでなければ"NG"を表示する。
*************************************************/

public class Question12 {

	public static void main(String[] args) {
		//変数xの宣言と初期化
		int x = 15;
		//"OK"か"NG"か処理
		String a = x > 10 ? "OK" : "NG";
		
		//結果表示
		System.out.println( a );
	}

}
