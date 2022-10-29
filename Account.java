# Query: 
# Flags: CaseSensitive
# ContextLines: 1

package minibank;

public class Account {
	int SAVING;
	int CHECKING;
	int balance;

	//普通預金口座と当座預金
	public Account(int SAVING, int CHECKING) {
		this.SAVING = SAVING;
		this.CHECKING = CHECKING;
	}
	
	//口座開設
	public void openAccount() {
		System.out.println("1: 普通預金、2: 当座預金");
	}
	
	//入金
	public void deposit() {
		int whichaccount = new java.util.Scanner(System.in).nextInt();
		System.out.println("入金額を入力してください。");
		int balance = new java.util.Scanner(System.in).nextInt();
		if (whichaccount == 1) {
			this.SAVING += balance;
			System.out.println("現在の普通預金残高: " + this.SAVING + "円");
		} else {
			this.CHECKING += balance;
			System.out.println("現在の当座預金残高:" + this.CHECKING + "円");
		}
		
	}
	
	//出金
	public void withdraw() {
		int whichaccount = new java.util.Scanner(System.in).nextInt();
		System.out.println("出金額を入力してください。");
		int balance = new java.util.Scanner(System.in).nextInt();
		if (whichaccount == 1) {
			this.SAVING -= balance;
			System.out.println("現在の普通預金残高: " + this.SAVING + "円");
		} else {
			this.CHECKING -= balance;
			System.out.println("現在の当座預金残高:" + this.CHECKING + "円");
		}
		
	}
}

