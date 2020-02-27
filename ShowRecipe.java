/**
 * ���V�s�̕\���ɐӔC�����N���X
 * @author Hayami Sae
 */

import java.util.*;
import java.sql.*;

public class ShowRecipe extends Show {
	private Scanner scanner = new Scanner(System.in);

	public String makeQuery() {
		System.out.println("���V�s�ꗗ:");
		String query = "";
		//String line = scanner.nextLine();
		query ="SELECT * "
			+ "FROM recipe;";
		return query;
	}

	public void showResult(ResultSet r) {
		try {
			while(r.next()) {
				String recipename = r.getString("���V�s��");
				System.out.println("�擾���� -> "+ recipename);
			}
		} catch (SQLException se) {
			System.out.println("SQL Error 2pps: " + se.toString() + " "
				+ se.getErrorCode() + " " + se.getSQLState());
		} catch (Exception e) {
			System.out.println("Error: " + e.toString() + e.getMessage());
		}
	}
}