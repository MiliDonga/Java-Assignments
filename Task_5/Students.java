package Task_5;

public class Students {
	private String name;

	public Students() {
		this.name = "unknown";
	}

	public Students(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public static void main(String[] args) {
		Students student1 = new Students();
		Students student2 = new Students("John");
		Students student3 = new Students("Alice");

		System.out.println("Students Names:");
		System.out.println("Students 1: " + student1.getName());
		System.out.println("Students 2: " + student2.getName());
		System.out.println("Students 3: " + student3.getName());
	}
}
