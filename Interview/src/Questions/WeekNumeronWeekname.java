package Questions;

public class WeekNumeronWeekname {
	public static void main(String[] args) {
		// to find week number based on week name
		
		String weekDay = "Wednesday";
		
		switch (weekDay) {
		case "Sunday" : System.out.println("1");
		break;
		case "Monday" : System.out.println("2");
		break;
		case "Tuesday" : System.out.println("3");
		break;
		case "Wednesday" : System.out.println("4");
		break;
		case "Thursday" : System.out.println("5");
		break;
		case "Friday" : System.out.println("6");
		break;
		case "Saturday" : System.out.println("7");
		break;
		default : System.out.println("Invalid day");
		}
		
	}
}
