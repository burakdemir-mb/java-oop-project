package arraysDemo;

public class Main {

	public static void main(String[] args) {

		String[] students = new String[4];
		students[0] = "Ahmet";
		students[1] = "George";
		students[2] = "Mehmet";
		students[3] = "Linda";
		
		for(int i=0;i<students.length;i++) {
			System.out.println(students[i]);
		}
		
		System.out.println("----");
		
		for(String student:students) {
			System.out.println(student);
		}
	}

}
