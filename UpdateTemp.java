/**
 *  mySQL�̃G���[����̂��߂̂Ɏg���e�[�u���̃A�b�v�f�[�g�ɐӔC�����N���X
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
			+ "SET reffood_temp.���� = reffood.���� "
			+ "WHERE reffood_temp.���O=reffood.���O "
			+ "AND reffood_temp.�i��=reffood.�i�� "
			+ "AND reffood_temp.�������=reffood.�������;";
		return query;
	}

}