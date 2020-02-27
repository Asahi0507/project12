/**
 * mySQLのエラー回避のためのに使うテーブルのデータ削除に責任を持つクラス
 * @author Niikura Asahi,Abe Nariaki
 */

import java.util.*;
import java.sql.*;

public class DeleteGrocery extends Delete {
	private Scanner scanner = new Scanner(System.in);
	
	public String makeQuery() {
		//System.out.println("Specify subject name: ");
		String query = "";
		//String line = scanner.nextLine();
		query =   "DELETE FROM reffood "
			 + "WHERE 数量 <= 0;";
		return query;
	}
}