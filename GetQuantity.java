/**
 * 数量取得のSQLの実行に責任を持つクラス
 * @author Niikura Asahi
 */

import java.util.*;
import java.sql.*;

public class GetQuantity extends Get {
	private Scanner scanner = new Scanner(System.in);

	public String makeQuery() {
		String query = "";
		//String line = scanner.nextLine();
		query ="SELECT 数量 "
			+ "FROM menu "
			+ "WHERE 日時 IN(SELECT MAX(日時) FROM menu);";
		return query;
	}

	public String getResult(ResultSet r) {
		String quantity="";
		try {
			while(r.next()){
				quantity = r.getString("数量");
			}
		} catch (SQLException se) {
			System.out.println("SQL Error 2pps: " + se.toString() + " "
				+ se.getErrorCode() + " " + se.getSQLState());
		} catch (Exception e) {
			System.out.println("Error: " + e.toString() + e.getMessage());
		}
		return quantity;
	}
}