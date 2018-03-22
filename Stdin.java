/**
 *
 * @author xekid78
 *
 */
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Stdin {

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
