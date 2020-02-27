/**
 * �i���擾��SQL�̎��s�ɐӔC�����N���X
 * @author Niikura Asahi
 */

import java.util.*;
import java.sql.*;

public class GetName extends Get {
	private Scanner scanner = new Scanner(System.in);

	public String makeQuery() {
		String query = "";
		//String line = scanner.nextLine();
		query ="SELECT �i�� "
			+ "FROM menu "
			+ "WHERE ���� IN(SELECT MAX(����) FROM menu);";
		return query;
	}

	public String getResult(ResultSet r) {
		String name="";
		try {
			while(r.next()){
				name = r.getString("�i��");
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