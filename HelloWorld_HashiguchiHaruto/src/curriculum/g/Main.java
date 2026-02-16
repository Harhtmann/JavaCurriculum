package curriculum.g;

/**************************************************
* Javaカリキュラム2.22　基礎問題6　Q3　カプセル化
**************************************************/

public class Main {

	public static void main(String[] args) {
		//インスタンス生成
		Employee employee = new Employee();
		
		//引数入力
		employee.setEmployeeId( "E002" );
		employee.setName( "田中花子" );
		
		//表示
		System.out.print( "社員ID:" + employee.getEmployeeId() + ", " );
		System.out.println( "名前:" + employee.getName() );
	}

}
