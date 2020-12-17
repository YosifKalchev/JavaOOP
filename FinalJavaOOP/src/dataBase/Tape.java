package dataBase;

public class Tape {

    private final String name;
    private String Customer;


    public Tape(String name) {
        this.name = name;
        this.Customer = dataBase.UserRepository.getInstance().getUserByUsername("admin").toString();
    }



    public String getName() {
        return name;
    }



    public String getCustomer() {
        return Customer;
    }

    public void setCustomer(User customer) {
        this.Customer = dataBase.UserRepository.getInstance().getUsername(customer);
    }
}