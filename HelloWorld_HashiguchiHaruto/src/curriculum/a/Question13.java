package curriculum.a;

/*************************************************
* [概要]Javaカリキュラム2.10 Java基礎問題1 Q13
* [詳細]String text = "私はJavaが大好きです。Javaは楽しい!"
* 　　　という文章の中にある「Java」を「Python」に置き換えて表示する。
*************************************************/

public class Question13 {

	public static void main(String[] args) {
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
