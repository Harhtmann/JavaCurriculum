package curriculum.d;

/**************************************************
* Javaカリキュラム2.24　プログラム作成2
* 詳細　Player vs Daemon　バトルプログラム
**************************************************/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class BattlePhase {
	
    public static SubDaemon loadDaemon(String fileName) {
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {

            String dName = br.readLine();
            int dHp = Integer.parseInt(br.readLine());
            int dAt = Integer.parseInt(br.readLine());
            int dSp = Integer.parseInt(br.readLine());

            return new SubDaemon(dName, dHp, dAt, dSp);

        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
	
    public void main() {
		//ランダム値生成準備
		Random random = new Random();
		//コンソール入力準備
		Scanner sc = new Scanner(System.in);
		//PlayerName入力
		System.out.println( "プレイヤーの名前を入力してください↓" );
		String pName = sc.next();
		//HP,AT,SPのランダム生成
		int pHp = random.nextInt( 100 );
		int pAt = random.nextInt( 20 );
		int pSp = random.nextInt( 10 );
    	
    	//インスタンス生成
    	SubPlayer playerIns = new SubPlayer( pName, pHp, pAt, pSp );
    	SubDaemon daemonIns = loadDaemon( "daemon_status.txt" );
    	
        //先攻、後攻用変数
        Character first;
        Character second;
    	
        System.out.println("\n=== バトル開始 ===");
        System.out.println(playerIns.name + " HP:" + playerIns.hp);
        System.out.println(daemonIns.name + " HP:" + daemonIns.hp);

        // 先攻、後攻決定
        if (playerIns.sp > daemonIns.sp) {
            first = playerIns;
            second = daemonIns;
        } else if (playerIns.sp < daemonIns.sp) {
            first = daemonIns;
            second = playerIns;
        } else {
            if (new Random().nextBoolean()) {
                first = playerIns;
                second = daemonIns;
            } else {
                first = daemonIns;
                second = playerIns;
            }
        }

        StringBuilder log = new StringBuilder();
        log.append("=== バトルログ ===\n");

        // ターン制バトル
        while (playerIns.isAlive() && daemonIns.isAlive()) {

            first.attack(second);
            log.append(first.name + " が攻撃 → " + second.name + " HP: " + second.hp + "\n");

            if (!second.isAlive()) break;

            second.attack(first);
            log.append(second.name + " が攻撃 → " + first.name + " HP: " + first.hp + "\n");
        }

        String result;
        if (playerIns.isAlive()) {
            result = "勝者: " + playerIns.name;
        } else {
            result = "勝者: " + daemonIns.name;
        }

        System.out.println(result);
        log.append(result);
        
    	//ログ出力
        OutPutLog.writeLog("battle_log.txt", log.toString());
    }
}
