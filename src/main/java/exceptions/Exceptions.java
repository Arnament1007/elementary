package exceptions;

import enteties.Client;

import java.io.IOException;


public class Exceptions extends IOException {


    public void UserExpectedError() throws Exception {
        System.out.println("Неверный пользователь!");
    }

    public void WrongFieldException() throws Exception {
        System.out.println("Не тот ID! Повторите снова!");
    }

    public void WrongSumException() throws Exception {
        System.out.println("Размер не соотвецтвует!");
    }

    private boolean CheckUserExpectedError(String id) {
        Client idCheck = new Client();
        if (idCheck.GetID() == id) {
            return true;
        } else return false;
    }


}
