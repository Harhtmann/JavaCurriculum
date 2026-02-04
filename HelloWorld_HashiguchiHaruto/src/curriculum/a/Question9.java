package curriculum.a;

/*************************************************
* [概要]Javaカリキュラム2.9 Java基礎問題1 Q9
* [詳細]変数後の値:の後ろにnumStr + 10した結果を
* 　　　コンソールに表示する。
*************************************************/

public class Question9 {

	public static void main(String[] args) {
		//変数numStrの宣言と初期化
		String numStr = "123";
		//変数numStrをStringからintへ変換
		int num = Integer.parseInt(numStr);
		//変数numへ10を加える
		num += 10;
		
		//”変換後の値:”の後にnumStr + 10した結果を表示する。
		System.out.println( "変換後の値:" + num );
	}

}
