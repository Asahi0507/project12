/**
 * �H���i�̒ǉ��̎��s�ɐӔC�����N���X�̐��`�ƂȂ钊�ۃN���X
 * @author Izumi Satoh
 */

import java.sql.*;
import java.util.*;

public abstract class Register {
		public abstract String makeQuery();

		public final void queryAndSet(){
			Connection con = null;
			try {
				// DB�ɐڑ�����
				//Database�����قȂ鎞�́urefri_food�v��������
				con = DriverManager.getConnection("jdbc:mysql://localhost/loh?useSSL=false", "root", "");
				//System.out.println("MySQL�ɐڑ��ł��܂���");
				// Statement�����
				Statement stm = con.createStatement();
				// ���s����SQL�𕶎���(String)�ɂ���
				String sql = makeQuery();
				// SQL�����s���āA���s���ʂ�ResultSet�ɓ����
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
						System.out.println("MySQL�̃N���[�Y�Ɏ��s���܂����B");
					}
				}
			}
		}
}
