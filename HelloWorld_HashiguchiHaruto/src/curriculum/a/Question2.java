package curriculum.a;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		/*********************************************
		 * [概要]Javaカリキュラム2.11 Java基礎問題2 Q1
		 * [詳細]scoreが60以上なら"合格です!"と表示
		 * [改訂]2026/02/06　17行　if文条件式　変更
		 *********************************************/
		//変数scoreを宣言し初期化
			int score = 75;
		
		//scoreが60以上か？
			if( score >= 60 ) {
				//60以上なら合格です!と表示する
				System.out.println( "合格です！" );
			}
		
		/*********************************************
		 * [概要]Javaカリキュラム2.11 Java基礎問題2 Q2
		 * [詳細]ageが20以上30以下なら"適正年齢です"と表示する
		 * 　　　それ以外は、"対象外です"と表示する
		 * [改訂]2026/02/06　32行　if文条件式　変更
		 *********************************************/
		//変数ageを宣言し初期化
			int age1 = 25;
			
		//年齢が適正か判断する
			if( age1 >= 20 && age1 <= 35 ) {
				//20以上35以下なら適正年齢ですと表示する
				System.out.println( "適正年齢です" );
			}else {
				//それ以外は、対象外ですと表示する
				System.out.println( "対象外です" );
			}
			
		/*********************************************
		 * [概要]Javaカリキュラム2.11 Java基礎問題2 Q3
		 * [詳細]ageが20以上なら成人ですと表示する
		 * 　　　ageが13以上19以下ならティーンエイジャーですと表示する
		 * 　　　ageが12以上なら子供ですと表示する
		 * [改訂]2026/02/06　51,54行　if文条件式　変更
		 *********************************************/
		//変数age2を宣言し初期化
			int age2 = 18;
			
		//年齢を比較する
			if( age2 >= 20 ) {
				//20以上なら成人ですと表示する
				System.out.println( "成人です" );
			}else if( age2 >= 13 && age2 <= 19 ){
				//13以上19以下ならティーンエイジャーですと表示する
				System.out.println( "ティーンエイジャーです" );
			}else{
				//12以下なら適正年齢ですと表示する
				System.out.println( "子供です" );
			}
		
		/*********************************************
		 * [概要]Javaカリキュラム2.11 Java基礎問題2 Q4
		 * [詳細]一番大きい数値を判定して表示
		 *********************************************/
		//変数x,y,zを宣言し初期化
			int x = 30;
			int y = 15;
			int z = 50;
			
		//変数x,y,zを宣言し初期化
			int max;
			
		//一番大きい数値を判断する
			if( x >= y && x >= z ) {
				//xが一番大きい
				max = x;
				System.out.println( "最大値:" + max );
			}else if( y >= x && y >= z ) {
				//yが一番大きい
				max = y;
				System.out.println( "最大値:" + max );
			}else {
				//zが一番大きい
				max = z;
				System.out.println( "最大値:" + max );
			}
		
		/*********************************************
		 * [概要]Javaカリキュラム2.11 Java基礎問題2 Q5
		 * [詳細]numの値が0より大きいなら正の数ですと表示する
		 * 　　　numの値が0なら0ですと表示する
		 * 　　　numの値が0より小さいなら負の数ですと表示する
		 *********************************************/
		//コンソール入力
			Scanner scanner = new Scanner( System.in );
			int math1 = scanner.nextInt();

		//入力された値を判断する
			if( math1 > 0 ) {
				//正の数ですと表示する
				System.out.println( "正の数です:" );
			}else if( math1 < 0 ) {
				//負の数ですと表示する
				System.out.println( "負の数です" );
			}else {
				//0ですと表示する
				System.out.println( "0です" );
			}
		
		/*********************************************
		 * [概要]Javaカリキュラム2.11 Java基礎問題2 Q6
		 * [詳細]Valueが偶数なら偶数ですと表示
		 * 　　　Valueが奇数なら奇数ですと表示
		 *********************************************/
		//コンソール入力
			int math2 = scanner.nextInt();

			//入力された値を判断する
			if( math2 % 2 == 0 ) {
				//偶数ですと表示する
				System.out.println( "偶数です" );
			}else {
				//奇数ですと表示する
				System.out.println( "奇数です" );
			}
		
		/*********************************************
		 * [概要]Javaカリキュラム2.11 Java基礎問題2 Q7
		 * [詳細]90以上なら優と表示する
		 * 　　　70以上なら良と表示する
		 * 　　　50以上なら可と表示する
		 * 　　　50未満なら不可と表示する
		 *********************************************/
		//コンソール入力
			int math3 = scanner.nextInt();

		//入力された値を判断する
			if( math3 >= 90 ) {
				//優と表示する
				System.out.println( "優" );
			}else if( math3 >= 70 ) {
				//良と表示する
				System.out.println( "良" );
			}else if( math3 >= 50 ) {
				//可と表示する
				System.out.println( "可" );
			}else {
				//50未満　不可と表示する
				System.out.println( "不可" );
			}
		
		/*********************************************
		 * [概要]Javaカリキュラム2.11 Java基礎問題2 Q8
		 * [詳細]コンソール入力がnullまたは空文字のとき入力が無効ですと表示する
		 *********************************************/
		//コンソール入力
			scanner.nextLine(); //間髪入れずに結果が表示されて
			String text = null;
			text = scanner.nextLine();
			
		//入力された値を判断する
			if( text == null || text.isEmpty() ) {
				//入力が無効ですと表示する
				System.out.println( "入力が無効です" );
			}
		
		/*********************************************
		 * [概要]Javaカリキュラム2.12 Java基礎問題2 Q9
		 * [詳細]コンソール入力に応じて曜日を表示する
		 *********************************************/
		//コンソール入力
			int day = scanner.nextInt();
			
		//switch
			switch( day ) {
				case 1:
					System.out.println( "月曜日" );
					break;
					
				case 2:
					System.out.println( "火曜日" );
					break;
					
				case 3:
					System.out.println( "水曜日" );
					break;
					
				case 4:
					System.out.println( "木曜日" );
					break;
					
				case 5:
					System.out.println( "金曜日" );
					break;
					
				case 6:
					System.out.println( "土曜日" );
					break;
					
				case 7:
					System.out.println( "日曜日" );
					break;
					
				default:
					System.out.println( "無効な入力です" );
					break;
			}
			
		/*********************************************
		 * [概要]Javaカリキュラム2.12 Java基礎問題2 Q10
		 * [詳細]コンソール入力によって季節を表示する
		 *********************************************/
		//コンソール入力
			int month = scanner.nextInt();
			
		//switch
			switch( month ) {
				case 1: case 2: case 12:
					System.out.println( "冬" );
					break;
					
				case 3: case 4: case 5:
					System.out.println( "春" );
					break;
					
				case 6: case 7: case 8:
					System.out.println( "夏" );
					break;
					
				case 9: case 10: case 11:
					System.out.println( "秋" );
					break;
					
				default:
					System.out.println( "無効な月です" );
					break;
			}
			
			scanner.close();
	}

}
