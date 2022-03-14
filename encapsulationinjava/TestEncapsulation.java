package encapsulationinjava;
class Account{
	private long acc_no;
	private String name,email;
	private String amount;
	public long getAcc_no() {
		return acc_no;
	}
	public void setAcc_no(long acc_no) {
		this.acc_no=acc_no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email=email;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount=amount;
	}
}

public class TestEncapsulation {
	public static void main(String[] args) {
		Account acc=new Account();
		acc.setAcc_no(1234667l);
		acc.setName("purnima");
		acc.setEmail("purnima123@gmail.com");
		acc.setAmount("50000.0f");
		System.out.println(acc.getAcc_no()+" "+acc.getName()+" "+acc.getEmail()+" "+acc.getAmount());
	}

}
