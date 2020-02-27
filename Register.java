/**
 * 食料品の追加の実行に責任を持つクラスの雛形となる抽象クラス
 * @author Izumi Satoh
 */

import java.sql.*;
import java.util.*;

public abstract class Register {
		public abstract String makeQuery();

		public final void queryAndSet(){
			Connection con = null;
			try {
				// DBに接続する
				//Database名が異なる時は「refri_food」をいじる
				con = DriverManager.getConnection("jdbc:mysql://localhost/loh?useSSL=false", "root", "");
				//System.out.println("MySQLに接続できました");
				// Statementを作る
				Statement stm = con.createStatement();
				// 実行するSQLを文字列(String)にする
				String sql = makeQuery();
				// SQLを実行して、実行結果をResultSetに入れる
				stm.executeUpdate(sql);
			} catch (SQLException se) {
				System.out.println("SQL Error 1 : " + se.toString() + " "
					+ se.getErrorCode() + " " + se.getSQLState());
			}catch (Exception e){
				System.out.println("Error: " + e.toString() + e.getMessage());
			} finally {
				if (con != null) {
					try {
						con.close();
					} catch (SQLException e) {
						System.out.println("MySQLのクローズに失敗しました。");
					}
				}
			}
		}
}
