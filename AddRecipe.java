/**
 * レシピの追加の実行に責任を持つクラス
 * @author Izumi Satoh
 */
import java.util.*;
import java.sql.*;

public class AddRecipe extends Register {

	private Scanner scanner = new Scanner(System.in);
	
	public String makeQuery() {
		System.out.println("レシピを追加します ");
		System.out.println("レシピ名を入力してください ");
		String query ="";
		String recipe_name = scanner.nextLine();
		//レシピテーブル：recipe
		//名前：recipe_name
		query = "INSERT INTO recipe VALUE ('" + recipe_name + "');";
		return query;
	}

}