class library {
String title;
String author;
int year;
 library(String title, String author, int year) {
	this.title =title;
	this.author=author;
	this.year=year;

}
void display() {
System.out.println("Book title : "+title+" , Author : "+author+" , Year Published : "+year);
}
}
class Book extends library {
String genre;
Book(String title, String author, int year, String genre) {
super(title,author,year);
this.genre=genre;
}
void display() {
	 super.display(); 
	System.out.println("genre of book : "+genre);
}

}
class Magazine extends library {
String volume;
Magazine(String title, String author, int year, String volume) {
super(title,author,year);
this.volume=volume;
}
void display() {
	super.display();
	System.out.println("volume of magazine : "+volume);
}

}
class DVD extends library {
double runtime;
DVD(String title, String author, int year, double runtime) {
super(title,author,year);
this.runtime=runtime;
}
void display() {
	super.display();
	System.out.println("Dvd runtime : "+runtime+" minutes");
}

}

class S1 {
public static void main(String args[]) {
Book bk = new Book("whispers of the Eternal forest","Eleanor Marston",2022,"Fantasy");
bk.display();

Magazine mg = new Magazine("whispers of the Eternal forest","Eleanor Marston",2022,"Fantasy Realm");
mg.display();

DVD div = new DVD("whispers of the Eternal forest","Eleanor Marston",2022,98.012);
div.display();
}
}