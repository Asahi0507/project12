/**
 * 冷蔵庫の中身の更新に責任を持つクラス
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
			+ "SET 数量=数量-1 "
			+ "WHERE 消費期限 IN (SELECT MIN(消費期限) FROM reffood_temp WHERE 品名='"+name+"') "
			+ "AND 品名='"+name+"';";
		return query;
	}
}