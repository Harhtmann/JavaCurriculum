package curriculum.a;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		/*********************************************
		 * [概要]Javaカリキュラム2.13 Java基礎問題3 Q1
		 * [詳細]for文を使って1から10まで表示する
		 * [改訂]
		 *********************************************/
		//1から10まで表示する
		for( int i = 1; i <= 10 ; i++ ) {
			
			System.out.println( i );
			
		}
		
		System.out.println(); //結果が見づらいため改行
		
		/*********************************************
		 * [概要]Javaカリキュラム2.13 Java基礎問題3 Q2
		 * [詳細]for文を使って2から20まで偶数を表示する
		 * [改訂]
		 *********************************************/
		//2から20まで表示する
		for( int i = 1; i <= 20 ; i++ ) {
			//iが偶数か判定
			if( i % 2 == 0 ) {
				System.out.println( i );
			}
		}
		
		System.out.println(); //結果が見づらいため改行
		
		/*********************************************
		 * [概要]Javaカリキュラム2.13 Java基礎問題3 Q3
		 * [詳細]for文を使って10から1まで表示する
		 * [改訂]
		 *********************************************/
		//変数num
		int num = 10;
		
		//10から1まで表示する
		for( int i = 10; i >= 1 ; i-- ) {
			
			//表示
			System.out.println( num );
			//numデクリメント
			num--;
			
		}
		
		System.out.println(); //結果が見づらいため改行
		
		/*********************************************
		 * [概要]Javaカリキュラム2.13 Java基礎問題3 Q4
		 * [詳細]for文を使って1から100まで表示する
		 * [改訂]
		 *********************************************/
		//変数count,total
		int count = 1;
		int total = 0;
		
		//10から1まで表示する
		for( int i = 1; i >= 100 ; i++ ) {
			
			//合計
			total += count;
			//表示
			System.out.println( total );
			
			//countインクリメント
			count++;
		}
		
		System.out.println(); //結果が見づらいため改行
		
		/*********************************************
		 * [概要]Javaカリキュラム2.13 Java基礎問題3 Q5
		 * [詳細]for文を使って*で三角形になるよう表示
		 * [改訂]
		 *********************************************/
		//カウント
		for (int i = 1; i <= 5; i++) {
			//"*"表示
		    for (int j = 1; j <= i; j++) {
		    
		        System.out.print("*");
		    }
		    System.out.println(); // 改行
		}
		
		System.out.println(); //結果が見づらいため改行
		
		/*********************************************
		 * [概要]Javaカリキュラム2.14 Java基礎問題3 Q6
		 * [詳細]while文を使って1から10までを表示する
		 * [改訂]
		 *********************************************/
		//1から10まで表示
		int counter1 = 1;
		
		while( counter1 <= 10 ){
			System.out.println( counter1 ); 
			counter1++;
		}
		
		System.out.println(); //結果が見づらいため改行
		
		/*********************************************
		 * [概要]Javaカリキュラム2.13 Java基礎問題3 Q7
		 * [詳細]while文を使って2から20まで偶数を表示する
		 * [改訂]
		 *********************************************/
		//変数宣言
		int counter2 = 0;
		
		//2から20まで表示
		while( counter2 <= 20 ){
			
			//偶数か判定
			if( counter2 % 2 == 0 ) {
				System.out.println( counter2 );
			}
			
			counter2++;
		}
		
		System.out.println(); //結果が見づらいため改行
		
		/*********************************************
		 * [概要]Javaカリキュラム2.13 Java基礎問題3 Q8
		 * [詳細]while文を使って10から1まで表示する
		 * [改訂]
		 *********************************************/
		//変数宣言
		int counter3 = 10;
		
		//10から1まで表示
		while( counter3 >= 0 ){
			
			System.out.println( counter3 ); 
			counter3--;
			
		}
		
		System.out.println(); //結果が見づらいため改行
		
		/*********************************************
		 * [概要]Javaカリキュラム2.13 Java基礎問題3 Q9
		 * [詳細]while文を使って1から100までの合計を表示する
		 * [改訂]
		 *********************************************/
		//変数count,total
		int count4 = 1;
		int total2 = 0;
		
		//10から1まで表示する
		while( count4 <= 100 ) {
			
			//合計
			total2 = count4;
			//表示
			System.out.println( total2 );
			
			//count4インクリメント
			count4 ++;
			
		}
		
		System.out.println(); //結果が見づらいため改行
		
		/*********************************************
		 * [概要]Javaカリキュラム2.13 Java基礎問題3 Q10
		 * [詳細]入力回数0回まで何度でも入力回数を受け付ける
		 * 　　　0回になったら終了しましたと表示する
		 * [改訂]
		 *********************************************/
		//変数count,total
		int count5 = 10;
		
		//10回コンソールに入力したら終了
		while( count5 > 0 ) {
			
			System.out.println( "あと" + count5 + "回まで入力できます" );
			
			//コンソール入力
			Scanner scanner = new Scanner( System.in );
			int cnslText = scanner.nextInt();
			
			//count5デクリメント
			count5 --;
		}
		
		System.out.println( "終了しました" );
		
		System.out.println(); //結果が見づらいため改行
		
		/*********************************************
		 * [概要]Javaカリキュラム2.13 Java基礎問題3 Q11
		 * [詳細]for文を使い"a * b = ans ||"の形式で九九を表示する
		 * 　　　末尾右は"||"を付けない
		 * [改訂]
		 *********************************************/
		//変数宣言
		int ans = 0 ;
		
		for( int a = 1; a <= 9 ; a++ ) {
			
			for( int b = 1; b <= 9 ; b++ ) {
				
				//計算
				ans = a * b;
				
				//0梅表示へ変換
				String aStrg = String.format("%02d", a);
				String bStrg = String.format("%02d", b);
				String ansStrg = String.format("%02d", ans);
				
				//表示(末尾は"||"付けない)
				if( b < 9 ) {
					System.out.print( aStrg + "*" + bStrg + "=" + ansStrg + "||" );
				}else {
					System.out.print( aStrg + "*" + bStrg + "=" + ansStrg );
				}
				
			}
			
			//改行
			System.out.println();
			
		}
		
	}

}
