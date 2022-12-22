package labtest3;

public class main {
		public main (String[] args) {
			  Student student1 = new Student("Samarth", 20, 123456789, 1, new String[]{"Math", "Physics", "Chemistry"});
			  System.out.println(student1.toString());

			  Student student2 = new Student("Siddhant", 21, 123456789, 2, new String[]{"Biology", "English", "History"});
			  System.out.println(student2.toString());
			}

	}