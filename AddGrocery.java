/**
 *冷蔵庫に食料品を追加する実行に責任を持つクラス
 * @author Izumi Satoh
 */
import java.util.*;
import java.sql.*;

public class AddGrocery extends Register {

	private Scanner scanner = new Scanner(System.in);
	
	public String makeQuery() {
		System.out.println("冷蔵庫に食料品を追加します: ");
		String query ="";
		System.out.println("入れた冷蔵庫名を入力してください: ");
		String refri_name = scanner.nextLine();
		System.out.println("追加した食料品名を入力してください: ");
		String foodname = scanner.nextLine();
		System.out.println("追加した食料品の数量を入力してください: ");
		String quantity = scanner.nextLine();
		System.out.println("追加した食料品のカテゴリを入力してください: ");
		String category = scanner.nextLine();
		System.out.println("追加した食料品の賞味（消費）期限を入力してください: ");
		String foodlimit = scanner.nextLine();
		//食料品テーブル：refrigerator
		//冷蔵庫名：refri_name
		//数量：quantity
		//食料品名：foodname
		//カテゴリ：category
		//賞味期限：foodlimit
		query = "INSERT INTO reffood VALUE ('" + refri_name + "','"+ quantity +"','"+foodname + "','"+category + "','"  + foodlimit +"' );";
		return query;
	}
}