import DataBase.UserRepository;

public class LoginService {

    private Input input;
    private UserRepository userRepository;


    public LoginService (Input input) {
        this.input = input;
        this.userRepository = UserRepository.getInstance();
        
    }


    public void requestLogin() {
         String username = input.getUsernameFromUser();
         String password = input.getPasswordFromUser();

         if (isValid(username) && isValid(password)) {
            userRepository.getUserByUsername(username);
         }
    }

    private boolean isValid (String text) {
        return text != null && !text.isEmpty();
    }
}
