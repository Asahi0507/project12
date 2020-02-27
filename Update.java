/**
 * アップデート(Query)系のSQLの実行に責任を持つクラスの雛形となる抽象クラス
 * @author Niikura Asahi,Fukui Tsugumi
 */

import java.util.*;
import java.sql.*;


public abstract class Update {

	public abstract String makeQuery(String name);

	public final void queryUpdate(String name) {
		Connection conn = null;
		try{
			// DBに接続する
			conn = DriverManager.getConnection("jdbc:mysql://localhost/loh?useSSL=false", "root", "");
			// System.out.println("MySQLに接続できました。");
			// Statementを作る
			Statement st=conn.createStatement();
			// 実行するSQLを文字列(String)にする
			String sqlString = makeQuery(name);
			// SQLを実行
			st.executeUpdate(sqlString);
		}
		catch (SQLException se){
			System.out.println("SQL Error 1: " + se.toString() + " "
				+ se.getErrorCode() + " " + se.getSQLState());
		}
		catch (Exception e){
			System.out.println("Error: " + e.toString() + e.getMessage());
		}
		finally{
			try {
					conn.close();
			}
			catch (SQLException sse) {
				System.out.println("Failed to close DB.");
			}
		}
	}
	
}