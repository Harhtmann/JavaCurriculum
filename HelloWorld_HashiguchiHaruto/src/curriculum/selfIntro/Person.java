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
	private int sum;
	
	//SUM用カウンター
	static int counter = 0;
	
	  // コンストラクタを定義しインスタンスフィールドに値をセット
	  Person( String name , int age , double height , double weight , double bmi , int sum ){
		  this.name = name;
		  this.age = age;
		  this.height = height;
		  this.weight = weight;
		  this.bmi = bmi;
		  this.sum = sum;
		  counter++;
	  }
	  
	  //getメソッド
	  public String getName() {
		  return this.name;
	  }
	  
	  public int getAge() {
		  return this.age;
	  }
	  
	  public double getHeight() {
		  return this.height;
	  }
	  
	  public double getWeight() {
		  return this.weight;
	  }
	  
	  public double getBmi() {
		  return this.bmi;
	  }
	  
	  public double getSum() {
		  return this.sum;
	  }
	  
	  //自己紹介内容を出力
	  public void print() {
		    System.out.println( "名前は" + this.name + "です" );
		    System.out.println( "年は" + this.age + "です" );
		    System.out.println( "BMIは" + this.bmi + "です" );
		    System.out.println( "合計" + Person.counter + "です" );
	  }
}
