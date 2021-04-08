import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Customer> customers = new ArrayList<Customer>();

        customers.add(new Customer(1,"hatice","nur"));
        customers.add(new Customer(2,"yağmur","yiğit"));
        customers.add(new Customer(3,"elif","nur"));

        for (Customer customer:customers){
            System.out.println(customer.firsName);
        }
    }
}
