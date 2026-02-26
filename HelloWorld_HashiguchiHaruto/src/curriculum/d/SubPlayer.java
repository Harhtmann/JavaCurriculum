package curriculum.d;

/**************************************************
* Javaカリキュラム2.24　プログラム作成2
* 詳細　Player vs Daemon　バトルプログラム
**************************************************/

public class SubPlayer extends Character {
	//引数ありコンストラクタ
	public SubPlayer( String name, int hp, int at, int sp ) {
		super( name, hp, at, sp );
	}
	
	//Attackメソッド
	@Override
    public void attack(Character opponent) {
        opponent.hp -= this.at;
        System.out.println(this.name + " の攻撃！ "
                + opponent.name + " に "
                + this.at + " ダメージ！");
    }
	
	//HP確認メソッド
    public boolean isAlive() {
        return this.hp > 0;
    }
	
}
