package curriculum.d;

/**************************************************
* Javaカリキュラム2.24　プログラム作成2
* 詳細　Player vs Daemon　バトルプログラム
**************************************************/

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class OutPutLog {
    // ログ出力
    public static void writeLog(String fileName, String content) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))) {
            bw.write(content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
