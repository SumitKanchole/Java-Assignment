import java.util.Scanner;

class Pizza {
    double basePrice;
    double toppingCost;

    // Constructor
    Pizza(double basePrice, double toppingCost) {
        this.basePrice = basePrice;
        this.toppingCost = toppingCost;
    }

    // Method to calculate the price of the pizza
    double calculatePrice(int numTopping) {
        return basePrice + (toppingCost * numTopping);
    }
}

class DiscountPizza extends Pizza {

    // Constructor
    DiscountPizza(double basePrice, double toppingCost) {
        super(basePrice, toppingCost);
    }

    // Overriding the calculatePrice method
    @Override
    double calculatePrice(int numTopping) {
        double regularPrice = super.calculatePrice(numTopping);
        if (numTopping > 3) {
            return regularPrice * 0.9; // 10% discount for more than 3 toppings
        } else {
            return regularPrice;
        }
    }
}

public class PizzaMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input base price
        System.out.print("Enter the base price: ");
        double basePrice = sc.nextDouble();

        // Input topping cost
        System.out.print("Enter the topping cost: ");
        double toppingCost = sc.nextDouble();

        // Input number of toppings
        System.out.print("Enter the number of toppings: ");
        int numTopping = sc.nextInt();

        // Creating objects
        Pizza p1 = new Pizza(basePrice, toppingCost);
        DiscountPizza d1 = new DiscountPizza(basePrice, toppingCost);

        // Calculating prices
        double regularPrice = p1.calculatePrice(numTopping);
        double discountPrice = d1.calculatePrice(numTopping);

        // Displaying prices
        System.out.println("Price without discount: " + regularPrice);
        System.out.println("Price with discount: " + discountPrice);

        sc.close();
    }
}
