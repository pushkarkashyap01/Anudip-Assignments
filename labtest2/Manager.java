package labtest2;

public class Manager extends Member{
	private String department;
	public Manager(String name,int age,String phoneNumber, String address, double salary, String department) {
		super(name,age,phoneNumber,address,salary);
		this.department = department;
	}
	public void getDepartment() {
		System.out.println("Department is "+ department);
	}
}
