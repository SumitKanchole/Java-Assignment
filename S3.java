class Product{
int proId;
String name;
int price;
Product(int proId, String name, int price) {
	this.proId=proId;
	this.name=name;
	this.price=price;

}
void display() {
System.out.println("\n Product Id : "+proId+" \n Product Name : "+name+" \n product Price : "+price);
}
}
class Electronics extends Product {
double Warranty;
Electronics(int proId, String name, int price, double Warranty) {
super(proId,name,price);
this.Warranty=Warranty;
}
void display() {
	 super.display(); 
	System.out.println(" Warranty : "+Warranty+" year");
}

}
class Clothing extends Product {
String size;
Clothing(int proId, String name, int price, String size) {
super(proId,name,price);
this.size=size;
}
void display() {
	super.display();
	System.out.println(" Size of cloth : "+size);
}

}
class Grocery extends Product {
String expiryDate;
Grocery(int proId, String name, int price, String expiryDate) {
super(proId,name,price);
this.expiryDate=expiryDate;
}
void display() {
	super.display();
	System.out.println(" Expiry date : "+expiryDate);
}

}

class S3 {
public static void main(String args[]) {
Electronics bk = new Electronics(101,"Washing-machine",13500,2.7);
bk.display();

Clothing Cl = new Clothing(1034,"Shirt",460,"Medium");
Cl.display();

Grocery gc = new Grocery(1121,"olive-Oil",130,"22/10/2023");
gc.display();
}
}