package curriculum.a;

/*************************************************
* [概要]Javaカリキュラム2.9 Java基礎問題1 Q8
* [詳細]priceをint型に変換し、整数価格:99と
* 　　　コンソールに表示してください。
*************************************************/

public class Question8 {

	public static void main(String[] args) {
		//変数priceの宣言と初期化
		double price = 99.99;
		//変数priceをdoubleからintへ変換
		int priceInt = (int) price;
		
		//"整数価格:99"と表示する。
		System.out.println( "整数価格:" + priceInt );
	}

}
