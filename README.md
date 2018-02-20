# JavaStandardInput
標準入力

## 処理
キーボードから入力された文字を出力します。

## コード
```
import java.util.NoSuchElementException;
import java.util.Scanner;

public class sample9 {

	public static void main(String[] args) {
		System.out.println("文字の入力をお願いします。");
		try (Scanner scan = new Scanner(System.in)) {
			String data = scan.next();
			System.out.println(data + "と入力しました。");
		} catch (NoSuchElementException e) {
			e.printStackTrace();
		} catch (IllegalStateException e) {
			e.printStackTrace();
		}

	}

}
```

## 開発環境
| 開発ツール |  |
|:-|:-|
| 統合開発環境(IDE) | Eclipse 4.7.0 Oxygen |
| 開発言語 | Java8 |
