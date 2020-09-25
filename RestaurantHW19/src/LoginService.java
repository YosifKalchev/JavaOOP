public class LoginService {

    private final UserRepository userRepository;
    public static User loggedUser;

    public LoginService () {

        this.userRepository = UserRepository.getInstance();
    }

    public static void setLoggedUser(User loggedUser) {
        LoginService.loggedUser = loggedUser;
        CurrentUser.setLoggedUser(loggedUser);
    }
}
