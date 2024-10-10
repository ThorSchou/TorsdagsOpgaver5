package TaskOne;

import java.util.ArrayList;
import java.util.Collection;

public class Main {

    public static void main(String[] args) {

        ArrayList<Customer> customers = new ArrayList<>();
        Customer cus1 = new Customer("Kaj", "Kagemand", "KageKaj");
        customers.add(cus1);
        Customer cus2 = new Customer("Bob", "Bobber", "Bobsen");
        customers.add(cus2);


        printCustomers(customers);
    }

    public static void printCustomers(ArrayList<Customer> customers) {

        for (Customer c : customers) {
        System.out.println(c.toString());
        }
    }
}