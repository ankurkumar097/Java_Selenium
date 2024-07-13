package Questions;

public class weekNameBasedOnNumber {
	public static void main(String[] args) {
		// to find week day on the basis of day number
		
		int day_num=6;
		
		switch(day_num) {
		case 1 : System.out.println("Sunday");
		break;
		case 2: System.out.println("Monday");
		break;
		case 3 : System.out.println("Tuesday");
		break;
		case 4 : System.out.println("Wesnesday");
		break;
		case 5 : System.out.println("Thursday");
		break;
		case 6 : System.out.println("Friday");
		break;
		case 7 : System.out.println("Saturday");
		break;
		default : System.out.println("Invalid number");
		}
	}
}
