import java.util.*;
class Employee {
int empId;
float salary;
Employee(int empId,float salary) {
this.empId=empId;
this.salary=salary;

}
void display() {
System.out.println("\nemployee Id : "+empId);
System.out.println("employee salary : "+salary);
}
}

class EmployeeLevel extends Employee {
int level=0;
EmployeeLevel(int empId,float salary) {
super(empId,salary);
if(salary>100) {
level=1;
//System.out.println("Level-"+level);
}
else {
level=2;
//System.out.println("Level-"+level);
}

}
void display() {
super.display();
System.out.println("Level : "+level);
}
}

class M3 {
public static void main(String args[]) {
Scanner sc=new Scanner(System.in);
System.out.print("enter employee Id : ");
int empId = sc.nextInt();
System.out.print("enter employee salary : ");
float salary = sc.nextFloat();

EmployeeLevel emp = new EmployeeLevel(empId,salary);
emp.display();

}
}