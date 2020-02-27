/**
 *  mySQLのエラー回避のためのに使うテーブルのアップデートに責任を持つクラス
 *  a class responsible to update the reffood_temp table 
 *  reffood_temp is temporary table to avoid mySQL's error;
 * @author Niikura Asahi
 */

import java.util.*;
import java.sql.*;


public class UpdateTemp extends Update {

	private Scanner scanner = new Scanner(System.in);
	
	public String makeQuery(String name) {
		//System.out.println("Specify subject name: ");
		String query = "";
		//String line = scanner.nextLine();
		query = "UPDATE reffood_temp,reffood "
			+ "SET reffood_temp.数量 = reffood.数量 "
			+ "WHERE reffood_temp.名前=reffood.名前 "
			+ "AND reffood_temp.品名=reffood.品名 "
			+ "AND reffood_temp.消費期限=reffood.消費期限;";
		return query;
	}

}