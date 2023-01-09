package Program;
import java.util.ArrayList;
import java.util.Scanner;

import Entities.employee;

public class index {

	public static void main(String[] args) {
		
		int i;
		
		employee emp = new employee();
		ArrayList<employee>empList = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos empregados serão registrados?");
		int empNumber = sc.nextInt();
		
		for(i=0; i<=empNumber; i++) {
			
			System.out.println("\nEmployee #" + i + "\n");
			emp = new employee();
			empList.add(i, emp);
			
			System.out.println("Nome? ");
			String name = sc.next();
			emp.setName(name);
			
			System.out.println("ID? ");
			int ID = sc.nextInt();
			emp.setID(ID);
			
			System.out.println("Salary? ");
			double salary = sc.nextDouble();
			emp.setSalary(salary);
			
			
		}
		
		for(employee empEach:empList) {
			System.out.println(empEach);
		}
		
	    sc.close();
		
	}

}
