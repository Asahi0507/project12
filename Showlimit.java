/**
 * �ܖ������̕\���ɐӔC�����N���X
 * @author Hayami Sae
 */

import java.util.*;
import java.sql.*;

public class Showlimit extends Show {
	private Scanner scanner = new Scanner(System.in);

	public String makeQuery() {
		System.out.println("�ܖ������ꗗ:");
		String query = "";
		//String line = scanner.nextLine();
		query ="SELECT �i��,������� "
			+ "FROM reffood;";
		return query;
	}

	public void showResult(ResultSet r) {
		try {
			while(r.next()) {
				String limit = r.getString("�������");
				String name = r.getString("�i��");
				System.out.println("�擾���� -> "+ name+","+limit);
			}
		} catch (SQLException se) {
			System.out.println("SQL Error 2pps: " + se.toString() + " "
				+ se.getErrorCode() + " " + se.getSQLState());
		} catch (Exception e) {
			System.out.println("Error: " + e.toString() + e.getMessage());
		}
	}
}