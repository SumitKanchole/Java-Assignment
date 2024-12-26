import java.util.*;
class Person {
String firstName, lastName;
Person(String firstName, String lastName) {
this.firstName=firstName;
this.lastName=lastName;
}
void display() {
	System.out.println("\nEmployee Details :-");
}
}

class Employee extends Person {
int EmployId;
String Jobtitle;

Employee(String firstName,String lastName, int EmployId, String Jobtitle) {
super(firstName,lastName);
this.EmployId=EmployId;
this.Jobtitle=Jobtitle;
}
void display() {
super.display();
System.out.println("Full Name : "+(firstName+" "+lastName)+", "+Jobtitle);
System.out.println("Employee Id : "+EmployId);

}
}

class M1 {
public static void main(String args[]) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter First Name : ");
String firstName = sc.nextLine();

System.out.print("Enter Last Name : ");
String lastName = sc.nextLine();

System.out.print("Enter Employee Id : ");
int EmployId = Integer.parseInt(sc.nextLine());

System.out.print("Enter Job Title : ");
String Jobtitle = sc.nextLine();

Employee emp = new Employee(firstName,lastName,EmployId,Jobtitle);
emp.display();

}
}