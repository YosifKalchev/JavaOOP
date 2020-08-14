public class Start {

    public static void main(String[] args) {

        LoginService loginService = new LoginService(new Console());
        loginService.requestLogin();
    }
}
