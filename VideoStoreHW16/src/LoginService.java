public class LoginService {

    private Input input;
    public LoginService (Input input) {
        this.input = input;
    }


    public void requestLogin() {
         String username = input.getUsernameFromUser();
         String password = input.getPasswordFromUser();

         if (isValid(username) && isValid(password)) {

         }
    }

    private boolean isValid (String text) {
        return text != null && !text.isEmpty();
    }
}
