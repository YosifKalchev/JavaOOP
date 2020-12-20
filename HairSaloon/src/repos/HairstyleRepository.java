package repos;

import dataBase.Hairstyle;
import users.Customer;
import users.Hairdresser;

import java.util.ArrayList;
import java.util.List;

public class HairstyleRepository {

    private static final HairstyleRepository instance = new HairstyleRepository();

    public static HairstyleRepository getInstance() {
        return instance;
    }

    private final List<Hairstyle> hairstyles;

    private HairstyleRepository() {

        hairstyles = new ArrayList<>();
        hairstyles.add(new Hairstyle((Customer) UserRepository.getInstance().getUserByUsername("client1"),
                (Hairdresser) UserRepository.getInstance().getUserByUsername("John"), 1, 4));
        hairstyles.add(new Hairstyle((Customer) UserRepository.getInstance().getUserByUsername("client2"),
                (Hairdresser) UserRepository.getInstance().getUserByUsername("John"), 1, 4));
        hairstyles.add(new Hairstyle((Customer) UserRepository.getInstance().getUserByUsername("client3"),
                (Hairdresser) UserRepository.getInstance().getUserByUsername("John"), 1, 4));
        hairstyles.add(new Hairstyle((Customer) UserRepository.getInstance().getUserByUsername("client4"),
                (Hairdresser) UserRepository.getInstance().getUserByUsername("John"), 1, 4));

        hairstyles.add(new Hairstyle((Customer) UserRepository.getInstance().getUserByUsername("client5"),
                (Hairdresser) UserRepository.getInstance().getUserByUsername("Simon"), 2, 7));
        hairstyles.add(new Hairstyle((Customer) UserRepository.getInstance().getUserByUsername("client6"),
                (Hairdresser) UserRepository.getInstance().getUserByUsername("Simon"), 2, 7));
        hairstyles.add(new Hairstyle((Customer) UserRepository.getInstance().getUserByUsername("client7"),
                (Hairdresser) UserRepository.getInstance().getUserByUsername("Simon"), 2, 7));
        hairstyles.add(new Hairstyle((Customer) UserRepository.getInstance().getUserByUsername("client8"),
                (Hairdresser) UserRepository.getInstance().getUserByUsername("Simon"), 2, 7));

        hairstyles.add(new Hairstyle((Customer) UserRepository.getInstance().getUserByUsername("client9"),
                (Hairdresser) UserRepository.getInstance().getUserByUsername("Patrick"), 3, 6.5));
        hairstyles.add(new Hairstyle((Customer) UserRepository.getInstance().getUserByUsername("client10"),
                (Hairdresser) UserRepository.getInstance().getUserByUsername("Patrick"), 3, 6.5));
        hairstyles.add(new Hairstyle((Customer) UserRepository.getInstance().getUserByUsername("client1"),
                (Hairdresser) UserRepository.getInstance().getUserByUsername("Patrick"), 3, 6.5));
        hairstyles.add(new Hairstyle((Customer) UserRepository.getInstance().getUserByUsername("client2"),
                (Hairdresser) UserRepository.getInstance().getUserByUsername("Patrick"), 3, 6.5));

        hairstyles.add(new Hairstyle((Customer) UserRepository.getInstance().getUserByUsername("client3"),
                (Hairdresser) UserRepository.getInstance().getUserByUsername("Joshua"), 4, 9));
        hairstyles.add(new Hairstyle((Customer) UserRepository.getInstance().getUserByUsername("client4"),
                (Hairdresser) UserRepository.getInstance().getUserByUsername("Joshua"), 4, 9));
        hairstyles.add(new Hairstyle((Customer) UserRepository.getInstance().getUserByUsername("client5"),
                (Hairdresser) UserRepository.getInstance().getUserByUsername("Joshua"), 4, 9));
        hairstyles.add(new Hairstyle((Customer) UserRepository.getInstance().getUserByUsername("client6"),
                (Hairdresser) UserRepository.getInstance().getUserByUsername("Joshua"), 4, 9));

        hairstyles.add(new Hairstyle((Customer) UserRepository.getInstance().getUserByUsername("client7"),
                (Hairdresser) UserRepository.getInstance().getUserByUsername("Ivar"), 5, 6));
        hairstyles.add(new Hairstyle((Customer) UserRepository.getInstance().getUserByUsername("client8"),
                (Hairdresser) UserRepository.getInstance().getUserByUsername("Ivar"), 5, 6));
        hairstyles.add(new Hairstyle((Customer) UserRepository.getInstance().getUserByUsername("client9"),
                (Hairdresser) UserRepository.getInstance().getUserByUsername("Ivar"), 5, 6));
        hairstyles.add(new Hairstyle((Customer) UserRepository.getInstance().getUserByUsername("client10"),
                (Hairdresser) UserRepository.getInstance().getUserByUsername("Ivar"), 5, 6));
    }

    public void addHairstyle(Hairstyle hairstyle) {
        hairstyles.add(hairstyle);
    }

    public void showAllHairstyles() {
        for (Hairstyle hairstyle : hairstyles) {
            System.out.println(
                            "HS Customer: " + hairstyle.getCustomer().getUsername() +
                            ", HS Hairdresser: " + hairstyle.getHairdresser().getUsername() +
                            ", HS Price: " + hairstyle.getPrice() +
                            ", HS Rating: " + hairstyle.getRating());
        }
    }

    public double getHairdresserRealRating(Hairdresser hairdresser) {
        double sum = 0;
        double counter = 1;
        double realRating = hairdresser.getRating();
        for (Hairstyle hairstyle : hairstyles) {
            if (hairstyle.getHairdresser().equals(hairdresser)) {
                sum += hairstyle.getRating();
                realRating = sum / counter;
                counter++;
            }
        } return realRating ;
    }
}
