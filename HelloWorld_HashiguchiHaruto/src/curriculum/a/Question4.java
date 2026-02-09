package curriculum.a;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		/*********************************************
		 * [概要]Javaカリキュラム2.15 Java基礎問題4 Q1
		 * [詳細]int型の配列で1,2,3,4,5を格納する
		 * 　　　配列の全要素を順番に表示する
		 *********************************************/
		//配列作成
		int[] num = { 1, 2, 3, 4, 5 };
		
		//表示
		for( int i = 0; i < 5; i++ ) {
			
			System.out.println( num[ i ] );
			
		}
		
		System.out.println();
		
		/*********************************************
		 * [概要]Javaカリキュラム2.15 Java基礎問題4 Q2
		 * [詳細]int型の配列{10,20,30,40,50}の要素を逆順に表示する
		 *********************************************/
		//変数宣言
		int i = 4;
		
		//配列作成
		num[0] = 10;
		num[1] = 20;
		num[2] = 30;
		num[3] = 40;
		num[4] = 50;
		
		//表示
		while( i >= 0 ) {
			System.out.println( num[i] );
			i--;
		}
		
		System.out.println();
		
		/*********************************************
		 * [概要]Javaカリキュラム2.16 Java基礎問題4 Q3
		 * [詳細]int型の配列{3,5,7,9,11}の全要素を合計する
		 *********************************************/
		//変数宣言
		int count = 0;
		int total = 0;
		
		//配列作成
		num[0] = 3;
		num[1] = 5;
		num[2] = 7;
		num[3] = 9;
		num[4] = 11;
		
		//全要素合計
		while( count <= 4  ) {
			total += num[count];
			count++;
		}
		
		//表示
		System.out.println( total );
		
		System.out.println();
		
		/*********************************************
		 * [概要]Javaカリキュラム2.16 Java基礎問題4 Q4
		 * [詳細]int型の配列{12,7,9,21,5,18}の最大値と最小値を表示する
		 *********************************************/
		//配列作成
		int[] num2 = { 12 ,7 ,9 ,21 ,5 ,18 };
		
		//変数宣言
		int max = num2[0];
		int min = num2[0];
		
		//判定
		for( i = 1; i < num2.length; i++ ) {
		    if (num2[i] > max) {
		        max = num2[i];
		    }
		    if (num2[i] < min) {
		        min = num2[i];
		    }
		}
		
		//表示
		System.out.println( "最大値:" + max );
		System.out.println( "最小値:" + min );
		
		System.out.println();
		
		/*********************************************
		 * [概要]Javaカリキュラム2.16 Java基礎問題4 Q5
		 * [詳細]int型配列{1,2,3,4,5}も全要素を２倍し、拡張for文で表示する
		 *********************************************/
		//配列作成
		num[0] = 1;
		num[1] = 2;
		num[2] = 3;
		num[3] = 4;
		num[4] = 5;
		
		//２倍にする
		for( i = 0; i <= 4; i++ ){
			num[i] = ( num[i] * 2 );
		}
		
		//拡張for文で表示
		for (int twice : num) {
				System.out.println( twice );
		}
		
		System.out.println();
		
		/*********************************************
		 * [概要]Javaカリキュラム2.16 Java基礎問題4 Q6
		 * [詳細]コンソール入力した数がint型配列{4,7,10,15,20}に含まれているか判定する
		 * 　　　入力した値は配列に含まれていますと表示する
		 * 　　　入力した値は配列に含まれていませんと表示する
		 *********************************************/
		//配列作成
		num[0] = 4;
		num[1] = 7;
		num[2] = 10;
		num[3] = 15;
		num[4] = 20;
		
		//変数a
		Boolean isBoolean = false;
		
		//コンソール入力
		Scanner scanner = new Scanner( System.in );
		int cnslText = scanner.nextInt();
		
		//コンソール入力値判定
		for( i = 0; i <= 4; i++ ) {
			if( num[i] == cnslText ) {
				System.out.println( "入力された値は配列に含まれています" );
				isBoolean = true;
				break;
			}
		}
		
		if( isBoolean != true ) {
			System.out.println( "入力された値は配列に含まれていません" );
		}
		
		System.out.println();
		
		/*********************************************
		 * [概要]Javaカリキュラム2.17 Java基礎問題4 Q7
		 * [詳細]2次元配列int[][]array={{1,2},{3,4},{5,6}};の全要素を表示する
		 *********************************************/
		//配列作成
		int[][]array={{1,2},{3,4},{5,6}};
		
		//表示
		for ( i = 0; i < array.length; i++ ) {
			for ( int j = 0; j < array[i].length; j++ ) {
				System.out.print( array[i][j] + " " );
			}
			System.out.println();
		}
		
		System.out.println();
		
		/*********************************************
		 * [概要]Javaカリキュラム2.17 Java基礎問題4 Q8
		 * [詳細]2次元配列int[][]array={{10,20,30},{40,50,60},{70,80,90}};の
		 * 　　　全要素の合計値を表示する
		 *********************************************/
		//配列作成
		int[][]array2 = {{10,20,30},{40,50,60},{70,80,90}};
		
		//変数宣言
		int total2 = 0;
		
		//合計
		for( i = 0; i < array2.length; i++ ) {
			for( int j = 0; j< array[i].length; j++ ) {
				total2 += array2[i][j];
			}
		}
		
		//表示
		System.out.println( "合計値" + total2 );
		
		System.out.println();
		
		/*********************************************
		 * [概要]Javaカリキュラム2.17 Java基礎問題4 Q9
		 * [詳細]2次元配列int[][]array={{12,15,8},{6,19,25},{30,2,10}};の
		 * 　　　最大値と最小値を表示する
		 *********************************************/
		//配列作成
		int[][] array3 = {{12,15,8},{6,19,25},{30,2,10}};
		
		//変数宣言
		int max2 = 0;
		int min2 = 0;
		
		//判定
		for( i = 0; i < array3.length; i++ ) {
			for( int j = 0; j < array3[i].length; j++  ) {
		    	if (array3[i][j] > max2) {
		    		max2 = array3[i][j];
		    	}
		    	if (array3[i][j] < min2) {
		    		min2 = array3[i][j];
		    	}
			}
		}
		
		//表示
		System.out.println( "最大値:" + max2 );
		System.out.println( "最小値:" + min2 );
		
		System.out.println();
				
		/*********************************************
		 * [概要]Javaカリキュラム2.17 Java基礎問題4 Q10
		 * [詳細]2次元配列int[][]array={{{1,2},{3,4}},{{5,6},{7,8}}};の
		 * 　　　全要素を表示する
		 *********************************************/
		//配列作成
		int[][][] array4 = {{{1,2},{3,4}},{{5,6},{7,8}}};
		
		//表示
		for( int[][] arr2 : array4 ) {
			for( int[] arr1 : arr2 ) {
				for( int value : arr1 ) {
					System.out.print( value + " " );
				}
			}
		}
		
		System.out.println();
		
	}

}
