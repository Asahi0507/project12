/**
 * �����̒ǉ��̎��s�ɐӔC�����N���X
 * @author Izumi Satoh
 * modified by Izumi : �����̎擾�֘A���Ԉ���Ă������ߒ����B
 */
import java.util.*;
import java.sql.*;
import java.text.*;

public class AddMenu extends Register {

	private Scanner scanner = new Scanner(System.in);


	public String makeQuery() {
		String query ="";
		System.out.println("\n ============������ǉ����܂�============ ");
		System.out.println("�g�p�����H���i����ǉ����Ă�������: ");
		String foodname = scanner.nextLine();
		System.out.println("�g�p�����H���̐��ʂ�ǉ����Ă�������: ");
		String quantity = scanner.nextLine();
		String data = query;
		System.out.println("�g�p�������V�s����ǉ����Ă�������: ");
		String recipename = scanner.nextLine();
		//�����e�[�u���Fmenu
		//�H���i���Ffoodname
		//���ʁFquantity
		//���t�Fdata
		//���V�s��:recipename
		query = "INSERT INTO menu VALUES ('" + foodname + "','"+ quantity +"',(SELECT now()),'" +recipename +"' );";

		return query;
	}
	
}