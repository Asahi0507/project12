/**
 * ”—Êæ“¾‚ÌSQL‚ÌÀs‚ÉÓ”C‚ğ‚ÂƒNƒ‰ƒX
 * @author Niikura Asahi
 */

import java.util.*;
import java.sql.*;

public class GetQuantity extends Get {
	private Scanner scanner = new Scanner(System.in);

	public String makeQuery() {
		String query = "";
		//String line = scanner.nextLine();
		query ="SELECT ”—Ê "
			+ "FROM menu "
			+ "WHERE “ú IN(SELECT MAX(“ú) FROM menu);";
		return query;
	}

	public String getResult(ResultSet r) {
		String quantity="";
		try {
			while(r.next()){
				quantity = r.getString("”—Ê");
			}
		} catch (SQLException se) {
			System.out.println("SQL Error 2pps: " + se.toString() + " "
				+ se.getErrorCode() + " " + se.getSQLState());
		} catch (Exception e) {
			System.out.println("Error: " + e.toString() + e.getMessage());
		}
		return quantity;
	}
}