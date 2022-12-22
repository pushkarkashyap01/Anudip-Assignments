package labtest3;

class Student extends Person {
	  static final String instituteName = "United College Of Engineering & Research";  // static and final
	  int rollNumber;
	  String[] subjects;

	  // Default constructor
	  Student() {
	    super();  // call the constructor of the superclass
	    this.rollNumber = 0;
	    this.subjects = new String[0];
	  }

	  // Parameterized constructor
	  Student(String name, int age, long mob, int rollNumber, String[] subjects) {
	    super(name, age, mob);  // call the parameterized constructor of the superclass
	    this.rollNumber = rollNumber;
	    this.subjects = subjects;
	  }

	  // Override the toString() method
	  @Override
	  public String toString() {
	    StringBuilder sb = new StringBuilder();
	    sb.append("Name: " + this.name + "\n");
	    sb.append("Age: " + this.age + "\n");
	    sb.append("Mobile: " + this.mob + "\n");
	    sb.append("Institute: " + Student.instituteName + "\n");  // static variable
	    sb.append("Roll Number: " + this.rollNumber + "\n");
	    sb.append("Subjects: ");
	    for (String subject : this.subjects) {
	      sb.append(subject + " ");
	    }
	    return sb.toString();
	  }
	}
