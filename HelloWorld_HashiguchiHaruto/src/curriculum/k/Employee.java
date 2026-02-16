package curriculum.k;

/**************************************************
* Javaカリキュラム2.22　基礎問題6　Q7　オブジェクト指向尾設計原則(SOLID)
**************************************************/

public abstract class Employee implements Billables {
	//フィールド
	private String name;
	private String type;
	private int hours;
	
	//コンストラクト
	public Employee(String name, String type, int hours) {
	this.name = name;
	this.type = type;
	this.hours = hours;
	}
	
	//getメソッド
	public String getName() {
		return this.name; }
	
	public String getType() {
		return this.type; }
	
	public int getHours() {
		return this.hours; }
	
}
