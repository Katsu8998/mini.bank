# Query: 
# Flags: CaseSensitive
# ContextLines: 1

package minibank;

public class Admi {
	String name;
	Customer customer;
	Account account;
	
	public Admi(String name){
		this.name="ハナ";
	}
	
	public void ask() {
		System.out.println("ご用件は何でしょうか?");
	}
	
	
	
}
