/**
 * 項目の削除に関するクラス
 * @author Nariaki Abe,Asahi Niikura
 * modified by satoh Izumi : Deleteの実行なのでexecuteQueryをexecutUpdateに変更
 */

import java.util.*;
import java.sql.*;

public abstract class Delete {
	public abstract String makeQuery();	//SQLを作成するメソッド
	public final void queryDelete() {
	    Connection conn = null;
		try {
			conn = DriverManager.getConnection(
				"jdbc:mysql://localhost/loh?useSSL=false", "root", ""
				);
			Statement st=conn.createStatement();
			String sqlString = makeQuery();
			st.executeUpdate(sqlString);


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
		}
	}
}