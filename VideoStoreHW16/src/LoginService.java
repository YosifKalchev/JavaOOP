import DataBase.Admin;
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
         String loginEMail = input.getEMailFromUser();
         String password = input.getPasswordFromUser();

         if (isValid(loginEMail) && isValid(password)) {
             User currentUser = userRepository.getUserByEMail(loginEMail);
             if (currentUser != null && currentUser.getPassword().equals(password)) {
                 loggedUser = currentUser;
             } else {
                 Input.showErrorWrongLoginCredentials();
             }
         }
    }

    public boolean isUserLogged() {
        return loggedUser != null;
    }

    public boolean isUserAdmin() {
        return isUserLogged() && loggedUser instanceof Admin;
    }

    public void logout() {
        loggedUser = null;
    }

    private boolean isValid (String text) {
        return text != null && !text.isEmpty();
    }
}
