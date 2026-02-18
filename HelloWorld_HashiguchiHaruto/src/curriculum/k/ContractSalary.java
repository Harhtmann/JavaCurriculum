package curriculum.k;

/**************************************************
* Javaカリキュラム2.22　基礎問題6　Q7　オブジェクト指向尾設計原則(SOLID)
**************************************************/

public class ContractSalary extends Employee {
	//コンストラクト
	public ContractSalary( String name, String type , int hours ) {
		super( name, type , hours );
	}
	
	//契約社員　給料算出
	@Override
	public int costForDay() {
		int hourlyRate = 1000;
		return super.getHours() * hourlyRate;
	}
	
	public String eName() {
		return super.getName();
	}
}
