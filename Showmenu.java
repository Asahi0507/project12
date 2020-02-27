/**
 * 献立の表示に責任を持つクラス
 * @author Hayami Sae,Niikura Asahi
 */ 

import java.util.*;
import java.sql.*;

public class Showmenu extends Show {
	private Scanner scanner = new Scanner(System.in);

	public String makeQuery() {
		System.out.println("献立一覧:");
		String query = "";
		//String line = scanner.nextLine();
		query ="SELECT * "
			+ "FROM menu "+"ORDER BY 日時;";
		return query;
	}

	public void showResult(ResultSet r) {
		try {
			while(r.next()) {
				int count = r.getInt("数量");
				String Grocery = r.getString("品名");
				String date = r.getString("日時");
				String menu = r.getString("レシピ名");
				System.out.println("取得結果 -> " + Grocery+","+count+","+date+","+menu);
			}
		} catch (SQLException se) {
			System.out.println("SQL Error 2pps: " + se.toString() + " "
				+ se.getErrorCode() + " " + se.getSQLState());
		} catch (Exception e) {
			System.out.println("Error: " + e.toString() + e.getMessage());
		}
	}
}