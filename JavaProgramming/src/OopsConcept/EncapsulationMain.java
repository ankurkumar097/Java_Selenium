package OopsConcept;

public class EncapsulationMain {

	public static void main(String[] args) {
		
		Encapsulation enc = new Encapsulation();
		
		enc.setAccName("Steve");
		enc.setAccNo(1011);
		enc.setAmount(2500.50);
		
		System.out.println("Account Name is: "+ enc.getAccName());
		System.out.println("Account number is: "+enc.getAccNo());
		System.out.println("Amount is: "+enc.getAmount());

	}

}
