package curriculum.c;

/**************************************************
* Javaカリキュラム2.24　プログラム作成1
**************************************************/

import java.util.Scanner;

public class User {
	
	//コンソール入力準備
	Scanner stdin = new Scanner( System.in );
	
	public int getUser(){
		
		while( true ) {
			System.out.println( "じゃんけんスタート" );
			System.out.print( "じゃんけんの手を選んでください/0:グー,1:チョキ,2:パー,3:終了 ->>" );
			
			if( stdin.hasNextInt() ) {
				int number = stdin.nextInt();
				
				if( number <= -1 || number >= 4 ) {
					System.out.println( "E01:選択範囲外エラー" );
					continue;
				}else {
					return number;
				}
			}else {
				System.out.println("E02:整数入力エラー");
				stdin.next();
			}
		}
	}
}
