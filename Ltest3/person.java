package labtest3;

class Person {
	  String name;
	  int age;
	  long mob;

	  // Default constructor
	  Person() {
	    this.name = "";
	    this.age = 0;
	    this.mob = 0;
	  }

	  // Parameterized constructor
	  Person(String name, int age, long mob) {
	    this.name = name;
	    this.age = age;
	    this.mob = mob;
	  }
	}
