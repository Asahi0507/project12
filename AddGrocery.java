/**
 *�①�ɂɐH���i��ǉ�������s�ɐӔC�����N���X
 * @author Izumi Satoh
 */
import java.util.*;
import java.sql.*;

public class AddGrocery extends Register {

	private Scanner scanner = new Scanner(System.in);
	
	public String makeQuery() {
		System.out.println("�①�ɂɐH���i��ǉ����܂�: ");
		String query ="";
		System.out.println("���ꂽ�①�ɖ�����͂��Ă�������: ");
		String refri_name = scanner.nextLine();
		System.out.println("�ǉ������H���i������͂��Ă�������: ");
		String foodname = scanner.nextLine();
		System.out.println("�ǉ������H���i�̐��ʂ���͂��Ă�������: ");
		String quantity = scanner.nextLine();
		System.out.println("�ǉ������H���i�̃J�e�S������͂��Ă�������: ");
		String category = scanner.nextLine();
		System.out.println("�ǉ������H���i�̏ܖ��i����j��������͂��Ă�������: ");
		String foodlimit = scanner.nextLine();
		//�H���i�e�[�u���Frefrigerator
		//�①�ɖ��Frefri_name
		//���ʁFquantity
		//�H���i���Ffoodname
		//�J�e�S���Fcategory
		//�ܖ������Ffoodlimit
		query = "INSERT INTO reffood VALUE ('" + refri_name + "','"+ quantity +"','"+foodname + "','"+category + "','"  + foodlimit +"' );";
		return query;
	}
}