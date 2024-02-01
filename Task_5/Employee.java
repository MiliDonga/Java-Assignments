package Task_5;

public class Employee {
	private String name;
	private int yearOfJoining;
	private String address;

	public Employee(String name, int yearOfJoining, String address) {
		this.name = name;
		this.yearOfJoining = yearOfJoining;
		this.address = address;
	}

	public void printEmployeeInfo() {
		System.out.printf("%-15s%-20s%-20s%n", name, yearOfJoining, address);
	}

	public static void main(String[] args) {
		Employee robert = new Employee("Robert", 1994, "64C - Walls Street");
		Employee sam = new Employee("Sam", 2000, "68D - Walls Street");
		Employee john = new Employee("John", 1999, "26B - Walls Street");

		System.out.printf("%-15s%-20s%-20s%n", "Name", "Year of Joining", "Address");
		System.out.println("-----------------------------------------------------");
		robert.printEmployeeInfo();
		sam.printEmployeeInfo();
		john.printEmployeeInfo();
	}
}
