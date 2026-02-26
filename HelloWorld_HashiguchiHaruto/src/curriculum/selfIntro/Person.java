package curriculum.selfIntro;

/**************************************************
* Javaカリキュラム2.23　自己紹介プログラム
**************************************************/

public class Person {
	  // インスタンスフィールドを定義
	private String name;
	private int age;
	private double height;
	private double weight;
	private double bmi;
	
	//SUM用カウンター
	static int counter = 0;
	
	  // コンストラクタを定義しインスタンスフィールドに値をセット
	  Person( String name , int age , double height , double weight ,double bmi){
		  this.name = name;
		  this.age = age;
		  this.height = height;
		  this.weight = weight;
		  this.bmi = bmi;
		  counter++;
	  }
	  
	  //getメソッド
	  public String getName() {
		  return this.name;
	  }
	  
	  public int getAge() {
		  return this.age;
	  }
	  
	  public double getBmi() {
		  return this.bmi = this.weight / (this.height * this.height) ;
	  }
	  
	  //自己紹介内容(名前、年齢)を出力
	  public void print() {
		    System.out.println( "名前は" + this.name + "です" );
		    System.out.println( "年は" + this.age + "です" );
	  }
	  
	  //合計を出力
	  public void print2() {
		    System.out.println( "合計" + Person.counter + "です" );
	  }
}
