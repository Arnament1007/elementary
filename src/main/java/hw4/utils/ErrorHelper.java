package hw4.utils;

import entities.Client;
import exceptions.WrongFieldException;

public class ErrorHelper {

    Client client = new Client();


    private void Method1 (String recordAccId){
        if ( recordAccId.length() == 10 ){

        }else {
            WrongFieldException wrongFieldException = new WrongFieldException();
            wrongFieldException.wfe();
        }
    }
}
