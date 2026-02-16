package curriculum.i;

/**************************************************
* Javaカリキュラム2.22　基礎問題6　Q5　ポリモーフィズム
**************************************************/

public abstract class Employee {
	//フィールド
	private String id;
	private String name;
	
	//コンストラクタ
	public Employee( String id, String name ) {
		this.id = id;
		this.name = name;
	}
	
	//getメソッド
	public String getId() {
		return this.id; }
	
	public String getNmae() {
		return this.name; }
	
	//社員の給料の算出
	public abstract int calculateDailyWage( int hoursWorked );
}
