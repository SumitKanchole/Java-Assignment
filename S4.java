class Animal {

void sound() {
System.out.println("Animal make sound");
}
}

class Dog extends Animal {

void display() {
super.sound();
System.out.println("Dogs bark");
}
}
class S4 {
public static void main(String args[]) {

Dog d= new Dog();
d.display();

}

}