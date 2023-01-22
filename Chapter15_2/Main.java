package practice;

// ファイルに出力する基本的な方法
// 書き込むファイルを指定する→ファイルに書き込む→ファイルを閉じる

// java.ioパッケージ:システム入出力に使うクラス、インターフェース等が提供されているパッケージ

// BufferedReader:文字、配列、行をバッファリングすることによって、文字型入力ストリームからテキストを効率良く読み込む
import java.io.BufferedReader;
// BufferedWriter:文字をバッファリングすることによって、文字、配列、または文字列を効率良く文字型出力ストリームに書き込む
import java.io.BufferedWriter;
// IOException:入出力処理中の例外を管理するクラス
import java.io.IOException;

// java.nioパッケージ:基本的な標準I/O処理を補完した形で、より高機能な処理を実現出来るよう改善されたパッケージ

// FileSystem:ファイル・システムへのインタフェースを提供し、ファイル・システム内のファイルやその他のオブジェクトにアクセスするためのオブジェクトのファクトリ
import java.nio.file.FileSystem;
import java.nio.file.FileSystems
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) {
        FileSystem fs = FileSystems.getDefault();
        // PathクラスのインスタンスをFileSystem.getPathメソッドで生成
        Path inputPath = fs.getPath("resouces/input.txt");
        Path outputPath = fs.getPath("resouces/output.txt");

        // Java7以降に追加された「try-with-resources」文で処理
        // Filesクラスを使用して、BufferedReaderクラスのインスタンスを生成
        // Filesクラスを使用して、BufferedWriterクラスのインスタンスを生成
        try (BufferedReader reader = Files.newBufferedReader(inputPath);
                BufferedWriter writer = Files.newBufferedWriter(outputPath);) {

            String line = null;
            // BufferedReader.readLineメソッドを使用して、1行づつ処理
            // 読み込む行がなくなるまでループ
            while ((line = reader.readLine()) != null) {
                // 文字数が5以外の場合はスキップ
                if (line.length() != 5) {
                    continue;
                }
                // 読み込んだ1行を出力
                writer.write(line);
                // 改行がついてないので改行を出力
                writer.newLine();
            }

            // 例外処理を記述
            // printStackTraceで例外を出力
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            System.out.println("出力処理終了");
        }
    }
}