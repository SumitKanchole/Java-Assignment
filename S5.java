import java.util.*;
class Shape {
String color;
Shape(String color){
	this.color=color;
}
void displaycolor() {
System.out.println("And the Color of circle is : "+color);
}
}


class Circle extends Shape {
double radius;
Circle(String color,double radius) {
super(color);
this.radius=radius;
}
void CalculateArea() {

double A = 3.14f*(radius*radius);
System.out.println("Area of Circle : "+A);
super.displaycolor();
}

}

class S5 {
public static void main(String args[]) {

Circle cc = new Circle("red",11);
cc.CalculateArea();
}
}