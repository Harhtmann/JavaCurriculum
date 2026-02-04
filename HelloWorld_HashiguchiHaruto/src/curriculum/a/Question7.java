package curriculum.a;

/*************************************************
* [概要]Javaカリキュラム2.8 Java基礎問題1 Q7
* [詳細]変数scoreへ20を加え"最終スコア：100"をコンソールへ
* 　　　表示する。
*************************************************/

public class Question7 {

	public static void main(String[] args) {
		//変数scoreの宣言と初期化
		int score = 80;
		
		//scoreへ20を加える
		score += 20;
		
		//最終スコアをコンソールへ表示する。
		System.out.println( "最終スコア:" + score );
	}

}
