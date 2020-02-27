/**
 * 冷蔵庫の追加の実行に責任を持つクラス
 * @author Izumi Satoh
 */
import java.util.*;
import java.sql.*;

public class AddRefri extends Register {

	private Scanner scanner = new Scanner(System.in);
	
	public String makeQuery() {
		System.out.println("冷蔵庫名を追加してください: ");
		String query ="";
		String refri_name = scanner.nextLine();
		//冷蔵庫テーブル：refrigerator
		//名前：refri_name
		query = "INSERT INTO refrigerator VALUE ('" + refri_name + "');";
		return query;
	}

}