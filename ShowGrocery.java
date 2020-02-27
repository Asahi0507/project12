/**
 * �H���i�̕\���ɐӔC�����N���X
 * @author Hayami Sae,Niikuira Asahi
 */

import java.util.*;
import java.sql.*;

public class ShowGrocery extends Show {
	private Scanner scanner = new Scanner(System.in);

	public String makeQuery() {
		System.out.println("�H���i�ꗗ:");
		String query = "";
		//String line = scanner.nextLine();
		query ="SELECT * "
			+ "FROM reffood "
			+ "ORDER BY �������;";
		return query;
	}

	public void showResult(ResultSet r) {
		try {
			while(r.next()) {
				String limit = r.getString("�������");
				int count = r.getInt("����");
				String refname = r.getString("���O");
				String name = r.getString("�i��");
				String type = r.getString("�J�e�S��");
				System.out.println("�擾���� -> " + refname+","+count+","+name+","+type+","+limit);
			}
		} catch (SQLException se) {
			System.out.println("SQL Error 2pps: " + se.toString() + " "
				+ se.getErrorCode() + " " + se.getSQLState());
		} catch (Exception e) {
			System.out.println("Error: " + e.toString() + e.getMessage());
		}
	}
}