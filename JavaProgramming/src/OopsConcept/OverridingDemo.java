package OopsConcept;

class Bank{
	double roi() {
		return 0;
	}
}

class ICICI extends Bank{
	double roi() {
		return 10.0;
	}
}

class SBI extends Bank{
	double roi() {
		return 11.1;
	}
}

public class OverridingDemo {
	public static void main(String[] args) {
		
		Bank bobj = new Bank();
		System.out.println(bobj.roi());
		
		ICICI ic = new ICICI();
		System.out.println(ic.roi());
		
		SBI sb = new SBI();
		System.out.println(sb.roi());
	}

}
