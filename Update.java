/**
 * �A�b�v�f�[�g(Query)�n��SQL�̎��s�ɐӔC�����N���X�̐��`�ƂȂ钊�ۃN���X
 * @author Niikura Asahi,Fukui Tsugumi
 */

import java.util.*;
import java.sql.*;


public abstract class Update {

	public abstract String makeQuery(String name);

	public final void queryUpdate(String name) {
		Connection conn = null;
		try{
			// DB�ɐڑ�����
			conn = DriverManager.getConnection("jdbc:mysql://localhost/loh?useSSL=false", "root", "");
			// System.out.println("MySQL�ɐڑ��ł��܂����B");
			// Statement�����
			Statement st=conn.createStatement();
			// ���s����SQL�𕶎���(String)�ɂ���
			String sqlString = makeQuery(name);
			// SQL�����s
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