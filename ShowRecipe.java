/**
 * レシピの表示に責任を持つクラス
 * @author Hayami Sae
 */

import java.util.*;
import java.sql.*;

public class ShowRecipe extends Show {
	private Scanner scanner = new Scanner(System.in);

	public String makeQuery() {
		System.out.println("レシピ一覧:");
		String query = "";
		//String line = scanner.nextLine();
		query ="SELECT * "
			+ "FROM recipe;";
		return query;
	}

	public void showResult(ResultSet r) {
		try {
			while(r.next()) {
				String recipename = r.getString("レシピ名");
				System.out.println("取得結果 -> "+ recipename);
			}
		} catch (SQLException se) {
			System.out.println("SQL Error 2pps: " + se.toString() + " "
				+ se.getErrorCode() + " " + se.getSQLState());
		} catch (Exception e) {
			System.out.println("Error: " + e.toString() + e.getMessage());
		}
	}
}