package controllers;

import constants.CustomerOption;
import constants.AdminOption;

public interface Input {

    String getEMailFromUser();
    String getPasswordFromUser();
    String getStringFromUser();
    int getNumberFromUser();
    double getDoubleFromUser();
    void showErrorWrongLoginInput();

    void showAdminOptions();

    void showCustomerOptions();

    void showLoginMessage();

    AdminOption getAdminOptionFromUser();

    CustomerOption getCustomerOptionFromUser();


}

