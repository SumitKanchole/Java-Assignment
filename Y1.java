//incorrect program
import java.util.*;

class Institution {
String name;
String location;
Institution(String name, String location)
{
	System.out.println(name+ " : "+location);
}
}


class School extends Institution {
School(int noOfStudent) {
this.noOfStudent=noOfStudent;
}
() {
	System.out.println(id+" : "+name);
}
}

class College extends Institution {

College(String Course[]) {
this.Course=["BBA","BCA","B-TECH","B-PHARMA","B.COM"];

void display2() {
	for(int i=0;i<course.length;i++) {
	System.out.println(Course[i]);
}
}
}
}

class University extends Institution {
//research programs
University(String Research) {
this.Research=["market research","medical research","clinic research"];

void display3() {
	for(int i=0;i<course.length;i++) {
	System.out.println(Research[]);
}
}
}
}

class Y1 {
public static void main(String args[]) {

University un = new University();

}
}
