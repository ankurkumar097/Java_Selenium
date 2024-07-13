package OopsConcept;

public class VariableMain {

	public static void main(String[] args) {
		
		VariableValues st = new VariableValues(103, "travis head", 'C');  //3rd - By using constructor
		st.printStudentData();
		
		
		//1 by using Object Reference variable
		st.sid =101;
		st.sname="David";
		st.sgrad='A';
		st.printStudentData();
		
		//2 By using method
		st.setStudentvalues(102, "Warner", 'B');
		st.printStudentData();
		
	}

}
