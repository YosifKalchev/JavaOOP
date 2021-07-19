import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {

    public static void main(String[] args) {

        Customer maria = new Customer("Maria", "0889");

        // normal Java function
        greedCustomer(maria);

        // Consumer functional interface
        greedCustomerConsumer.accept(maria);

        // BiConsumer functional interface
        greedCustomerBiConsumer.accept(maria, true);
        greedCustomerBiConsumer.accept(maria, false);
    }

    static BiConsumer<Customer, Boolean> greedCustomerBiConsumer =
            (customer, showPhoneNumber) ->
                    System.out.println("Hello " + customer.customerName +
                            ", thanks for registering phone number "
                            + (showPhoneNumber ? customer.customerPhoneNumber : "*****"));

    static Consumer<Customer> greedCustomerConsumer = customer ->
            System.out.println("Hello " + customer.customerName +
                    ", thanks for registering phone number "
                    + customer.customerPhoneNumber);

    static void greedCustomer(Customer customer) {
        System.out.println("Hello " + customer.customerName +
                ", thanks for registering phone number "
                + customer.customerPhoneNumber);
    }

    static class Customer {
        private final String customerName;
        private final String customerPhoneNumber;

        Customer(String customerName, String customerPhoneNumber) {
            this.customerName = customerName;
            this.customerPhoneNumber = customerPhoneNumber;
        }
    }
}
