package bank;

import java.util.Scanner;

import abc.*;
import users.*;

public class Bank {
	int money;
	private static User user;

	public static void main(String[] args) {
		Bank bank = new Bank();
		bank.login();
		bank.operate();
	}

	// 金额存入取出查询
	public void operate() {
		Bank bank = new Bank();
		int n;
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("choice your option：");
			System.out.println("1: cin\t 2:cout\t 3:find\t0:esc");
			n = sc.nextInt();
			if(n==1||n==2){
				
				int num=0;
				try{
					System.out.println("cin__money：");
					num=sc.nextInt();
				}catch(Exception e){
					System.out.println("cin__wrong");				
					continue;
				}
				
				
				switch (n) {
				case 1:
					bank.income(num);
					break;
				case 2:			
					bank.takeout(num);
					break;
				default:
					break;
			}
			}	
			else if( n==3){		
				show();
				}
			else if( n== 0){
				System.exit(0);
			}
			else {
				System.out.println("cin__between 1--3");
			}
	}
}
	public void login() {
		DBUtils dt = DBUtils.getInstance();
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("cin>>ID：");
			String ID = sc.nextLine();
			System.out.println("cin>>Pwd：");
			String Pwd = sc.nextLine();
			user = dt.getUser(ID);
			if (dt.getUsers().containsKey(ID) && user.getPwd().equals(Pwd)) {
				System.out.println("Land");// 登陆成功
				break;
			} else {
				System.out.println("Worong,repear Please");// 失败
				continue;
			}

		}
	}

	public void income(int num) {
		money = user.getmoney() + num;
		user.setmoney(money);
		System.out.println("success,continue please。");// 存入成功
	}

	public void takeout(int num) {
		if (user.getmoney() >= num) {
			money = user.getmoney() - num;

			user.setmoney(money);
			System.out.println("out");// 成功
		} else {
			System.out.println("money is not enough ");// 失败
		}
	}

	public void show() {
		money = user.getmoney();
		System.out.println("money" + money + "元");// 输出
	}
}
