/**
 * �①�ɂ̒ǉ��̎��s�ɐӔC�����N���X
 * @author Izumi Satoh
 */
import java.util.*;
import java.sql.*;

public class AddRefri extends Register {

	private Scanner scanner = new Scanner(System.in);
	
	public String makeQuery() {
		System.out.println("�①�ɖ���ǉ����Ă�������: ");
		String query ="";
		String refri_name = scanner.nextLine();
		//�①�Ƀe�[�u���Frefrigerator
		//���O�Frefri_name
		query = "INSERT INTO refrigerator VALUE ('" + refri_name + "');";
		return query;
	}

}