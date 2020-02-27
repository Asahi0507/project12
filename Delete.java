/**
 * ���ڂ̍폜�Ɋւ���N���X
 * @author Nariaki Abe,Asahi Niikura
 * modified by satoh Izumi : Delete�̎��s�Ȃ̂�executeQuery��executUpdate�ɕύX
 */

import java.util.*;
import java.sql.*;

public abstract class Delete {
	public abstract String makeQuery();	//SQL���쐬���郁�\�b�h
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