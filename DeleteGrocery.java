/**
 * mySQL�̃G���[����̂��߂̂Ɏg���e�[�u���̃f�[�^�폜�ɐӔC�����N���X
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
			 + "WHERE ���� <= 0;";
		return query;
	}
}