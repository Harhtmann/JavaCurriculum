package curriculum.a;

/*************************************************
* [概要]Javaカリキュラム2.9 Java基礎問題1 Q10
* [詳細]int型の変数numをString型へ変換し、"得点50点"を
* 　　　表示する。
*************************************************/

public class Question10 {

	public static void main(String[] args) {
		//変数numを宣言し初期化
		int num = 50;
		//変数numをintからString型へ変換する
		String str = String.valueOf(num);
		
		//"得点50点"を表示する。
		System.out.println( "得点:" + str );
	}

}
