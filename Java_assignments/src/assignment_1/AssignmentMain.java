package assignment_1;
import assignment_1.employees.*;
import assignment_1.utilities.*;


public class AssignmentMain {

	public static void main(String[] args) {
		Manager m=new Manager("puvi","5821",500000,"HR");
		Developer d=new Developer("vengat","9999",1000,"JAVA");
		
		
		EmployeeUtilties.print(m);
        EmployeeUtilties.print(d);
        
        EmployeeUtilties.giveRaise(m, 10000);
        EmployeeUtilties.giveRaise(d, 2000);

        System.out.println("After Raise:");
        EmployeeUtilties.print(m);
        EmployeeUtilties.print(d);

	}

}
