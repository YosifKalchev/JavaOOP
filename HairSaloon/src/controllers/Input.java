package controllers;

import constants.CustomerOption;
import constants.HairdresserOption;

public interface Input {

    String getEMailFromUser();
    String getPasswordFromUser();
    String getStringFromUser();

    void showErrorWrongLoginInput();

    void showHairdresserOptions();

    void showCustomerOptions();

    void showLoginMessage();

    HairdresserOption getHairdresserOptionFromUser();

    CustomerOption getCustomerOptionFromUser();


}

