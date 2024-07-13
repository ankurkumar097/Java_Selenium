package OopsConcept;

public class VariableValues {
	// in how many ways we can store data into class variables
	// example of Student Class
	
	int sid;
	String sname;
	char sgrad;
	
	void printStudentData() {
		System.out.println(sid+"  "+sname+"   "+sgrad);
	}
	
	// 2nd By using methods
	void setStudentvalues(int id, String name, char grad) {
		sid = id;
		sname = name;
		sgrad = grad;
	}
	
	//3rd - By using constructor
	VariableValues(int id, String name, char grad){
		sid = id;
		sname = name;
		sgrad = grad;
	}
}
