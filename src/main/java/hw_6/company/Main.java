package hw_6.company;

import exceptions.StringFormatException;
import utils.CheckHelper;
import utils.StringHelper;

public class Main {

    public static void main(String[] args) throws StringFormatException {

        StringHelper strHelp = new StringHelper();
        char[] chr = {'a', 'b', 'c', 'd'};
        strHelp.StringHelper("Привети", chr);

        CheckHelper checkHelper = new CheckHelper();
        checkHelper.checkUserNumber();
        checkHelper.checkUserEmail();
        checkHelper.checkUserDate();
    }
}

