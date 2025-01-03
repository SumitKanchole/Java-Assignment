abstract class LibraryItem {
    String title;
    String author;

    LibraryItem(String title, String author) {
        this.title = title;
        this.author = author;
    }

    abstract void checkout();
    abstract void returnItem();

    void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

class Book extends LibraryItem {
    int page;

    Book(String title, String author, int page) {
        super(title, author);
        this.page = page;
    }

    void checkout() {
        System.out.println("Checking out Book: " + title);
    }

    void returnItem() {
        System.out.println("Returning book: " + title);
    }
}

class DVD extends LibraryItem {
    int duration;

    DVD(String title, String author, int duration) {
        super(title, author);
        this.duration = duration;
    }

    void checkout() {
        System.out.println("Checking out DVD: " + title);
    }

    void returnItem() {
        System.out.println("Returning DVD: " + title);
    }

 void displayInfo() {
        System.out.println("DVD Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Duration: " + duration);
    }
}

public class Library {

    public static void main(String[] args) {
        Book b1 = new Book("wings", "Robert", 300);
        b1.checkout();
        b1.returnItem();
        b1.displayInfo();

        DVD d1 = new DVD("Singham", "Rohit Shetty", 150);
        d1.checkout();
        d1.returnItem();
        d1.displayInfo();
    }
}
