package curriculum.selfIntro;

import java.util.Random;

/**************************************************
* Javaカリキュラム2.23　自己紹介プログラム
**************************************************/

public class Main {

	public static void main(String[] args) {
		//BMI値の計算　体重(kg) / (身長(m))^2
		int min = 40;
		int max = 80;
		int weight = new Random().nextInt(max - min + 1) + min; //ランダム体重
		
		int min2 = 1;
		int max2 = 2;
		int height = new Random().nextInt(max2 - min2 + 1) + min2; //ランダム身長
		
		//インスタンス化
		Person person1 = new Person("鈴木太郎", 20, weight, height ,0);
		
	    //自己紹介内容を出力
	    person1.print();
	    
	    System.out.println( "BMIは" + person1.getBmi() + "です" );
	    
	    person1.print2();

	}

}
