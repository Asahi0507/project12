/**
 * �①�ɂ̒��g�̍X�V�ɐӔC�����N���X
 * = a class responsible to update the reffood table 
 * @author Niikura Asahi,Fukui Tsugumi
 */

import java.util.*;
import java.sql.*;


public class UseGrosery extends Update {

	private Scanner scanner = new Scanner(System.in);
	
	public String makeQuery(String name) {
		//System.out.println("Specify subject name: ");
		String query = "";
		//String line = scanner.nextLine();
		query = "UPDATE reffood "
			+ "SET ����=����-1 "
			+ "WHERE ������� IN (SELECT MIN(�������) FROM reffood_temp WHERE �i��='"+name+"') "
			+ "AND �i��='"+name+"';";
		return query;
	}
}