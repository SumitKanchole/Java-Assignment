//incorrect program
import java.util.*;

class Institution {
String name;
String location;
Institution(String name, String location)
{
	this.name=name;
	this.location=location;
}
void display() {
	System.out.println("Name : "+name+ " \n Location : "+location);
}
}


class School extends Institution {
int noOfStudent;
School(String name, String location,int noOfStudent) {
super(name,location);
this.noOfStudent=noOfStudent;
}
void display() {
	super.display();
	System.out.println("Number of student : "+noOfStudent);
}
}

class College extends Institution {
String Course;
College(String name, String location,String Course) {
super(name,location);
this.Course=Course;
}
void display() {
	super.display();
	System.out.println("your course : "+Course);
}

}

class University extends Institution {
//research programs
String Research;
University(String name, String location,String Research) {
super(name,location);
this.Research=Research;
}
void display() {
	super.display();
	System.out.println("your Research programs : "+Research);

}

}

class S2 {
public static void main(String args[]) {

School sc = new School("Ronit","indore",23);
sc.display();


College cl = new College("Sumit","indore","BCA");
cl.display();

University un = new University("Amit","indore","MCA");
un.display();

}
}