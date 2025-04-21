package foodDelhiverySystem;

import java.util.Arrays;
import java.util.List;

public class FoodDelhiverySystemDriver {

    public static void main(String[] args) {
        // Menus for restaurants
        List<String> r1Menu = Arrays.asList("Pizza", "Chola Kulcha", "Chai", "Aloo Paratha", "Papdi Chat", "Burger");
        List<String> r2Menu = Arrays.asList("Pizza", "Fried Rice", "Coffee", "Chilli Paneer");

        // Restaurants
        Resturant r1 = new Resturant("RangDeBasanti", r1Menu);
        Resturant r2 = new Resturant("Bowl Nation", r2Menu);

        // Customers
        Customer c1 = new Customer("Gourav", true);
        Customer c2 = new Customer("Priya", true);
        Customer c3 = new Customer("Jeet", false);
        Customer c4 = new Customer("Mr. John", false);

        // Scenario 1
        try {
            List<String> c1items = Arrays.asList("Chai", "Chola Kulcha");
            new Order(c1, r1, c1items);
            
            c1.logout();
        } catch (Exception e) {
            System.out.println("Exception: " + e.getClass().getSimpleName());
            System.out.println("Message: " + e.getMessage());
        }

        System.out.println("====================");

        // Scenario 2
        try {
          
            List<String> c2items = Arrays.asList("Fried Rice", "Chilli Paneer");
            new Order(c2, r2, c2items);
            c2.logout();
        } catch (Exception e) {
            System.out.println("Exception: " + e.getClass().getSimpleName());
            System.out.println("Message: " + e.getMessage());
        }

        System.out.println("====================");

        // Scenario 3: c3 was not logged in before placing order
        try {
           
            List<String> c3items = Arrays.asList("Fried Rice", "Chai");
            new Order(c3, r2, c3items);
            c3.logout();
        } catch (Exception e) {
            System.out.println("Exception: " + e.getClass().getSimpleName());
            System.out.println("Message: " + e.getMessage());
        }

        System.out.println("====================");

        // Scenario 4: More than 5 items should throw OrderLimitExceedException
        try {
           
            List<String> c4items = Arrays.asList("Pizza", "Chola Kulcha", "Chai", "Aloo Paratha", "Papdi Chat", "Burger");
            new Order(c4, r1, c4items);
            c4.logout();
        } catch (Exception e) {
            System.out.println("Exception: " + e.getClass().getSimpleName());
            System.out.println("Message: " + e.getMessage());
        }
    }
}
