/**
 * 食料品の表示に責任を持つクラス
 * @author Hayami Sae,Niikuira Asahi
 */

import java.util.*;
import java.sql.*;

public class ShowGrocery extends Show {
	private Scanner scanner = new Scanner(System.in);

	public String makeQuery() {
		System.out.println("食料品一覧:");
		String query = "";
		//String line = scanner.nextLine();
		query ="SELECT * "
			+ "FROM reffood "
			+ "ORDER BY 消費期限;";
		return query;
	}

	public void showResult(ResultSet r) {
		try {
			while(r.next()) {
				String limit = r.getString("消費期限");
				int count = r.getInt("数量");
				String refname = r.getString("名前");
				String name = r.getString("品名");
				String type = r.getString("カテゴリ");
				System.out.println("取得結果 -> " + refname+","+count+","+name+","+type+","+limit);
			}
		} catch (SQLException se) {
			System.out.println("SQL Error 2pps: " + se.toString() + " "
				+ se.getErrorCode() + " " + se.getSQLState());
		} catch (Exception e) {
			System.out.println("Error: " + e.toString() + e.getMessage());
		}
	}
}