/**
 * �����̕\���ɐӔC�����N���X
 * @author Hayami Sae,Niikura Asahi
 */ 

import java.util.*;
import java.sql.*;

public class Showmenu extends Show {
	private Scanner scanner = new Scanner(System.in);

	public String makeQuery() {
		System.out.println("�����ꗗ:");
		String query = "";
		//String line = scanner.nextLine();
		query ="SELECT * "
			+ "FROM menu "+"ORDER BY ����;";
		return query;
	}

	public void showResult(ResultSet r) {
		try {
			while(r.next()) {
				int count = r.getInt("����");
				String Grocery = r.getString("�i��");
				String date = r.getString("����");
				String menu = r.getString("���V�s��");
				System.out.println("�擾���� -> " + Grocery+","+count+","+date+","+menu);
			}
		} catch (SQLException se) {
			System.out.println("SQL Error 2pps: " + se.toString() + " "
				+ se.getErrorCode() + " " + se.getSQLState());
		} catch (Exception e) {
			System.out.println("Error: " + e.toString() + e.getMessage());
		}
	}
}