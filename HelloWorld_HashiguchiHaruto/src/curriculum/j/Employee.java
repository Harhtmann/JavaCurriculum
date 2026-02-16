package curriculum.j;

/**************************************************
* Javaカリキュラム2.22　基礎問題6　Q6　インターフェイスと抽象クラス
**************************************************/

public abstract class Employee implements Billable {
	//フィールド
	private String id;
	private String name;
	
	//コンストラクト
	public Employee( String id , String name ) {
		this.id = id;
		this.name = name;
	}
	
	//getメソッド
	public String getId() {
		return this.id; }
	
	public String getNmae() {
		return this.name; }
	
}
