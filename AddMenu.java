/**
 * 献立の追加の実行に責任を持つクラス
 * @author Izumi Satoh
 * modified by Izumi : 日時の取得関連が間違っていたため訂正。
 */
import java.util.*;
import java.sql.*;
import java.text.*;

public class AddMenu extends Register {

	private Scanner scanner = new Scanner(System.in);


	public String makeQuery() {
		String query ="";
		System.out.println("\n ============献立を追加します============ ");
		System.out.println("使用した食料品名を追加してください: ");
		String foodname = scanner.nextLine();
		System.out.println("使用した食料の数量を追加してください: ");
		String quantity = scanner.nextLine();
		String data = query;
		System.out.println("使用したレシピ名を追加してください: ");
		String recipename = scanner.nextLine();
		//献立テーブル：menu
		//食料品名：foodname
		//数量：quantity
		//日付：data
		//レシピ名:recipename
		query = "INSERT INTO menu VALUES ('" + foodname + "','"+ quantity +"',(SELECT now()),'" +recipename +"' );";

		return query;
	}
	
}