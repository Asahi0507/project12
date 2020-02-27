/**
 * 賞味期限の表示に責任を持つクラス
 * @author Hayami Sae
 */

import java.util.*;
import java.sql.*;

public class Showlimit extends Show {
	private Scanner scanner = new Scanner(System.in);

	public String makeQuery() {
		System.out.println("賞味期限一覧:");
		String query = "";
		//String line = scanner.nextLine();
		query ="SELECT 品名,消費期限 "
			+ "FROM reffood;";
		return query;
	}

	public void showResult(ResultSet r) {
		try {
			while(r.next()) {
				String limit = r.getString("消費期限");
				String name = r.getString("品名");
				System.out.println("取得結果 -> "+ name+","+limit);
			}
		} catch (SQLException se) {
			System.out.println("SQL Error 2pps: " + se.toString() + " "
				+ se.getErrorCode() + " " + se.getSQLState());
		} catch (Exception e) {
			System.out.println("Error: " + e.toString() + e.getMessage());
		}
	}
}