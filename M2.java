import java.util.*;
class Transaction {
int TranId;
double amount;
Transaction(int TranId, double amount) {
this.TranId=TranId;
this.amount=amount;
}
void display() {
System.out.println("Transaction ID : "+TranId);
System.out.println("Transaction Amount : "+amount);
}
}


class PeertoPeerTransaction extends Transaction {
String recipient;
PeertoPeerTransaction(int TranId,double amount, String recipient) {
super(TranId,amount);
this.recipient=recipient;
}
void display() {
System.out.println("\nPeer-to-Peer Transaction :- ");
super.display();
System.out.println("Recipient : "+recipient);
}
}


class OnlinePurchaseTransaction extends Transaction {
String merchant;
OnlinePurchaseTransaction(int TranId,double amount, String merchant) {
super(TranId,amount);
this.merchant=merchant;
}
void display() {
System.out.println("\nOnline Purchase Transaction :- ");
super.display();
System.out.println("Merchant : "+merchant);
}
}


class BillPaymentTransaction extends Transaction {
String billtype;
BillPaymentTransaction(int TranId,double amount, String billtype) {
super(TranId,amount);
this.billtype=billtype;
}
void display() {
System.out.println("\nBill Payment Transaction :- ");
super.display();
System.out.println("Bill Type : "+billtype);
}
}

class M2 {
public static void main(String args[]) {
Scanner sc=new Scanner(System.in);
System.out.print("Enter Transaction ID : ");
int TranId = Integer.parseInt(sc.nextLine());

System.out.print("Enter Transaction Amount : ");
double amount = Double.parseDouble(sc.nextLine());

System.out.print("Enter recipient ");
String recipient= sc.nextLine();

System.out.print("Enter Merchant Name : ");
String merchant = sc.nextLine();

System.out.print("Enter Bill type : ");
String billtype = sc.nextLine();

PeertoPeerTransaction p2p =new PeertoPeerTransaction(TranId,amount,recipient);
p2p.display();

OnlinePurchaseTransaction onl =new OnlinePurchaseTransaction(TranId,amount,merchant);
onl.display();

BillPaymentTransaction bpt =new BillPaymentTransaction(TranId,amount,billtype);
bpt.display();
}

}