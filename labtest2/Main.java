package labtest2;

public class Main {
	public static void main(String[] args) {
		// instance of Employee class
		Employee emp = new Employee("Samarth",22,"123456789","New New Delhi",554588.9,"IT");
		// instance of Manager class
		Manager mng = new Manager("TECHY",25,"1234567890","New Delhi",887799.99,"Sales & Marketing");
		
		System.out.println("Employee Details: ");
		// now print the Employee Details
		emp.showDetails();
		emp.getSpecialization();
		emp.printSalary();
		System.out.println("Manager Details: ");
		// now print the Manager Details
		mng.showDetails();
		mng.getDepartment();
		mng.printSalary();
	}
}
