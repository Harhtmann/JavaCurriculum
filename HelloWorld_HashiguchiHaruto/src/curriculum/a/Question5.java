package curriculum.a;

import utils.Animal;
import utils.Greeting;

public class Question5 {
	
	//Javaカリキュラム2.21 Java基礎問題5 Q1
	//HelloWorld メソッド
	public static void helloWorld() {
		//表示
		System.out.println( "Hello, World!" );
	}
	
	//Javaカリキュラム2.21 Java基礎問題5 Q2
	//doubleValueメソッド
	public static int doubleValue( int num ) {
		//引数を2倍
		return num * 2;
	}
	
	//Javaカリキュラム2.21 Java基礎問題5 Q3
	//isEvenメソッド
	public static boolean isEven( int num ) {
		//偶数か判定
		return num % 2 == 0;
		
	}
	
	
	
	//mainクラス
	public static void main(String[] args) {
		/*********************************************
		 * [概要]Javaカリキュラム2.21 Java基礎問題5 Q1
		 * [詳細]メソッドhelloWorldを作成
		 * 　　　引数なし、戻り値なしでHelloWorldを表示
		 *********************************************/
		//greetメソッド
		helloWorld();
		
		/*********************************************
		 * [概要]Javaカリキュラム2.21 Java基礎問題5 Q1
		 * [詳細]メソッドdoubleValue、引数：int num,戻り値：整数(引数の2倍)
		 * 　　　10を2倍すると20です。と表示する
		 *********************************************/
		//doubleValueメソッド
		int ans = doubleValue( 10 );
		
		//表示
		System.out.println( "10を2倍すると" + ans + "です。" );
		
		/*********************************************
		 * [概要]Javaカリキュラム2.21 Java基礎問題5 Q3
		 * [詳細]メソッドisEven,引数（整数）、戻り値true(偶数なら),false(奇数なら)
		 * 　　　num1=7、num2=10
		 * 　　　戻り値true　10は偶数です。
		 * 　　　戻り値false　7は奇数です。と表示する
		 *********************************************/
		//変数宣言
		int num1 = 7;
		int num2 = 10;
		
		//isEvenメソッド
		Boolean isEven1 = isEven( num1 );
		Boolean isEven2 = isEven( num2 );
		
		//num1表示
		if( isEven1 == true ) {
			System.out.println( num1 + "は偶数です" );
		}else {
			System.out.println( num1 + "は奇数です" );
		}
		
		//num2表示
		if( isEven2 == true ) {
			System.out.println( num2 + "は偶数です" );
		}else {
			System.out.println( num2 + "は奇数です" );
		}
		
		/*********************************************
		 * [概要]Javaカリキュラム2.21 Java基礎問題5 Q4
		 * [詳細]Greetingクラス　sayHello()メソッドを持ち、"こんにちは！"を表示する
		 * 　　　Mainメソッド　Greetingクラスインポート(3行目)しsayHell()を実行する
		 *********************************************/
		//sayHello実行
		Greeting.sayHello();
		
		/*********************************************
		 * [概要]Javaカリキュラム2.1 Java基礎問題5 Q5
		 * [詳細]Animaljava 動物名、体長、速度の変数（getter,setterを使う）
		 * 　　　Main.java 動物名、体長、速度変数の中身を設定、出力処理
		 * 　　　動物名：ライオン、体長：2.1m、速度：80km/hで表示する
		 *********************************************/
		//インスタンス化
		Animal animal = new Animal();
		
		//引数入力
		animal.setName( "ライオン" );
		animal.setBody( 2.1 );
		animal.setSpeed( 80 );
		
		//表示
		System.out.println( "動物名:" + animal.getName() );
		System.out.println( "体調:" + animal.getBody() + "m" );
		System.out.println( "速度:" + animal.getSpeed() + "km/h" );

	}

}
