/**
 * 値取得系のSQLの実行に責任を持つクラスの雛形となる抽象クラス
 * @author Niikura Asahi
 */

import java.sql.*;

public abstract class Get {

	String str="";
	public abstract String makeQuery();
	public abstract String getResult(ResultSet r);
	public final String queryAndGet() {
	    Connection conn = null;
		try {
			conn = DriverManager.getConnection(
				"jdbc:mysql://localhost/loh?useSSL=false", "root", ""
				);
			Statement st=conn.createStatement();
			String sqlString = makeQuery();
			ResultSet res=st.executeQuery(sqlString);
			str = getResult(res);
		} catch (SQLException se) {
			System.out.println("SQL Error 1: " + se.toString() + " "
				+ se.getErrorCode() + " " + se.getSQLState());
		} catch (Exception e) {
			System.out.println("Error: " + e.toString() + e.getMessage());
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException sse) {
					System.out.println("Failed to close DB.");
				}
			}
		return str;
		}
	}
}
