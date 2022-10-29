# Query: 
# Flags: CaseSensitive
# ContextLines: 1

package minibank;

import java.util.ArrayList;
import java.util.List;

public class Bank {
	public static void main(String[] args) {
		Admi banker = new Admi("ハナ");
		Customer customer1 = new Customer("フレドリック");
		Account account = new Account(0, 0);

		System.out.println(banker.name + "はHKSBで勤務する銀行員");
		System.out.println("顧客の名前は、" + customer1.name);

		banker.ask();
		System.out.println("1:口座開設, 2: 入出金");
		int Doaccount = new java.util.Scanner(System.in).nextInt();

		if (Doaccount == 1) {
			System.out.println("口座開設");
		} else {
			System.out.println("入出金");
		}

		// 入金
		account.openAccount();
		account.deposit();

		// 出金
		System.out.println("出金しますか。 1: する　2:しない");
		int withdraw = new java.util.Scanner(System.in).nextInt();
		if (withdraw == 1) {
			System.out.println("どちらの口座から出金しますか。1: 普通預金 2: 当座預金");
		} else {
			System.out.println("取引終了");
		}

		// 残高不足
		account.withdraw();
		if (account.SAVING < 0) {
			System.out.println("残高不足です。");
			if (account.CHECKING < 0) {
				System.out.println("残高不足です。");
			}
		}
	}

}