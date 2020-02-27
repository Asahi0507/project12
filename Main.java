/**
 * システム全体を動かすためのmainクラス
 * @author Niikura Asahi
 */

import java.util.*;
import java.sql.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Show sm = new Showmenu();
		Show sg = new ShowGrocery();
		Show sr = new ShowRecipe();
		Show sl = new Showlimit();

		Register ag = new AddGrocery();
		Register am = new AddMenu();
		Register ar = new AddRecipe();

		Update ug = new UseGrosery();
		Update ut = new UpdateTemp();

		Delete dg = new DeleteGrocery();
		Delete dt = new DeleteGroceryTemp();

		Get gn = new GetName();
		Get gq = new GetQuantity();

		while(true){
			System.out.println("Select: ");
			System.out.println("1:Show Grocery ");
			System.out.println("2:Show Limit ");
			System.out.println("3:Add Grocery ");
			System.out.println("4:Show Menu ");
			System.out.println("5:Add Menu ");
			System.out.println("6:Show Recipe ");
			System.out.println("7:Add Recipe");
			System.out.println("0:Close");
			System.out.println("Which menu?: ");
			String line = scanner.nextLine();
			if (line.equals("0")) break;
			switch(line) {
				case "1":
					sg.queryAndShow();
					break;
				case "2":
					sl.queryAndShow();
					break;
				case "3":
					ag.queryAndSet();
					break;
				case "4":
					sm.queryAndShow();
					break;
				case "5":
					am.queryAndSet();
					String name = gn.queryAndGet();
					//System.out.println(name);
					String tmp = gq.queryAndGet();
					//System.out.println(tmp);
					float q_tmp = Float.parseFloat(tmp);
					int quantity = (int) q_tmp;
					//System.out.println(quantity);
					for(int i=0;i<quantity;i++){
						ug.queryUpdate(name);
						ut.queryUpdate(name);
						dg.queryDelete();
						dt.queryDelete();
					}

					break;
				case "6":
					sr.queryAndShow();
					break;
				case "7":
					ar.queryAndSet();
					break;
				default:
					System.out.println("Incorrect number");
					break;
			}
		}
	}
}
