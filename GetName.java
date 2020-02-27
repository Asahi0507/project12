/**
 * 品名取得のSQLの実行に責任を持つクラス
 * @author Niikura Asahi
 */

import java.util.*;
import java.sql.*;

public class GetName extends Get {
	private Scanner scanner = new Scanner(System.in);

	public String makeQuery() {
		String query = "";
		//String line = scanner.nextLine();
		query ="SELECT 品名 "
			+ "FROM menu "
			+ "WHERE 日時 IN(SELECT MAX(日時) FROM menu);";
		return query;
	}

	public String getResult(ResultSet r) {
		String name="";
		try {
			while(r.next()){
				name = r.getString("品名");
			}
			
		} catch (SQLException se) {
			System.out.println("SQL Error 2pps: " + se.toString() + " "
				+ se.getErrorCode() + " " + se.getSQLState());
		} catch (Exception e) {
			System.out.println("Error: " + e.toString() + e.getMessage());
		}
		return name;
	}
}