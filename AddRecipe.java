/**
 * ���V�s�̒ǉ��̎��s�ɐӔC�����N���X
 * @author Izumi Satoh
 */
import java.util.*;
import java.sql.*;

public class AddRecipe extends Register {

	private Scanner scanner = new Scanner(System.in);
	
	public String makeQuery() {
		System.out.println("���V�s��ǉ����܂� ");
		System.out.println("���V�s������͂��Ă������� ");
		String query ="";
		String recipe_name = scanner.nextLine();
		//���V�s�e�[�u���Frecipe
		//���O�Frecipe_name
		query = "INSERT INTO recipe VALUE ('" + recipe_name + "');";
		return query;
	}

}