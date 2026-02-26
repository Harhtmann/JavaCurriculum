package curriculum.d;

/**************************************************
* Javaカリキュラム2.24　プログラム作成2
* 詳細　Player vs Daemon　バトルプログラム
**************************************************/

abstract class Character {
    protected String name;
    protected int hp;
    protected int at;
    protected int sp;

    public Character(String name, int hp, int at, int sp) {
        this.name = name;
        this.hp = hp;
        this.at = at;
        this.sp = sp;
    }

    public void attack(Character opponent) {
        opponent.hp -= this.at;
        System.out.println(this.name + " の攻撃！ "
                + opponent.name + " に "
                + this.at + " ダメージ！");
    }

    public boolean isAlive() {
        return this.hp > 0;
    }
}
