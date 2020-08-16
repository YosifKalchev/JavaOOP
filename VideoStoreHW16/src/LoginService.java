import DataBase.User;
import DataBase.UserRepository;

public class LoginService {

    private  Input input;
    private  UserRepository userRepository;
    private User loggedUser;


    public LoginService (Input input) {
        this.input = input;
        this.userRepository = UserRepository.getInstance();
    }


    public void requestLogin() {
         String username = input.getUsernameFromUser();
         String password = input.getPasswordFromUser();

         if (isValid(username) && isValid(password)) {
             User currentUser = userRepository.getUserByUsername(username);
             if (currentUser != null && currentUser.getPassword().equals(password)) {
                 loggedUser = currentUser;
             } else {
                 Input.showErrorWrongInputNameOrPassword();
             }
         }
    }

    private boolean isValid (String text) {
        return text != null && !text.isEmpty();
    }
}
